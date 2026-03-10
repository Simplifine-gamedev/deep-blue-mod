package com.deepblue.client.renderer;

import com.deepblue.client.model.HumpbackWhaleModel;
import com.deepblue.entity.HumpbackWhaleEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class HumpbackWhaleRenderer extends GeoEntityRenderer<HumpbackWhaleEntity> {
    public HumpbackWhaleRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new HumpbackWhaleModel());
    }

    @Override
    public void render(HumpbackWhaleEntity entity, float entityYaw, float partialTick, MatrixStack poseStack,
                       VertexConsumerProvider bufferSource, int packedLight) {
        poseStack.scale(3.0F, 3.0F, 3.0F);
        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}
