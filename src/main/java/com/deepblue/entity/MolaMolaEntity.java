package com.deepblue.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.mob.WaterCreatureEntity;
import net.minecraft.world.World;

public class MolaMolaEntity extends BaseOceanEntity {
    public MolaMolaEntity(EntityType<? extends WaterCreatureEntity> entityType, World world) {
        super(entityType, world);
    }

    public static DefaultAttributeContainer.Builder createAttributes() {
        return MobEntity.createMobAttributes()
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 25.0)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.4);
    }

    @Override
    protected String getAnimationName() {
        return "mola";
    }
}
