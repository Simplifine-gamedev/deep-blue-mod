package com.deepblue.client.model;

import com.deepblue.DeepBlueMod;
import com.deepblue.entity.BlueWhaleEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class BlueWhaleModel extends GeoModel<BlueWhaleEntity> {
    @Override
    public Identifier getModelResource(BlueWhaleEntity entity) {
        return new Identifier(DeepBlueMod.MOD_ID, "geo/blue_whale.geo.json");
    }

    @Override
    public Identifier getTextureResource(BlueWhaleEntity entity) {
        return new Identifier(DeepBlueMod.MOD_ID, "textures/entity/blue_whale.png");
    }

    @Override
    public Identifier getAnimationResource(BlueWhaleEntity entity) {
        return new Identifier(DeepBlueMod.MOD_ID, "animations/blue_whale.animation.json");
    }
}
