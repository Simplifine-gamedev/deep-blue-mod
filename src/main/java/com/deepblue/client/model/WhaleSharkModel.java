package com.deepblue.client.model;

import com.deepblue.DeepBlueMod;
import com.deepblue.entity.WhaleSharkEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class WhaleSharkModel extends GeoModel<WhaleSharkEntity> {
    @Override
    public Identifier getModelResource(WhaleSharkEntity entity) {
        return new Identifier(DeepBlueMod.MOD_ID, "geo/whale_shark.geo.json");
    }

    @Override
    public Identifier getTextureResource(WhaleSharkEntity entity) {
        return new Identifier(DeepBlueMod.MOD_ID, "textures/entity/whale_shark.png");
    }

    @Override
    public Identifier getAnimationResource(WhaleSharkEntity entity) {
        return new Identifier(DeepBlueMod.MOD_ID, "animations/whale_shark.animation.json");
    }
}
