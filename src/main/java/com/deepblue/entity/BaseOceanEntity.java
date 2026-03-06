package com.deepblue.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.MovementType;
import net.minecraft.entity.ai.control.MoveControl;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.ai.pathing.EntityNavigation;
import net.minecraft.entity.ai.pathing.SwimNavigation;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.mob.WaterCreatureEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.registry.tag.FluidTags;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import software.bernie.geckolib.animatable.GeoEntity;
import software.bernie.geckolib.core.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.core.animation.*;
import software.bernie.geckolib.core.object.PlayState;
import software.bernie.geckolib.util.GeckoLibUtil;

public abstract class BaseOceanEntity extends WaterCreatureEntity implements GeoEntity {
    private final AnimatableInstanceCache cache = GeckoLibUtil.createInstanceCache(this);

    protected BaseOceanEntity(EntityType<? extends WaterCreatureEntity> entityType, World world) {
        super(entityType, world);
        this.moveControl = new FishMoveControl(this);
    }

    @Override
    protected EntityNavigation createNavigation(World world) {
        return new SwimNavigation(this, world);
    }

    @Override
    protected void initGoals() {
        this.goalSelector.add(0, new SwimToRandomPlaceGoal(this));
        this.goalSelector.add(1, new LookAroundGoal(this));
        this.goalSelector.add(2, new LookAtEntityGoal(this, PlayerEntity.class, 8.0f));
    }

    @Override
    public void travel(Vec3d movementInput) {
        if (this.isLogicalSideForUpdatingMovement() && this.isTouchingWater()) {
            this.updateVelocity(0.01F, movementInput);
            this.move(MovementType.SELF, this.getVelocity());
            this.setVelocity(this.getVelocity().multiply(0.9));
            if (this.getTarget() == null) {
                this.setVelocity(this.getVelocity().add(0.0, -0.005, 0.0));
            }
        } else {
            super.travel(movementInput);
        }
    }

    @Override
    public void tick() {
        super.tick();
        
        // Handle suffocation when out of water
        if (!this.isTouchingWater()) {
            // Decrease air
            int air = this.getAir();
            this.setAir(air - 1);
            
            // Take damage when air runs out
            if (this.getAir() <= -20) {
                this.setAir(0);
                this.damage(this.getDamageSources().dryOut(), 2.0F);
            }
            
            // Flop around on land
            if (this.isOnGround() && this.verticalCollision) {
                this.setVelocity(this.getVelocity().add(
                    (this.random.nextFloat() * 2.0F - 1.0F) * 0.05F,
                    0.4F,
                    (this.random.nextFloat() * 2.0F - 1.0F) * 0.05F
                ));
                this.setOnGround(false);
                this.velocityDirty = true;
                this.playSound(this.getFlopSound(), this.getSoundVolume(), this.getSoundPitch());
            }
        } else {
            // Restore air when in water
            this.setAir(this.getMaxAir());
        }
    }

    @Override
    public void tickMovement() {
        if (!this.isTouchingWater() && this.isOnGround() && this.verticalCollision) {
            this.setVelocity(this.getVelocity().add(
                (this.random.nextFloat() * 2.0F - 1.0F) * 0.05F,
                0.4F,
                (this.random.nextFloat() * 2.0F - 1.0F) * 0.05F
            ));
            this.setOnGround(false);
            this.velocityDirty = true;
        }
        super.tickMovement();
    }

    @Override
    public int getMaxAir() {
        return 600;
    }

    @Override
    public int getNextAirOnLand(int air) {
        return air - 1;
    }

    protected SoundEvent getFlopSound() {
        return SoundEvents.ENTITY_COD_FLOP;
    }

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllers) {
        controllers.add(new AnimationController<>(this, "controller", 5, this::predicate));
    }

    protected PlayState predicate(AnimationState<BaseOceanEntity> state) {
        String animName = "animation." + getAnimationName() + ".swim";
        state.getController().setAnimation(RawAnimation.begin().thenLoop(animName));
        return PlayState.CONTINUE;
    }

    protected abstract String getAnimationName();

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return cache;
    }

    static class FishMoveControl extends MoveControl {
        private final BaseOceanEntity fish;

        FishMoveControl(BaseOceanEntity fish) {
            super(fish);
            this.fish = fish;
        }

        @Override
        public void tick() {
            if (this.fish.isSubmergedIn(FluidTags.WATER)) {
                this.fish.setVelocity(this.fish.getVelocity().add(0.0, 0.005, 0.0));
            }

            if (this.state == MoveControl.State.MOVE_TO && !this.fish.getNavigation().isIdle()) {
                float speed = (float)(this.speed * this.fish.getAttributeValue(EntityAttributes.GENERIC_MOVEMENT_SPEED));
                this.fish.setMovementSpeed(MathHelper.lerp(0.125F, this.fish.getMovementSpeed(), speed));
                double dx = this.targetX - this.fish.getX();
                double dy = this.targetY - this.fish.getY();
                double dz = this.targetZ - this.fish.getZ();
                if (dy != 0.0) {
                    double dist = Math.sqrt(dx * dx + dy * dy + dz * dz);
                    this.fish.setVelocity(this.fish.getVelocity().add(0.0, (double)this.fish.getMovementSpeed() * (dy / dist) * 0.1, 0.0));
                }
                if (dx != 0.0 || dz != 0.0) {
                    float targetYaw = (float)(MathHelper.atan2(dz, dx) * 57.2957763671875) - 90.0F;
                    this.fish.setYaw(this.wrapDegrees(this.fish.getYaw(), targetYaw, 90.0F));
                    this.fish.bodyYaw = this.fish.getYaw();
                }
            } else {
                this.fish.setMovementSpeed(0.0F);
            }
        }
    }

    static class SwimToRandomPlaceGoal extends SwimAroundGoal {
        private final BaseOceanEntity fish;

        public SwimToRandomPlaceGoal(BaseOceanEntity fish) {
            super(fish, 1.0, 40);
            this.fish = fish;
        }

        @Override
        public boolean canStart() {
            return this.fish.isTouchingWater() && super.canStart();
        }
    }
}
