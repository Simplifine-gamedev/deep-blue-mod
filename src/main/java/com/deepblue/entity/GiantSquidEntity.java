package com.deepblue.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.mob.WaterCreatureEntity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class GiantSquidEntity extends BaseOceanEntity {
    private float targetPitch = 0.0F;
    private float currentPitch = 0.0F;
    
    public GiantSquidEntity(EntityType<? extends WaterCreatureEntity> entityType, World world) {
        super(entityType, world);
    }

    public static DefaultAttributeContainer.Builder createAttributes() {
        return MobEntity.createMobAttributes()
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 80.0)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.7)
                .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 12.0)
                .add(EntityAttributes.GENERIC_ARMOR, 4.0);
    }
    
    @Override
    public void tick() {
        super.tick();
        
        if (this.isTouchingWater()) {
            Vec3d velocity = this.getVelocity();
            double horizontalSpeed = Math.sqrt(velocity.x * velocity.x + velocity.z * velocity.z);
            
            if (horizontalSpeed > 0.01 || Math.abs(velocity.y) > 0.01) {
                targetPitch = (float) (-Math.atan2(velocity.y, horizontalSpeed) * (180.0 / Math.PI));
                targetPitch = MathHelper.clamp(targetPitch, -60.0F, 60.0F);
            } else {
                targetPitch = 0.0F;
            }
            
            currentPitch = MathHelper.lerp(0.1F, currentPitch, targetPitch);
            this.setPitch(currentPitch);
        }
    }

    @Override
    protected String getAnimationName() {
        return "giant_squid";
    }
}
