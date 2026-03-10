package com.deepblue;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterials;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    // Custom loot items
    public static Item WHALE_MEAT;
    public static Item COOKED_WHALE_MEAT;
    public static Item SHARK_FIN;
    public static Item SHARK_TOOTH;
    public static Item SQUID_TENTACLE;
    public static Item NARWHAL_TUSK;
    public static Item WHALE_BLUBBER;
    public static Item SWORDFISH_BILL;
    public static Item RAW_FISH_FILLET;
    public static Item COOKED_FISH_FILLET;
    public static Item SUNFISH_MEAT;
    public static Item COOKED_SQUID_TENTACLE;
    public static Item SHARK_FIN_SOUP;
    public static Item SHARK_TOOTH_DAGGER;
    public static Item NARWHAL_SPEAR;
    public static Item SWORDFISH_RAPIER;

    // Spawn eggs
    public static Item HUMPBACK_WHALE_SPAWN_EGG;
    public static Item BLUE_WHALE_SPAWN_EGG;
    public static Item ORCA_SPAWN_EGG;
    public static Item GREAT_WHITE_SHARK_SPAWN_EGG;
    public static Item HAMMERHEAD_SHARK_SPAWN_EGG;
    public static Item WHALE_SHARK_SPAWN_EGG;
    public static Item NARWHAL_SPAWN_EGG;
    public static Item GIANT_SQUID_SPAWN_EGG;
    public static Item MOLA_MOLA_SPAWN_EGG;
    public static Item SWORDFISH_SPAWN_EGG;

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(DeepBlueMod.MOD_ID, name), item);
    }

    private static Item registerSpawnEgg(String name, EntityType<? extends MobEntity> entityType, int primaryColor, int secondaryColor) {
        Item egg = new SpawnEggItem(entityType, primaryColor, secondaryColor, new Item.Settings());
        return Registry.register(Registries.ITEM, new Identifier(DeepBlueMod.MOD_ID, name), egg);
    }

    public static void registerModItems() {
        // Register custom loot items
        WHALE_MEAT = registerItem("whale_meat", new Item(new Item.Settings()
                .food(new FoodComponent.Builder().hunger(4).saturationModifier(0.3f).meat().build())));
        COOKED_WHALE_MEAT = registerItem("cooked_whale_meat", new Item(new Item.Settings()
                .food(new FoodComponent.Builder().hunger(8).saturationModifier(0.8f).meat().build())));
        SHARK_FIN = registerItem("shark_fin", new Item(new Item.Settings()));
        SHARK_TOOTH = registerItem("shark_tooth", new Item(new Item.Settings()));
        SQUID_TENTACLE = registerItem("squid_tentacle", new Item(new Item.Settings()
                .food(new FoodComponent.Builder().hunger(3).saturationModifier(0.2f).build())));
        NARWHAL_TUSK = registerItem("narwhal_tusk", new Item(new Item.Settings()));
        WHALE_BLUBBER = registerItem("whale_blubber", new Item(new Item.Settings()));
        SWORDFISH_BILL = registerItem("swordfish_bill", new Item(new Item.Settings()));
        RAW_FISH_FILLET = registerItem("raw_fish_fillet", new Item(new Item.Settings()
                .food(new FoodComponent.Builder().hunger(2).saturationModifier(0.1f).build())));
        COOKED_FISH_FILLET = registerItem("cooked_fish_fillet", new Item(new Item.Settings()
                .food(new FoodComponent.Builder().hunger(6).saturationModifier(0.6f).build())));
        SUNFISH_MEAT = registerItem("sunfish_meat", new Item(new Item.Settings()
                .food(new FoodComponent.Builder().hunger(3).saturationModifier(0.2f).build())));
        
        // Cooked squid tentacle - better than raw
        COOKED_SQUID_TENTACLE = registerItem("cooked_squid_tentacle", new Item(new Item.Settings()
                .food(new FoodComponent.Builder().hunger(6).saturationModifier(0.6f).build())));
        
        // Shark fin soup - gives water breathing
        SHARK_FIN_SOUP = registerItem("shark_fin_soup", new Item(new Item.Settings()
                .food(new FoodComponent.Builder()
                        .hunger(8)
                        .saturationModifier(0.8f)
                        .statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 6000, 0), 1.0f)
                        .statusEffect(new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE, 3000, 0), 1.0f)
                        .build())
                .maxCount(16)));
        
        // Shark tooth dagger - fast attack, low damage
        SHARK_TOOTH_DAGGER = registerItem("shark_tooth_dagger", 
                new SwordItem(ToolMaterials.IRON, 2, -1.4f, new Item.Settings()));
        
        // Narwhal spear - high damage, slow
        NARWHAL_SPEAR = registerItem("narwhal_spear",
                new SwordItem(ToolMaterials.DIAMOND, 5, -3.0f, new Item.Settings()));
        
        // Swordfish rapier - medium damage, very fast
        SWORDFISH_RAPIER = registerItem("swordfish_rapier",
                new SwordItem(ToolMaterials.IRON, 3, -1.0f, new Item.Settings()));

        // Register spawn eggs
        HUMPBACK_WHALE_SPAWN_EGG = registerSpawnEgg("humpback_whale_spawn_egg", DeepBlueMod.HUMPBACK_WHALE, 0x3C464F, 0x5A6A7A);
        BLUE_WHALE_SPAWN_EGG = registerSpawnEgg("blue_whale_spawn_egg", DeepBlueMod.BLUE_WHALE, 0x465A78, 0x6A8AAA);
        ORCA_SPAWN_EGG = registerSpawnEgg("orca_spawn_egg", DeepBlueMod.ORCA, 0x141419, 0xFFFFFF);
        GREAT_WHITE_SHARK_SPAWN_EGG = registerSpawnEgg("great_white_shark_spawn_egg", DeepBlueMod.GREAT_WHITE_SHARK, 0x646973, 0xA0A5AF);
        HAMMERHEAD_SHARK_SPAWN_EGG = registerSpawnEgg("hammerhead_shark_spawn_egg", DeepBlueMod.HAMMERHEAD_SHARK, 0x5A5F69, 0x8A8F99);
        WHALE_SHARK_SPAWN_EGG = registerSpawnEgg("whale_shark_spawn_egg", DeepBlueMod.WHALE_SHARK, 0x464B55, 0xDCE1EB);
        NARWHAL_SPAWN_EGG = registerSpawnEgg("narwhal_spawn_egg", DeepBlueMod.NARWHAL, 0x787D87, 0xF0F0E0);
        GIANT_SQUID_SPAWN_EGG = registerSpawnEgg("giant_squid_spawn_egg", DeepBlueMod.GIANT_SQUID, 0xA04650, 0xE6B4BE);
        MOLA_MOLA_SPAWN_EGG = registerSpawnEgg("mola_mola_spawn_egg", DeepBlueMod.MOLA_MOLA, 0x8C919B, 0xBEC3CD);
        SWORDFISH_SPAWN_EGG = registerSpawnEgg("swordfish_spawn_egg", DeepBlueMod.SWORDFISH, 0x2D3755, 0xB4B9C3);

        // Add spawn eggs to creative tab
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.SPAWN_EGGS).register(entries -> {
            entries.add(HUMPBACK_WHALE_SPAWN_EGG);
            entries.add(BLUE_WHALE_SPAWN_EGG);
            entries.add(ORCA_SPAWN_EGG);
            entries.add(GREAT_WHITE_SHARK_SPAWN_EGG);
            entries.add(HAMMERHEAD_SHARK_SPAWN_EGG);
            entries.add(WHALE_SHARK_SPAWN_EGG);
            entries.add(NARWHAL_SPAWN_EGG);
            entries.add(GIANT_SQUID_SPAWN_EGG);
            entries.add(MOLA_MOLA_SPAWN_EGG);
            entries.add(SWORDFISH_SPAWN_EGG);
        });

        // Add loot items to ingredients tab
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(WHALE_MEAT);
            entries.add(COOKED_WHALE_MEAT);
            entries.add(SHARK_FIN);
            entries.add(SHARK_TOOTH);
            entries.add(SQUID_TENTACLE);
            entries.add(NARWHAL_TUSK);
            entries.add(WHALE_BLUBBER);
            entries.add(SWORDFISH_BILL);
            entries.add(RAW_FISH_FILLET);
            entries.add(COOKED_FISH_FILLET);
            entries.add(SUNFISH_MEAT);
            entries.add(COOKED_SQUID_TENTACLE);
            entries.add(SHARK_FIN_SOUP);
        });
        
        // Add weapons to combat tab
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> {
            entries.add(SHARK_TOOTH_DAGGER);
            entries.add(NARWHAL_SPEAR);
            entries.add(SWORDFISH_RAPIER);
        });
    }
}
