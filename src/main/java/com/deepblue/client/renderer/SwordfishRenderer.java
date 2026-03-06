package com.deepblue.client.renderer;

import com.deepblue.client.model.SwordfishModel;
import com.deepblue.entity.SwordfishEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class SwordfishRenderer extends GeoEntityRenderer<SwordfishEntity> {
    public SwordfishRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new SwordfishModel());
    }

    @Override
    public void render(SwordfishEntity entity, float entityYaw, float partialTick, MatrixStack poseStack,
                       VertexConsumerProvider bufferSource, int packedLight) {
        poseStack.scale(1.0F, 1.0F, 1.0F);
        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}
