package com.deepblue;

import com.deepblue.entity.*;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.SpawnRestriction;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.Heightmap;
import net.minecraft.world.biome.BiomeKeys;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import software.bernie.geckolib.GeckoLib;

public class DeepBlueMod implements ModInitializer {
    public static final String MOD_ID = "deepblue";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    // Entity Types
    public static final EntityType<HumpbackWhaleEntity> HUMPBACK_WHALE = Registry.register(
            Registries.ENTITY_TYPE,
            new Identifier(MOD_ID, "humpback_whale"),
            FabricEntityTypeBuilder.create(SpawnGroup.WATER_CREATURE, HumpbackWhaleEntity::new)
                    .dimensions(EntityDimensions.fixed(4.0f, 2.5f))
                    .trackRangeChunks(10)
                    .build()
    );

    public static final EntityType<BlueWhaleEntity> BLUE_WHALE = Registry.register(
            Registries.ENTITY_TYPE,
            new Identifier(MOD_ID, "blue_whale"),
            FabricEntityTypeBuilder.create(SpawnGroup.WATER_CREATURE, BlueWhaleEntity::new)
                    .dimensions(EntityDimensions.fixed(6.0f, 3.0f))
                    .trackRangeChunks(12)
                    .build()
    );

    public static final EntityType<OrcaEntity> ORCA = Registry.register(
            Registries.ENTITY_TYPE,
            new Identifier(MOD_ID, "orca"),
            FabricEntityTypeBuilder.create(SpawnGroup.WATER_CREATURE, OrcaEntity::new)
                    .dimensions(EntityDimensions.fixed(2.5f, 1.5f))
                    .trackRangeChunks(8)
                    .build()
    );

    public static final EntityType<GreatWhiteSharkEntity> GREAT_WHITE_SHARK = Registry.register(
            Registries.ENTITY_TYPE,
            new Identifier(MOD_ID, "great_white_shark"),
            FabricEntityTypeBuilder.create(SpawnGroup.WATER_CREATURE, GreatWhiteSharkEntity::new)
                    .dimensions(EntityDimensions.fixed(2.0f, 1.2f))
                    .trackRangeChunks(8)
                    .build()
    );

    public static final EntityType<HammerheadSharkEntity> HAMMERHEAD_SHARK = Registry.register(
            Registries.ENTITY_TYPE,
            new Identifier(MOD_ID, "hammerhead_shark"),
            FabricEntityTypeBuilder.create(SpawnGroup.WATER_CREATURE, HammerheadSharkEntity::new)
                    .dimensions(EntityDimensions.fixed(1.8f, 1.0f))
                    .trackRangeChunks(8)
                    .build()
    );

    public static final EntityType<WhaleSharkEntity> WHALE_SHARK = Registry.register(
            Registries.ENTITY_TYPE,
            new Identifier(MOD_ID, "whale_shark"),
            FabricEntityTypeBuilder.create(SpawnGroup.WATER_CREATURE, WhaleSharkEntity::new)
                    .dimensions(EntityDimensions.fixed(3.5f, 2.0f))
                    .trackRangeChunks(10)
                    .build()
    );

    public static final EntityType<NarwhalEntity> NARWHAL = Registry.register(
            Registries.ENTITY_TYPE,
            new Identifier(MOD_ID, "narwhal"),
            FabricEntityTypeBuilder.create(SpawnGroup.WATER_CREATURE, NarwhalEntity::new)
                    .dimensions(EntityDimensions.fixed(2.0f, 1.0f))
                    .trackRangeChunks(8)
                    .build()
    );

    public static final EntityType<GiantSquidEntity> GIANT_SQUID = Registry.register(
            Registries.ENTITY_TYPE,
            new Identifier(MOD_ID, "giant_squid"),
            FabricEntityTypeBuilder.create(SpawnGroup.WATER_CREATURE, GiantSquidEntity::new)
                    .dimensions(EntityDimensions.fixed(2.5f, 4.0f))
                    .trackRangeChunks(10)
                    .build()
    );

    public static final EntityType<MolaMolaEntity> MOLA_MOLA = Registry.register(
            Registries.ENTITY_TYPE,
            new Identifier(MOD_ID, "mola_mola"),
            FabricEntityTypeBuilder.create(SpawnGroup.WATER_CREATURE, MolaMolaEntity::new)
                    .dimensions(EntityDimensions.fixed(2.0f, 2.5f))
                    .trackRangeChunks(8)
                    .build()
    );

    public static final EntityType<SwordfishEntity> SWORDFISH = Registry.register(
            Registries.ENTITY_TYPE,
            new Identifier(MOD_ID, "swordfish"),
            FabricEntityTypeBuilder.create(SpawnGroup.WATER_CREATURE, SwordfishEntity::new)
                    .dimensions(EntityDimensions.fixed(1.5f, 0.8f))
                    .trackRangeChunks(8)
                    .build()
    );

