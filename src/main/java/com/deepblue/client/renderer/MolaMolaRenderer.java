package com.deepblue.client.renderer;

import com.deepblue.client.model.MolaMolaModel;
import com.deepblue.entity.MolaMolaEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class MolaMolaRenderer extends GeoEntityRenderer<MolaMolaEntity> {
    public MolaMolaRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new MolaMolaModel());
    }

    @Override
    public void render(MolaMolaEntity entity, float entityYaw, float partialTick, MatrixStack poseStack,
                       VertexConsumerProvider bufferSource, int packedLight) {
        poseStack.scale(1.0F, 1.0F, 1.0F);
        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}
