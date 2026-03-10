package com.deepblue.client.renderer;

import com.deepblue.client.model.BlueWhaleModel;
import com.deepblue.entity.BlueWhaleEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class BlueWhaleRenderer extends GeoEntityRenderer<BlueWhaleEntity> {
    public BlueWhaleRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new BlueWhaleModel());
    }

    @Override
    public void render(BlueWhaleEntity entity, float entityYaw, float partialTick, MatrixStack poseStack,
                       VertexConsumerProvider bufferSource, int packedLight) {
        poseStack.scale(4.0F, 4.0F, 4.0F);
        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}
