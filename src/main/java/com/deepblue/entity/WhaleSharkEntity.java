package com.deepblue.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.mob.WaterCreatureEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

public class WhaleSharkEntity extends BaseOceanEntity {
    public WhaleSharkEntity(EntityType<? extends WaterCreatureEntity> entityType, World world) {
        super(entityType, world);
    }

    public static DefaultAttributeContainer.Builder createAttributes() {
        return MobEntity.createMobAttributes()
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 80.0)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.5)
                .add(EntityAttributes.GENERIC_KNOCKBACK_RESISTANCE, 0.8);
    }

    @Override
    protected String getAnimationName() {
        return "whale_shark";
    }

    @Override
    public ActionResult interactMob(PlayerEntity player, Hand hand) {
        if (!this.hasPassengers()) {
            player.startRiding(this);
            return ActionResult.success(this.getWorld().isClient);
        }
        return super.interactMob(player, hand);
    }
}
