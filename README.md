# Deep Blue - Ocean Megafauna Mod

A Minecraft mod that adds majestic ocean creatures to the game, bringing the deep blue seas to life with whales, sharks, giant squid, and more!

<p align="center">
  <img src="screenshots/giant_squid.png" width="400" alt="Giant Squid">
  <img src="screenshots/humpback_whale.png" width="400" alt="Humpback Whale">
</p>

## Downloads

Pre-built releases are available in the `releases/` folder:

### Minecraft 1.21.1 (Recommended)
| Mod Loader | Download | Status |
|------------|----------|--------|
| **Fabric** | [deep-blue-fabric-1.21.1-1.0.0.jar](releases/1.21.1/deep-blue-fabric-1.21.1-1.0.0.jar) | Stable |
| **NeoForge** | [deep-blue-neoforge-1.21.1-1.0.0.jar](releases/1.21.1/deep-blue-neoforge-1.21.1-1.0.0.jar) | Stable |

### Version Support
| Version | Fabric | NeoForge | Forge | Status |
|---------|--------|----------|-------|--------|
| **1.21.1** | Yes | Yes | - | **Recommended** |
| 1.20.4 | Yes | Yes | - | Supported |
| 1.20.1 | Yes | - | Yes | Supported |

---

## Creatures

### 10 New Ocean Mobs

| Creature | Health | Attack | Speed | Size | Behavior |
|----------|--------|--------|-------|------|----------|
| **Blue Whale** | 150 | - | Slow | 6.0 x 3.0 | Passive, largest mob |
| **Humpback Whale** | 100 | - | Medium | 4.0 x 2.5 | Passive, breaching |
| **Giant Squid** | 80 | 12 | Medium | 2.5 x 4.0 | Hostile, mini-boss |
| **Whale Shark** | 80 | - | Slow | 3.5 x 2.0 | Passive, rideable |
| **Orca** | 60 | 8 | Fast | 2.5 x 1.5 | Neutral, pack hunter |
| **Great White Shark** | 40 | 10 | Fast | 2.0 x 1.2 | Hostile |
| **Narwhal** | 35 | 5 | Medium | 2.0 x 1.0 | Neutral |
| **Hammerhead Shark** | 30 | 6 | Fast | 1.8 x 1.0 | Hostile |
| **Ocean Sunfish** | 25 | - | Slow | 2.0 x 2.5 | Passive |
| **Swordfish** | 20 | 4 | Very Fast | 1.5 x 0.8 | Neutral |

### Spawn Locations

| Creature | Biomes | Spawn Weight | Group Size |
|----------|--------|--------------|------------|
| **Blue Whale** | Deep Ocean, Deep Cold Ocean | 3 (Rare) | 1 |
| **Humpback Whale** | Deep Ocean, Deep Cold Ocean, Deep Lukewarm Ocean | 5 | 1-2 |
| **Giant Squid** | Deep Ocean, Deep Cold Ocean, Deep Frozen Ocean | 2 (Very Rare) | 1 |
| **Whale Shark** | Warm Ocean, Lukewarm Ocean, Deep Lukewarm Ocean | 4 | 1 |
| **Orca** | Cold Ocean, Deep Cold Ocean, Frozen Ocean | 8 | 2-5 |
| **Great White Shark** | Ocean, Deep Ocean, Lukewarm Ocean | 6 | 1-2 |
| **Narwhal** | Frozen Ocean, Deep Frozen Ocean | 10 | 3-6 |
| **Hammerhead Shark** | Warm Ocean, Lukewarm Ocean | 8 | 2-4 |
| **Ocean Sunfish** | Ocean, Lukewarm Ocean, Deep Ocean | 6 | 1-2 |
| **Swordfish** | Warm Ocean, Lukewarm Ocean, Deep Lukewarm Ocean | 10 | 1-3 |

---

## Items

### Food Items

| Item | Hunger | Saturation | Special Effects | Source |
|------|--------|------------|-----------------|--------|
| **Shark Fin Soup** | 8 | 0.8 | Water Breathing (5 min), Dolphin's Grace (2.5 min) | Crafted |
| **Cooked Whale Meat** | 8 | 0.8 | - | Smelting whale meat |
| **Whale Meat** | 4 | 0.3 | - | Whales, Orca, Narwhal |
| **Grilled Calamari** | 6 | 0.6 | - | Smelting squid tentacle |
| **Cooked Fish Fillet** | 6 | 0.6 | - | Smelting raw fish fillet |
| **Squid Tentacle** | 3 | 0.2 | - | Giant Squid |
| **Sunfish Meat** | 3 | 0.2 | - | Ocean Sunfish |
| **Raw Fish Fillet** | 2 | 0.1 | - | Swordfish |

### Weapons

