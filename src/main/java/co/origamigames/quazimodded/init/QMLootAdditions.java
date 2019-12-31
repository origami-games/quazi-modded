package co.origamigames.quazimodded.init;

import co.origamigames.quazimodded.QuaziModded;
import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback;
import net.minecraft.util.Identifier;

public class QMLootAdditions {
    private static final String minecraft_id = "minecraft";
    private static final String addition_prefix = "additions/";

    private static final Identifier SQUID_ENTITY = vanillaTable("entities/squid");
    private static final Identifier SQUID_ENTITY_ADDITIONS = customTable("entities/squid");

    private static final Identifier ABANDONED_MINESHAFT_CHEST = vanillaTable("chests/abandoned_mineshaft");
    private static final Identifier ABANDONED_MINESHAFT_CHEST_ADDITIONS = customTable("chests/abandoned_mineshaft");
    private static final Identifier DESERT_PYRAMID_CHEST = vanillaTable("chests/desert_pyramid");
    private static final Identifier DESERT_PYRAMID_CHEST_ADDITIONS = customTable("chests/desert_pyramid");
    private static final Identifier JUNGLE_TEMPLE_CHEST = vanillaTable("chests/jungle_temple");
    private static final Identifier JUNGLE_TEMPLE_CHEST_ADDITIONS = customTable("chests/jungle_temple");
    private static final Identifier SIMPLE_DUNGEON_CHEST = vanillaTable("chests/simple_dungeon");
    private static final Identifier SIMPLE_DUNGEON_CHEST_ADDITIONS = customTable("chests/simple_dungeon");
    private static final Identifier WOODLAND_MANSION_CHEST = vanillaTable("chests/woodland_mansion");
    private static final Identifier WOODLAND_MANSION_CHEST_ADDITIONS = customTable("chests/woodland_mansion");
    private static final Identifier VILLAGE_ARMORER_CHEST = vanillaTable("chests/village/village_armorer");
    private static final Identifier VILLAGE_ARMORER_CHEST_ADDITIONS = customTable("chests/village/village_armorer");

    private static final Identifier GLASS_BLOCK = vanillaTable("blocks/glass");
    private static final Identifier GLASS_BLOCK_ADDITIONS = customTable("blocks/glass");
    private static final Identifier WHITE_GLASS_BLOCK = vanillaTable("blocks/white_stained_glass");
    private static final Identifier WHITE_GLASS_BLOCK_ADDITIONS = customTable("blocks/white_stained_glass");
    private static final Identifier ORANGE_GLASS_BLOCK = vanillaTable("blocks/orange_stained_glass");
    private static final Identifier ORANGE_GLASS_BLOCK_ADDITIONS = customTable("blocks/orange_stained_glass");
    private static final Identifier MAGENTA_GLASS_BLOCK = vanillaTable("blocks/magenta_stained_glass");
    private static final Identifier MAGENTA_GLASS_BLOCK_ADDITIONS = customTable("blocks/magenta_stained_glass");
    private static final Identifier LIGHT_BLUE_GLASS_BLOCK = vanillaTable("blocks/light_blue_stained_glass");
    private static final Identifier LIGHT_BLUE_GLASS_BLOCK_ADDITIONS = customTable("blocks/light_blue_stained_glass");
    private static final Identifier YELLOW_GLASS_BLOCK = vanillaTable("blocks/yellow_stained_glass");
    private static final Identifier YELLOW_GLASS_BLOCK_ADDITIONS = customTable("blocks/yellow_stained_glass");
    private static final Identifier LIME_GLASS_BLOCK = vanillaTable("blocks/lime_stained_glass");
    private static final Identifier LIME_GLASS_BLOCK_ADDITIONS = customTable("blocks/lime_stained_glass");
    private static final Identifier PINK_GLASS_BLOCK = vanillaTable("blocks/pink_stained_glass");
    private static final Identifier PINK_GLASS_BLOCK_ADDITIONS = customTable("blocks/pink_stained_glass");
    private static final Identifier GRAY_GLASS_BLOCK = vanillaTable("blocks/gray_stained_glass");
    private static final Identifier GRAY_GLASS_BLOCK_ADDITIONS = customTable("blocks/gray_stained_glass");
    private static final Identifier LIGHT_GRAY_GLASS_BLOCK = vanillaTable("blocks/light_gray_stained_glass");
    private static final Identifier LIGHT_GRAY_GLASS_BLOCK_ADDITIONS = customTable("blocks/light_gray_stained_glass");
    private static final Identifier CYAN_GLASS_BLOCK = vanillaTable("blocks/cyan_stained_glass");
    private static final Identifier CYAN_GLASS_BLOCK_ADDITIONS = customTable("blocks/cyan_stained_glass");
    private static final Identifier PURPLE_GLASS_BLOCK = vanillaTable("blocks/purple_stained_glass");
    private static final Identifier PURPLE_GLASS_BLOCK_ADDITIONS = customTable("blocks/purple_stained_glass");
    private static final Identifier BLUE_GLASS_BLOCK = vanillaTable("blocks/blue_stained_glass");
    private static final Identifier BLUE_GLASS_BLOCK_ADDITIONS = customTable("blocks/blue_stained_glass");
    private static final Identifier BROWN_GLASS_BLOCK = vanillaTable("blocks/brown_stained_glass");
    private static final Identifier BROWN_GLASS_BLOCK_ADDITIONS = customTable("blocks/brown_stained_glass");
    private static final Identifier GREEN_GLASS_BLOCK = vanillaTable("blocks/green_stained_glass");
    private static final Identifier GREEN_GLASS_BLOCK_ADDITIONS = customTable("blocks/green_stained_glass");
    private static final Identifier RED_GLASS_BLOCK = vanillaTable("blocks/red_stained_glass");
    private static final Identifier RED_GLASS_BLOCK_ADDITIONS = customTable("blocks/red_stained_glass");
    private static final Identifier BLACK_GLASS_BLOCK = vanillaTable("blocks/black_stained_glass");
    private static final Identifier BLACK_GLASS_BLOCK_ADDITIONS = customTable("blocks/black_stained_glass");

