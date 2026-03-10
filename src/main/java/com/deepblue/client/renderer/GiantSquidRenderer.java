package com.deepblue.client.renderer;

import com.deepblue.client.model.GiantSquidModel;
import com.deepblue.entity.GiantSquidEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class GiantSquidRenderer extends GeoEntityRenderer<GiantSquidEntity> {
    public GiantSquidRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new GiantSquidModel());
    }

    @Override
    public void render(GiantSquidEntity entity, float entityYaw, float partialTick, MatrixStack poseStack,
                       VertexConsumerProvider bufferSource, int packedLight) {
        poseStack.scale(2.5F, 2.5F, 2.5F);
        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}
