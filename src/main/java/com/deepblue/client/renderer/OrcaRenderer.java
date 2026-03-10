package com.deepblue.client.renderer;

import com.deepblue.client.model.OrcaModel;
import com.deepblue.entity.OrcaEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class OrcaRenderer extends GeoEntityRenderer<OrcaEntity> {
    public OrcaRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new OrcaModel());
    }

    @Override
    public void render(OrcaEntity entity, float entityYaw, float partialTick, MatrixStack poseStack,
                       VertexConsumerProvider bufferSource, int packedLight) {
        poseStack.scale(2.0F, 2.0F, 2.0F);
        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}