    @Override
    public void onInitialize() {
        LOGGER.info("Deep Blue - Ocean Megafauna loading...");
        
        GeckoLib.initialize();
        
        // Register spawn egg items
        ModItems.registerModItems();

        // Register whale blubber as fuel (burns 8 items like coal)
        net.fabricmc.fabric.api.registry.FuelRegistry.INSTANCE.add(ModItems.WHALE_BLUBBER, 1600);

        // Register entity attributes
        FabricDefaultAttributeRegistry.register(HUMPBACK_WHALE, HumpbackWhaleEntity.createAttributes());
        FabricDefaultAttributeRegistry.register(BLUE_WHALE, BlueWhaleEntity.createAttributes());
        FabricDefaultAttributeRegistry.register(ORCA, OrcaEntity.createAttributes());
        FabricDefaultAttributeRegistry.register(GREAT_WHITE_SHARK, GreatWhiteSharkEntity.createAttributes());
        FabricDefaultAttributeRegistry.register(HAMMERHEAD_SHARK, HammerheadSharkEntity.createAttributes());
        FabricDefaultAttributeRegistry.register(WHALE_SHARK, WhaleSharkEntity.createAttributes());
        FabricDefaultAttributeRegistry.register(NARWHAL, NarwhalEntity.createAttributes());
        FabricDefaultAttributeRegistry.register(GIANT_SQUID, GiantSquidEntity.createAttributes());
        FabricDefaultAttributeRegistry.register(MOLA_MOLA, MolaMolaEntity.createAttributes());
        FabricDefaultAttributeRegistry.register(SWORDFISH, SwordfishEntity.createAttributes());

        // Add spawns to ocean biomes
        registerSpawns();

        LOGGER.info("Deep Blue - Ocean Megafauna loaded!");
    }

    private void registerSpawns() {
        // Whales in deep ocean
        BiomeModifications.addSpawn(
                BiomeSelectors.includeByKey(BiomeKeys.DEEP_OCEAN, BiomeKeys.DEEP_COLD_OCEAN, BiomeKeys.DEEP_LUKEWARM_OCEAN),
                SpawnGroup.WATER_CREATURE, HUMPBACK_WHALE, 5, 1, 2
        );
        BiomeModifications.addSpawn(
                BiomeSelectors.includeByKey(BiomeKeys.DEEP_OCEAN, BiomeKeys.DEEP_COLD_OCEAN),
                SpawnGroup.WATER_CREATURE, BLUE_WHALE, 3, 1, 1
        );

        // Orcas in cold waters
        BiomeModifications.addSpawn(
                BiomeSelectors.includeByKey(BiomeKeys.COLD_OCEAN, BiomeKeys.DEEP_COLD_OCEAN, BiomeKeys.FROZEN_OCEAN),
                SpawnGroup.WATER_CREATURE, ORCA, 8, 2, 5
        );

        // Sharks in warm/lukewarm oceans
        BiomeModifications.addSpawn(
                BiomeSelectors.includeByKey(BiomeKeys.OCEAN, BiomeKeys.DEEP_OCEAN, BiomeKeys.LUKEWARM_OCEAN),
                SpawnGroup.WATER_CREATURE, GREAT_WHITE_SHARK, 6, 1, 2
        );
        BiomeModifications.addSpawn(
                BiomeSelectors.includeByKey(BiomeKeys.WARM_OCEAN, BiomeKeys.LUKEWARM_OCEAN),
                SpawnGroup.WATER_CREATURE, HAMMERHEAD_SHARK, 8, 2, 4
        );

        // Whale shark in warm waters
        BiomeModifications.addSpawn(
                BiomeSelectors.includeByKey(BiomeKeys.WARM_OCEAN, BiomeKeys.LUKEWARM_OCEAN, BiomeKeys.DEEP_LUKEWARM_OCEAN),
                SpawnGroup.WATER_CREATURE, WHALE_SHARK, 4, 1, 1
        );

        // Narwhal in frozen ocean
        BiomeModifications.addSpawn(
                BiomeSelectors.includeByKey(BiomeKeys.FROZEN_OCEAN, BiomeKeys.DEEP_FROZEN_OCEAN),
                SpawnGroup.WATER_CREATURE, NARWHAL, 10, 3, 6
        );

        // Giant squid in deep ocean (rare)
        BiomeModifications.addSpawn(
                BiomeSelectors.includeByKey(BiomeKeys.DEEP_OCEAN, BiomeKeys.DEEP_COLD_OCEAN, BiomeKeys.DEEP_FROZEN_OCEAN),
                SpawnGroup.WATER_CREATURE, GIANT_SQUID, 2, 1, 1
        );

        // Mola mola in temperate waters
        BiomeModifications.addSpawn(
                BiomeSelectors.includeByKey(BiomeKeys.OCEAN, BiomeKeys.LUKEWARM_OCEAN, BiomeKeys.DEEP_OCEAN),
                SpawnGroup.WATER_CREATURE, MOLA_MOLA, 6, 1, 2
        );

        // Swordfish in warm/lukewarm
        BiomeModifications.addSpawn(
                BiomeSelectors.includeByKey(BiomeKeys.WARM_OCEAN, BiomeKeys.LUKEWARM_OCEAN, BiomeKeys.DEEP_LUKEWARM_OCEAN),
                SpawnGroup.WATER_CREATURE, SWORDFISH, 10, 1, 3
        );
    }
}
