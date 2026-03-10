package com.deepblue.client.renderer;

import com.deepblue.client.model.GreatWhiteSharkModel;
import com.deepblue.entity.GreatWhiteSharkEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class GreatWhiteSharkRenderer extends GeoEntityRenderer<GreatWhiteSharkEntity> {
    public GreatWhiteSharkRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new GreatWhiteSharkModel());
    }

    @Override
    public void render(GreatWhiteSharkEntity entity, float entityYaw, float partialTick, MatrixStack poseStack,
                       VertexConsumerProvider bufferSource, int packedLight) {
        poseStack.scale(2.2F, 2.2F, 2.2F);
        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}
