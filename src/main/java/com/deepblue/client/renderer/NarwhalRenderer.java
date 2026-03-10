package com.deepblue.client.renderer;

import com.deepblue.client.model.NarwhalModel;
import com.deepblue.entity.NarwhalEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class NarwhalRenderer extends GeoEntityRenderer<NarwhalEntity> {
    public NarwhalRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new NarwhalModel());
    }

    @Override
    public void render(NarwhalEntity entity, float entityYaw, float partialTick, MatrixStack poseStack,
                       VertexConsumerProvider bufferSource, int packedLight) {
        poseStack.scale(1.5F, 1.5F, 1.5F);
        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}
