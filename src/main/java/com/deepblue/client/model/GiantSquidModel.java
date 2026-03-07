package com.deepblue.client.model;

import com.deepblue.DeepBlueMod;
import com.deepblue.entity.GiantSquidEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class GiantSquidModel extends GeoModel<GiantSquidEntity> {
    @Override
    public Identifier getModelResource(GiantSquidEntity entity) {
        return Identifier.of(DeepBlueMod.MOD_ID, "geo/giant_squid.geo.json");
    }

    @Override
    public Identifier getTextureResource(GiantSquidEntity entity) {
        return Identifier.of(DeepBlueMod.MOD_ID, "textures/entity/giant_squid.png");
    }

    @Override
    public Identifier getAnimationResource(GiantSquidEntity entity) {
        return Identifier.of(DeepBlueMod.MOD_ID, "animations/giant_squid.animation.json");
    }
}
