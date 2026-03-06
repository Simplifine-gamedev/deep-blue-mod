package com.deepblue.client.model;

import com.deepblue.DeepBlueMod;
import com.deepblue.entity.NarwhalEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class NarwhalModel extends GeoModel<NarwhalEntity> {
    @Override
    public Identifier getModelResource(NarwhalEntity entity) {
        return new Identifier(DeepBlueMod.MOD_ID, "geo/narwhal.geo.json");
    }

    @Override
    public Identifier getTextureResource(NarwhalEntity entity) {
        return new Identifier(DeepBlueMod.MOD_ID, "textures/entity/narwhal.png");
    }

    @Override
    public Identifier getAnimationResource(NarwhalEntity entity) {
        return new Identifier(DeepBlueMod.MOD_ID, "animations/narwhal.animation.json");
    }
}
