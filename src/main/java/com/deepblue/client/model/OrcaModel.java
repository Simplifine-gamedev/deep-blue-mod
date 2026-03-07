package com.deepblue.client.model;

import com.deepblue.DeepBlueMod;
import com.deepblue.entity.OrcaEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class OrcaModel extends GeoModel<OrcaEntity> {
    @Override
    public Identifier getModelResource(OrcaEntity entity) {
        return Identifier.of(DeepBlueMod.MOD_ID, "geo/orca.geo.json");
    }

    @Override
    public Identifier getTextureResource(OrcaEntity entity) {
        return Identifier.of(DeepBlueMod.MOD_ID, "textures/entity/orca.png");
    }

    @Override
    public Identifier getAnimationResource(OrcaEntity entity) {
        return Identifier.of(DeepBlueMod.MOD_ID, "animations/orca.animation.json");
    }
}