| Weapon | Damage | Attack Speed | Material Tier | Special |
|--------|--------|--------------|---------------|---------|
| **Narwhal Spear** | +5 | Very Slow (-3.0) | Diamond | High damage, slow |
| **Swordfish Rapier** | +3 | Very Fast (-1.0) | Iron | Fast attacks |
| **Shark Tooth Dagger** | +2 | Fast (-1.4) | Iron | Quick strikes |

### Material Items

| Item | Source | Use |
|------|--------|-----|
| **Shark Fin** | All sharks | Crafting Shark Fin Soup |
| **Shark Tooth** | All sharks | Crafting Shark Tooth Dagger |
| **Narwhal Tusk** | Narwhal | Crafting Narwhal Spear |
| **Swordfish Bill** | Swordfish | Crafting Swordfish Rapier |
| **Whale Blubber** | Whales, Orca, Narwhal | Fuel (burns 8 items like coal) |

---

## Crafting Recipes

### Shark Fin Soup
Grants Water Breathing (5 min) and Dolphin's Grace (2.5 min)!
```
F F F
F B F
F F F

F = Shark Fin
B = Bowl
```

### Shark Tooth Dagger
Fast attack speed, good for quick combat.
```
T T
T T
  S

T = Shark Tooth
S = Stick
```

### Narwhal Spear
High damage, slow attack - great for ambushes.
```
    T
  S  
S    

T = Narwhal Tusk
S = Stick
```

### Swordfish Rapier
Very fast attack speed, medium damage.
```
    B
  B  
S    

B = Swordfish Bill
S = Stick
```

### Cooking Recipes
| Input | Method | Output |
|-------|--------|--------|
| Whale Meat | Furnace/Smoker/Campfire | Cooked Whale Meat |
| Squid Tentacle | Furnace/Smoker/Campfire | Grilled Calamari |
| Raw Fish Fillet | Furnace/Smoker/Campfire | Cooked Fish Fillet |

---

## Loot Tables

### Sharks (Great White, Hammerhead)
| Drop | Amount | Looting Bonus |
|------|--------|---------------|
| Shark Fin | 1-2 | - |
| Shark Tooth | 2-5 | +0-2 per level |
| Bone | 2-4 | - |

### Whales (Blue Whale)
| Drop | Amount | Looting Bonus |
|------|--------|---------------|
| Whale Meat | 12-24 | +0-3 per level |
| Whale Blubber | 6-12 | - |
| Bone | 6-12 | - |

### Whales (Humpback)
| Drop | Amount | Looting Bonus |
|------|--------|---------------|
| Whale Meat | 8-16 | +0-2 per level |
| Whale Blubber | 4-8 | - |
| Bone | 4-8 | - |

### Orca
| Drop | Amount | Looting Bonus |
|------|--------|---------------|
| Whale Meat | 4-8 | +0-1 per level |
| Whale Blubber | 2-4 | - |
| Bone | 2-4 | - |

### Giant Squid
| Drop | Amount | Looting Bonus |
|------|--------|---------------|
| Squid Tentacle | 4-8 | +0-2 per level |
| Ink Sac | 6-12 | - |
| Heart of the Sea | 5% chance | +1% per looting level |

### Narwhal
| Drop | Amount | Looting Bonus |
|------|--------|---------------|
| Narwhal Tusk | 1 | - |
| Whale Meat | 2-4 | +0-1 per level |
| Whale Blubber | 1-2 | - |

### Swordfish
| Drop | Amount | Notes |
|------|--------|-------|
| Raw Fish Fillet | 2-4 | Auto-cooks if on fire |
| Swordfish Bill | 0-1 | - |
| Bone | 0-2 | - |

### Ocean Sunfish (Mola Mola)
| Drop | Amount | Notes |
|------|--------|-------|
| Sunfish Meat | 2-4 | Auto-cooks if on fire |
| Bone | 0-2 | - |

---

## Installation

1. Install your preferred mod loader:
   - [Fabric Loader](https://fabricmc.net/) (recommended)
   - [NeoForge](https://neoforged.net/)
2. Install required dependencies:
   - [GeckoLib](https://modrinth.com/mod/geckolib) (required for animations)
   - [Fabric API](https://modrinth.com/mod/fabric-api) (Fabric only)
3. Download the appropriate Deep Blue jar from the releases folder
4. Place the jar in your `mods` folder
5. Launch Minecraft!

## Building from Source

```bash
# Clone the repository
git clone https://github.com/Simplifine-gamedev/deep-blue-mod.git
cd deep-blue-mod

# Build the mod
./gradlew build
```

The built JAR will be in `build/libs/`

---

## Credits

- **Developer**: Ege Kaanduman
- **Models & Textures**: Created with Blockbench
- **Animation System**: GeckoLib
- **Organization**: [Simplifine Gamedev](https://github.com/Simplifine-gamedev)

## License

MIT License - Feel free to use, modify, and distribute.

---

*Part of the Minecraft Animal Modpacks project by Simplifine Gamedev*
