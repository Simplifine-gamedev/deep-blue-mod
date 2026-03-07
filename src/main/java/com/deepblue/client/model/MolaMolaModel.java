package com.deepblue.client.model;

import com.deepblue.DeepBlueMod;
import com.deepblue.entity.MolaMolaEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class MolaMolaModel extends GeoModel<MolaMolaEntity> {
    @Override
    public Identifier getModelResource(MolaMolaEntity entity) {
        return Identifier.of(DeepBlueMod.MOD_ID, "geo/mola_mola.geo.json");
    }

    @Override
    public Identifier getTextureResource(MolaMolaEntity entity) {
        return Identifier.of(DeepBlueMod.MOD_ID, "textures/entity/mola_mola.png");
    }

    @Override
    public Identifier getAnimationResource(MolaMolaEntity entity) {
        return Identifier.of(DeepBlueMod.MOD_ID, "animations/mola_mola.animation.json");
    }
}
