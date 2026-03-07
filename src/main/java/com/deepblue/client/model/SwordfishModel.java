package com.deepblue.client.model;

import com.deepblue.DeepBlueMod;
import com.deepblue.entity.SwordfishEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class SwordfishModel extends GeoModel<SwordfishEntity> {
    @Override
    public Identifier getModelResource(SwordfishEntity entity) {
        return Identifier.of(DeepBlueMod.MOD_ID, "geo/swordfish.geo.json");
    }

    @Override
    public Identifier getTextureResource(SwordfishEntity entity) {
        return Identifier.of(DeepBlueMod.MOD_ID, "textures/entity/swordfish.png");
    }

    @Override
    public Identifier getAnimationResource(SwordfishEntity entity) {
        return Identifier.of(DeepBlueMod.MOD_ID, "animations/swordfish.animation.json");
    }
}
