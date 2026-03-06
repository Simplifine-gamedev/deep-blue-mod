package com.deepblue.client.model;

import com.deepblue.DeepBlueMod;
import com.deepblue.entity.HammerheadSharkEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class HammerheadSharkModel extends GeoModel<HammerheadSharkEntity> {
    @Override
    public Identifier getModelResource(HammerheadSharkEntity entity) {
        return new Identifier(DeepBlueMod.MOD_ID, "geo/hammerhead_shark.geo.json");
    }

    @Override
    public Identifier getTextureResource(HammerheadSharkEntity entity) {
        return new Identifier(DeepBlueMod.MOD_ID, "textures/entity/hammerhead_shark.png");
    }

    @Override
    public Identifier getAnimationResource(HammerheadSharkEntity entity) {
        return new Identifier(DeepBlueMod.MOD_ID, "animations/hammerhead_shark.animation.json");
    }
}
