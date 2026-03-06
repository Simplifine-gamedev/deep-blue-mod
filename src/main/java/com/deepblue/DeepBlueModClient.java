package com.deepblue;

import com.deepblue.client.model.*;
import com.deepblue.client.renderer.*;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

@Environment(EnvType.CLIENT)
public class DeepBlueModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        // Register entity renderers
        EntityRendererRegistry.register(DeepBlueMod.HUMPBACK_WHALE, HumpbackWhaleRenderer::new);
        EntityRendererRegistry.register(DeepBlueMod.BLUE_WHALE, BlueWhaleRenderer::new);
        EntityRendererRegistry.register(DeepBlueMod.ORCA, OrcaRenderer::new);
        EntityRendererRegistry.register(DeepBlueMod.GREAT_WHITE_SHARK, GreatWhiteSharkRenderer::new);
        EntityRendererRegistry.register(DeepBlueMod.HAMMERHEAD_SHARK, HammerheadSharkRenderer::new);
        EntityRendererRegistry.register(DeepBlueMod.WHALE_SHARK, WhaleSharkRenderer::new);
        EntityRendererRegistry.register(DeepBlueMod.NARWHAL, NarwhalRenderer::new);
        EntityRendererRegistry.register(DeepBlueMod.GIANT_SQUID, GiantSquidRenderer::new);
        EntityRendererRegistry.register(DeepBlueMod.MOLA_MOLA, MolaMolaRenderer::new);
        EntityRendererRegistry.register(DeepBlueMod.SWORDFISH, SwordfishRenderer::new);
    }
}
