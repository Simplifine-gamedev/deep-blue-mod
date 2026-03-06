package com.deepblue.client.renderer;

import com.deepblue.client.model.WhaleSharkModel;
import com.deepblue.entity.WhaleSharkEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class WhaleSharkRenderer extends GeoEntityRenderer<WhaleSharkEntity> {
    public WhaleSharkRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new WhaleSharkModel());
    }

    @Override
    public void render(WhaleSharkEntity entity, float entityYaw, float partialTick, MatrixStack poseStack,
                       VertexConsumerProvider bufferSource, int packedLight) {
        poseStack.scale(2.5F, 2.5F, 2.5F);
        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}