    private static Identifier vanillaTable(String table) {
        return new Identifier(minecraft_id, table);
    }

    private static Identifier customTable(String table) {
        return new Identifier(QuaziModded.MOD_ID, addition_prefix + table);
    }

    public static void registerAll() {
        LootTableLoadingCallback.EVENT.register((resourceManager, lootManager, id, supplier, setter) -> {
            if (GLASS_BLOCK.equals(id)) {
                supplier.copyFrom(lootManager.getSupplier(SQUID_ENTITY_ADDITIONS));
            } else if (ABANDONED_MINESHAFT_CHEST.equals(id)) {
                supplier.copyFrom(lootManager.getSupplier(ABANDONED_MINESHAFT_CHEST_ADDITIONS));
            } else if (DESERT_PYRAMID_CHEST.equals(id)) {
                supplier.copyFrom(lootManager.getSupplier(DESERT_PYRAMID_CHEST_ADDITIONS));
            } else if (JUNGLE_TEMPLE_CHEST.equals(id)) {
                supplier.copyFrom(lootManager.getSupplier(JUNGLE_TEMPLE_CHEST_ADDITIONS));
            } else if (SIMPLE_DUNGEON_CHEST.equals(id)) {
                supplier.copyFrom(lootManager.getSupplier(SIMPLE_DUNGEON_CHEST_ADDITIONS));
            } else if (WOODLAND_MANSION_CHEST.equals(id)) {
                supplier.copyFrom(lootManager.getSupplier(WOODLAND_MANSION_CHEST_ADDITIONS));
            } else if (VILLAGE_ARMORER_CHEST.equals(id)) {
                supplier.copyFrom(lootManager.getSupplier(VILLAGE_ARMORER_CHEST_ADDITIONS));
            } else if (SQUID_ENTITY.equals(id)) {
                supplier.copyFrom(lootManager.getSupplier(GLASS_BLOCK_ADDITIONS));
            } else if (WHITE_GLASS_BLOCK.equals(id)) {
                supplier.copyFrom(lootManager.getSupplier(WHITE_GLASS_BLOCK_ADDITIONS));
            } else if (ORANGE_GLASS_BLOCK.equals(id)) {
                supplier.copyFrom(lootManager.getSupplier(ORANGE_GLASS_BLOCK_ADDITIONS));
            } else if (MAGENTA_GLASS_BLOCK.equals(id)) {
                supplier.copyFrom(lootManager.getSupplier(MAGENTA_GLASS_BLOCK_ADDITIONS));
            } else if (LIGHT_BLUE_GLASS_BLOCK.equals(id)) {
                supplier.copyFrom(lootManager.getSupplier(LIGHT_BLUE_GLASS_BLOCK_ADDITIONS));
            } else if (YELLOW_GLASS_BLOCK.equals(id)) {
                supplier.copyFrom(lootManager.getSupplier(YELLOW_GLASS_BLOCK_ADDITIONS));
            } else if (LIME_GLASS_BLOCK.equals(id)) {
                supplier.copyFrom(lootManager.getSupplier(LIME_GLASS_BLOCK_ADDITIONS));
            } else if (PINK_GLASS_BLOCK.equals(id)) {
                supplier.copyFrom(lootManager.getSupplier(PINK_GLASS_BLOCK_ADDITIONS));
            } else if (GRAY_GLASS_BLOCK.equals(id)) {
                supplier.copyFrom(lootManager.getSupplier(GRAY_GLASS_BLOCK_ADDITIONS));
            } else if (LIGHT_GRAY_GLASS_BLOCK.equals(id)) {
                supplier.copyFrom(lootManager.getSupplier(LIGHT_GRAY_GLASS_BLOCK_ADDITIONS));
            } else if (CYAN_GLASS_BLOCK.equals(id)) {
                supplier.copyFrom(lootManager.getSupplier(CYAN_GLASS_BLOCK_ADDITIONS));
            } else if (PURPLE_GLASS_BLOCK.equals(id)) {
                supplier.copyFrom(lootManager.getSupplier(PURPLE_GLASS_BLOCK_ADDITIONS));
            } else if (BLUE_GLASS_BLOCK.equals(id)) {
                supplier.copyFrom(lootManager.getSupplier(BLUE_GLASS_BLOCK_ADDITIONS));
            } else if (BROWN_GLASS_BLOCK.equals(id)) {
                supplier.copyFrom(lootManager.getSupplier(BROWN_GLASS_BLOCK_ADDITIONS));
            } else if (GREEN_GLASS_BLOCK.equals(id)) {
                supplier.copyFrom(lootManager.getSupplier(GREEN_GLASS_BLOCK_ADDITIONS));
            } else if (RED_GLASS_BLOCK.equals(id)) {
                supplier.copyFrom(lootManager.getSupplier(RED_GLASS_BLOCK_ADDITIONS));
            } else if (BLACK_GLASS_BLOCK.equals(id)) {
                supplier.copyFrom(lootManager.getSupplier(BLACK_GLASS_BLOCK_ADDITIONS));
            }
        });
    }
}
