package com.deepblue.client.renderer;

import com.deepblue.client.model.HammerheadSharkModel;
import com.deepblue.entity.HammerheadSharkEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class HammerheadSharkRenderer extends GeoEntityRenderer<HammerheadSharkEntity> {
    public HammerheadSharkRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new HammerheadSharkModel());
    }

    @Override
    public void render(HammerheadSharkEntity entity, float entityYaw, float partialTick, MatrixStack poseStack,
                       VertexConsumerProvider bufferSource, int packedLight) {
        poseStack.scale(1.2F, 1.2F, 1.2F);
        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}
