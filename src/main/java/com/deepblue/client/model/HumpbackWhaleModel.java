package com.deepblue.client.model;

import com.deepblue.DeepBlueMod;
import com.deepblue.entity.HumpbackWhaleEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class HumpbackWhaleModel extends GeoModel<HumpbackWhaleEntity> {
    @Override
    public Identifier getModelResource(HumpbackWhaleEntity entity) {
        return new Identifier(DeepBlueMod.MOD_ID, "geo/humpback_whale.geo.json");
    }

    @Override
    public Identifier getTextureResource(HumpbackWhaleEntity entity) {
        return new Identifier(DeepBlueMod.MOD_ID, "textures/entity/humpback_whale.png");
    }

    @Override
    public Identifier getAnimationResource(HumpbackWhaleEntity entity) {
        return new Identifier(DeepBlueMod.MOD_ID, "animations/humpback_whale.animation.json");
    }
}
