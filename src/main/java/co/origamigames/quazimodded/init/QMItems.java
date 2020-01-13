package co.origamigames.quazimodded.init;

import co.origamigames.quazimodded.QuaziModded;
import co.origamigames.quazimodded.init.QMBlocks;
import co.origamigames.quazimodded.item.*;
import net.minecraft.block.Block;
// import net.minecraft.entity.EntityType;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.BlockItem;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
// import net.minecraft.item.SpawnEggItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class QMItems {
    // define constants
    public static final String glass_shard = "glass_shard";
    public static final String cooked = "cooked_";
    public static final int maxCount_default = 64;

    // define items
    public static final Item ASH = register("ash", maxCount_default);
    public static final Item BEESWAX = register("beeswax", maxCount_default);

    public static final Item AMETHYST = register("amethyst", maxCount_default);

    public static final Item LEAD_INGOT = register("lead_ingot", maxCount_default);
    // public static final Item LEAD_SWORD = Registry.register(Registry.ITEM, new Identifier(QuaziModded.MOD_ID, "lead_sword"), new SwordBase(QMToolMaterials.LEAD, 3, -2.4F, (new Item.Settings()).group(QuaziModded.ITEM_GROUP)));
    // public static final Item LEAD_SHOVEL = Registry.register(Registry.ITEM, new Identifier(QuaziModded.MOD_ID, "lead_shovel"), new ShovelBase(QMToolMaterials.LEAD, 1.5F, -3.0F, (new Item.Settings()).group(QuaziModded.ITEM_GROUP)));
    // public static final Item LEAD_PICKAXE = Registry.register(Registry.ITEM, new Identifier(QuaziModded.MOD_ID, "lead_pickaxe"), new PickaxeBase(QMToolMaterials.LEAD, 1, -2.8F, (new Item.Settings()).group(QuaziModded.ITEM_GROUP)));
    // public static final Item LEAD_AXE = Registry.register(Registry.ITEM, new Identifier(QuaziModded.MOD_ID, "lead_axe"), new AxeBase(QMToolMaterials.LEAD, 6.0F, -3.1F, (new Item.Settings()).group(QuaziModded.ITEM_GROUP)));
    // public static final Item LEAD_HOE = Registry.register(Registry.ITEM, new Identifier(QuaziModded.MOD_ID, "lead_hoe"), new HoeBase(QMToolMaterials.LEAD, -1.0F, (new Item.Settings()).group(QuaziModded.ITEM_GROUP)));

    public static final Item HERMES_BOOTS = Registry.register(Registry.ITEM, new Identifier(QuaziModded.MOD_ID, "hermes_boots"), new HermesBootsItem(QMArmorMaterials.HERMES_BOOTS, EquipmentSlot.FEET, (new Item.Settings()).group(QuaziModded.ITEM_GROUP)));
    public static final Item LEAD_HELMET = Registry.register(Registry.ITEM, new Identifier(QuaziModded.MOD_ID, "lead_helmet"), new LeadHelmetItem(QMArmorMaterials.LEAD_HELMET, EquipmentSlot.HEAD, (new Item.Settings()).group(QuaziModded.ITEM_GROUP)));

    public static final Item CALAMARI = registerFood("calamari", maxCount_default, 2, 0.3f);
    public static final Item COOKED_CALAMARI = registerFoodSnack(cooked + "calamari", maxCount_default, 6, 0.6f);

    // public static final Item OWL_SPAWN_EGG = registerSpawnEgg("owl", maxCount_default, QMEntities.OWL, 0xFED639, 0xFBEBAE);

    public static final Item GLASS_SHARD = register(glass_shard, maxCount_default);
    public static final Item WHITE_GLASS_SHARD = register("white_" + glass_shard, maxCount_default);
    public static final Item ORANGE_GLASS_SHARD = register("orange_" + glass_shard, maxCount_default);
    public static final Item MAGENTA_GLASS_SHARD = register("magenta_" + glass_shard, maxCount_default);
    public static final Item LIGHT_BLUE_GLASS_SHARD = register("light_blue_" + glass_shard, maxCount_default);
    public static final Item YELLOW_GLASS_SHARD = register("yellow_" + glass_shard, maxCount_default);
    public static final Item LIME_GLASS_SHARD = register("lime_" + glass_shard, maxCount_default);
    public static final Item PINK_GLASS_SHARD = register("pink_" + glass_shard, maxCount_default);
    public static final Item GRAY_GLASS_SHARD = register("gray_" + glass_shard, maxCount_default);
    public static final Item LIGHT_GRAY_GLASS_SHARD = register("light_gray_" + glass_shard, maxCount_default);
    public static final Item CYAN_GLASS_SHARD = register("cyan_" + glass_shard, maxCount_default);
    public static final Item PURPLE_GLASS_SHARD = register("purple_" + glass_shard, maxCount_default);
    public static final Item BLUE_GLASS_SHARD = register("blue_" + glass_shard, maxCount_default);
    public static final Item BROWN_GLASS_SHARD = register("brown_" + glass_shard, maxCount_default);
    public static final Item GREEN_GLASS_SHARD = register("green_" + glass_shard, maxCount_default);
    public static final Item RED_GLASS_SHARD = register("red_" + glass_shard, maxCount_default);
    public static final Item BLACK_GLASS_SHARD = register("black_" + glass_shard, maxCount_default);

    public static void registerBlockItems() {
        registerBlockItem(QMBlocks.ASH_BLOCK, "ash_block");

        registerBlockItem(QMBlocks.AMETHYST_ORE, "amethyst_ore");
        registerBlockItem(QMBlocks.AMETHYST_BLOCK, "amethyst_block");
        registerBlockItem(QMBlocks.LEAD_ORE, "lead_ore");
        registerBlockItem(QMBlocks.LEAD_BLOCK, "lead_block");

        registerBlockItem(QMBlocks.BAMBOO_BLOCK, "bamboo_block");
        registerBlockItem(QMBlocks.CHARCOAL_BLOCK, "charcoal_block");
        registerBlockItem(QMBlocks.KELP_BLOCK, "kelp_block");
        registerBlockItem(QMBlocks.SUGAR_BLOCK, "sugar_block");
        registerBlockItem(QMBlocks.SUGAR_CANE_BLOCK, "sugar_cane_block");

        registerBlockItem(QMBlocks.THATCH, "thatch");
        registerBlockItem(QMBlocks.THATCH_SLAB, "thatch_slab");
        registerBlockItem(QMBlocks.THATCH_STAIRS, "thatch_stairs");
        registerBlockItem(QMBlocks.THATCH_WALL, "thatch_wall");

        registerBlockItem(QMBlocks.REINFORCED_GLASS, "reinforced_glass");
        registerBlockItem(QMBlocks.REINFORCED_GLASS_PANE, "reinforced_glass_pane");
        registerBlockItem(QMBlocks.REINFORCED_STONE, "reinforced_stone");
        registerBlockItem(QMBlocks.REINFORCED_BRICKS, "reinforced_bricks");
        registerBlockItem(QMBlocks.REINFORCED_ACACIA_PLANKS, "reinforced_acacia_planks");
        registerBlockItem(QMBlocks.REINFORCED_BIRCH_PLANKS, "reinforced_birch_planks");
        registerBlockItem(QMBlocks.REINFORCED_DARK_OAK_PLANKS, "reinforced_dark_oak_planks");
        registerBlockItem(QMBlocks.REINFORCED_JUNGLE_PLANKS, "reinforced_jungle_planks");
        registerBlockItem(QMBlocks.REINFORCED_OAK_PLANKS, "reinforced_oak_planks");
        registerBlockItem(QMBlocks.REINFORCED_SPRUCE_PLANKS, "reinforced_spruce_planks");

        registerBlockItem(QMBlocks.LIT_REDSTONE_LAMP, "lit_redstone_lamp");

        registerBlockItemStackSize(QMBlocks.CANDLE, "candle", 16);

        registerBlockItem(QMBlocks.ACACIA_BOOKSHELF, "acacia_bookshelf");
        registerBlockItem(QMBlocks.BIRCH_BOOKSHELF, "birch_bookshelf");
        registerBlockItem(QMBlocks.DARK_OAK_BOOKSHELF, "dark_oak_bookshelf");
        registerBlockItem(QMBlocks.JUNGLE_BOOKSHELF, "jungle_bookshelf");
        registerBlockItem(QMBlocks.SPRUCE_BOOKSHELF, "spruce_bookshelf");

        registerBlockItem(QMBlocks.WHITE_QUILTED_WOOL, "white_quilted_wool");
        registerBlockItem(QMBlocks.ORANGE_QUILTED_WOOL, "orange_quilted_wool");
        registerBlockItem(QMBlocks.MAGENTA_QUILTED_WOOL, "magenta_quilted_wool");
        registerBlockItem(QMBlocks.LIGHT_BLUE_QUILTED_WOOL, "light_blue_quilted_wool");
        registerBlockItem(QMBlocks.YELLOW_QUILTED_WOOL, "yellow_quilted_wool");
        registerBlockItem(QMBlocks.LIME_QUILTED_WOOL, "lime_quilted_wool");
        registerBlockItem(QMBlocks.PINK_QUILTED_WOOL, "pink_quilted_wool");
        registerBlockItem(QMBlocks.GRAY_QUILTED_WOOL, "gray_quilted_wool");
        registerBlockItem(QMBlocks.LIGHT_GRAY_QUILTED_WOOL, "light_gray_quilted_wool");
        registerBlockItem(QMBlocks.CYAN_QUILTED_WOOL, "cyan_quilted_wool");
        registerBlockItem(QMBlocks.PURPLE_QUILTED_WOOL, "purple_quilted_wool");
        registerBlockItem(QMBlocks.BLUE_QUILTED_WOOL, "blue_quilted_wool");
        registerBlockItem(QMBlocks.BROWN_QUILTED_WOOL, "brown_quilted_wool");
        registerBlockItem(QMBlocks.GREEN_QUILTED_WOOL, "green_quilted_wool");
        registerBlockItem(QMBlocks.RED_QUILTED_WOOL, "red_quilted_wool");
        registerBlockItem(QMBlocks.BLACK_QUILTED_WOOL, "black_quilted_wool");
    }

    private static Item register(String name, int maxCount) {
        return Registry.register(Registry.ITEM, new Identifier(QuaziModded.MOD_ID, name),
                new Item(new Item.Settings().maxCount(maxCount).group(QuaziModded.ITEM_GROUP)));
    }

    private static Item registerBlockItem(Block block, String blockString) {
        return Registry.register(Registry.ITEM, new Identifier(QuaziModded.MOD_ID, blockString),
                new BlockItem(block, new Item.Settings().group(QuaziModded.ITEM_GROUP)));
    }
    private static Item registerBlockItemStackSize(Block block, String blockString, int maxCount) {
        return Registry.register(Registry.ITEM, new Identifier(QuaziModded.MOD_ID, blockString),
                new BlockItem(block, new Item.Settings().maxCount(maxCount).group(QuaziModded.ITEM_GROUP)));
    }

    private static Item registerFood(String name, int maxCount, int hunger, float saturationModifier) {
        return Registry.register(Registry.ITEM, new Identifier(QuaziModded.MOD_ID, name),
                new Item(new Item.Settings().maxCount(maxCount).group(QuaziModded.ITEM_GROUP).food(
                        new FoodComponent.Builder().hunger(hunger).saturationModifier(saturationModifier).build())));
    }
    private static Item registerFoodSnack(String name, int maxCount, int hunger, float saturationModifier) {
        return Registry.register(Registry.ITEM, new Identifier(QuaziModded.MOD_ID, name),
                new Item(new Item.Settings().maxCount(maxCount).group(QuaziModded.ITEM_GROUP)
                        .food(new FoodComponent.Builder().hunger(hunger).saturationModifier(saturationModifier).snack()
                                .build())));
    }

    // @SuppressWarnings("rawtypes")
    // private static Item registerSpawnEgg(String name, int maxCount, EntityType entity, int primaryColor,
    //         int secondaryColor) {
    //     return Registry.register(Registry.ITEM, new Identifier(QuaziModded.MOD_ID, name + "_spawn_egg"),
    //             new SpawnEggItem(entity, primaryColor, secondaryColor,
    //                     new Item.Settings().maxCount(maxCount).group(QuaziModded.ITEM_GROUP)));
    // }
}
