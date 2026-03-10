package com.deepblue.client.model;

import com.deepblue.DeepBlueMod;
import com.deepblue.entity.GreatWhiteSharkEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class GreatWhiteSharkModel extends GeoModel<GreatWhiteSharkEntity> {
    @Override
    public Identifier getModelResource(GreatWhiteSharkEntity entity) {
        return new Identifier(DeepBlueMod.MOD_ID, "geo/great_white_shark.geo.json");
    }

    @Override
    public Identifier getTextureResource(GreatWhiteSharkEntity entity) {
        return new Identifier(DeepBlueMod.MOD_ID, "textures/entity/great_white_shark.png");
    }

    @Override
    public Identifier getAnimationResource(GreatWhiteSharkEntity entity) {
        return new Identifier(DeepBlueMod.MOD_ID, "animations/great_white_shark.animation.json");
    }
}
