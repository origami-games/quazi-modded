package co.origamigames.quazimodded.init;

import co.origamigames.quazimodded.QuaziModded;
import co.origamigames.quazimodded.block.*;
import co.origamigames.sheet.SheetLib;
import co.origamigames.sheet.block.PistonImmovableBlock;
import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.tag.TagRegistry;
import net.fabricmc.fabric.api.tools.FabricToolTags;
import net.minecraft.block.*;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.tag.Tag;
import net.minecraft.util.Identifier;

public class QMBlocks {
    // define blocks
    public static final Block ASH_BLOCK = register("ash_block", new FallingBlock(
            FabricBlockSettings.copy(Blocks.SAND).breakByTool(FabricToolTags.PICKAXES).strength(1.5F, 6.0F).build()));

    public static final Block AMETHYST_ORE = register("amethyst_ore", new QMOreBlock(
            FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).strength(3.0F, 3.0F).build()));
    public static final Block AMETHYST_BLOCK = registerCopyBlock("amethyst_block", Blocks.DIAMOND_BLOCK);
    public static final Block LEAD_ORE = register("lead_ore", new QMOreBlock(
            FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 1).strength(3.0F, 3.0F).build()));
    public static final Block LEAD_BLOCK = registerCopyBlock("lead_block", Blocks.IRON_BLOCK);

    public static final Block BAMBOO_BLOCK = registerCopyBlock("bamboo_block", Blocks.OAK_PLANKS);
    public static final Block CHARCOAL_BLOCK = registerCopyBlock("charcoal_block", Blocks.COAL_BLOCK);
    public static final Block KELP_BLOCK = registerCopyBlock("kelp_block", Blocks.DRIED_KELP_BLOCK);
    public static final Block SUGAR_BLOCK = register("sugar_block", new FallingBlock(
            FabricBlockSettings.copy(Blocks.SAND).breakByTool(FabricToolTags.SHOVELS).build()));
    public static final Block SUGAR_CANE_BLOCK = registerCopyBlock("sugar_cane_block", Blocks.DRIED_KELP_BLOCK);

    public static final Block THATCH = registerCopyBlock("thatch", Blocks.HAY_BLOCK);
    public static final Block THATCH_SLAB = register("thatch_slab", new SlabBlock(FabricBlockSettings.copy(Blocks.HAY_BLOCK).build()));
    public static final Block THATCH_STAIRS = register("thatch_stairs", new QMStairsBlock(THATCH.getDefaultState(),
            FabricBlockSettings.copy(Blocks.HAY_BLOCK).build()));
    public static final Block THATCH_WALL = register("thatch_wall", new WallBlock(FabricBlockSettings.copy(Blocks.HAY_BLOCK).build()));

    public static final Block REINFORCED_GLASS = register("reinforced_glass", new GlassBlock(FabricBlockSettings.copy(Blocks.GLASS).nonOpaque()
            .breakByTool(FabricToolTags.PICKAXES).resistance(360000000.0F).build()));
    public static final Block REINFORCED_GLASS_PANE = register("reinforced_glass_pane", new QMPaneBlock(FabricBlockSettings.copy(Blocks.GLASS_PANE)
            .nonOpaque().breakByTool(FabricToolTags.PICKAXES).resistance(360000000.0F).build()));
    public static final Block REINFORCED_STONE = register("reinforced_stone", new PistonImmovableBlock(FabricBlockSettings.copy(Blocks.WHITE_WOOL)
            .sounds(BlockSoundGroup.STONE).breakByTool(FabricToolTags.PICKAXES).strength(0.8F, 360000000.0F).build()));
    public static final Block REINFORCED_BRICKS = register("reinforced_bricks", new Block(
            FabricBlockSettings.copy(Blocks.BRICKS).strength(0.8F, 360000000.0F).build()));
    public static final Block REINFORCED_ACACIA_PLANKS = register("reinforced_acacia_planks", new Block(
            FabricBlockSettings.copy(Blocks.ACACIA_PLANKS).strength(0.8F, 360000000.0F).build()));
    public static final Block REINFORCED_BIRCH_PLANKS = register("reinforced_birch_planks", new Block(
            FabricBlockSettings.copy(Blocks.BIRCH_PLANKS).strength(0.8F, 360000000.0F).build()));
    public static final Block REINFORCED_DARK_OAK_PLANKS = register("reinforced_dark_oak_planks", new Block(
            FabricBlockSettings.copy(Blocks.DARK_OAK_PLANKS).strength(0.8F, 360000000.0F).build()));
    public static final Block REINFORCED_JUNGLE_PLANKS = register("reinforced_jungle_planks", new Block(
            FabricBlockSettings.copy(Blocks.JUNGLE_PLANKS).strength(0.8F, 360000000.0F).build()));
    public static final Block REINFORCED_OAK_PLANKS = register("reinforced_oak_planks", new Block(
            FabricBlockSettings.copy(Blocks.OAK_PLANKS).strength(0.8F, 360000000.0F).build()));
    public static final Block REINFORCED_SPRUCE_PLANKS = register("reinforced_spruce_planks", new Block(
            FabricBlockSettings.copy(Blocks.SPRUCE_PLANKS).strength(0.8F, 360000000.0F).build()));

    public static final Block LIT_REDSTONE_LAMP = registerCopyBlock("lit_redstone_lamp", Blocks.REDSTONE_LAMP);

    public static final Block CANDLE = register("candle", new CandleBlock(
            FabricBlockSettings.of(Material.PART).lightLevel(14).sounds(BlockSoundGroup.STONE).build()));

    public static final Block ACACIA_BOOKSHELF = registerCopyBlock("acacia_bookshelf", Blocks.BOOKSHELF);
    public static final Block BIRCH_BOOKSHELF = registerCopyBlock("birch_bookshelf", Blocks.BOOKSHELF);
    public static final Block DARK_OAK_BOOKSHELF = registerCopyBlock("dark_oak_bookshelf", Blocks.BOOKSHELF);
    public static final Block JUNGLE_BOOKSHELF = registerCopyBlock("jungle_bookshelf", Blocks.BOOKSHELF);
    public static final Block SPRUCE_BOOKSHELF = registerCopyBlock("spruce_bookshelf", Blocks.BOOKSHELF);

    public static final Block WHITE_QUILTED_WOOL = registerCopyBlock("white_quilted_wool", Blocks.WHITE_WOOL);
    public static final Block ORANGE_QUILTED_WOOL = registerCopyBlock("orange_quilted_wool", Blocks.ORANGE_WOOL);
    public static final Block MAGENTA_QUILTED_WOOL = registerCopyBlock("magenta_quilted_wool", Blocks.MAGENTA_WOOL);
    public static final Block LIGHT_BLUE_QUILTED_WOOL = registerCopyBlock("light_blue_quilted_wool", Blocks.LIGHT_BLUE_WOOL);
    public static final Block YELLOW_QUILTED_WOOL = registerCopyBlock("yellow_quilted_wool", Blocks.YELLOW_WOOL);
    public static final Block LIME_QUILTED_WOOL = registerCopyBlock("lime_quilted_wool", Blocks.LIME_WOOL);
    public static final Block PINK_QUILTED_WOOL = registerCopyBlock("pink_quilted_wool", Blocks.PINK_WOOL);
    public static final Block GRAY_QUILTED_WOOL = registerCopyBlock("gray_quilted_wool", Blocks.GRAY_WOOL);
    public static final Block LIGHT_GRAY_QUILTED_WOOL = registerCopyBlock("light_gray_quilted_wool", Blocks.LIGHT_GRAY_WOOL);
    public static final Block CYAN_QUILTED_WOOL = registerCopyBlock("cyan_quilted_wool", Blocks.CYAN_WOOL);
    public static final Block PURPLE_QUILTED_WOOL = registerCopyBlock("purple_quilted_wool", Blocks.PURPLE_WOOL);
    public static final Block BLUE_QUILTED_WOOL = registerCopyBlock("blue_quilted_wool", Blocks.BLUE_WOOL);
    public static final Block BROWN_QUILTED_WOOL = registerCopyBlock("brown_quilted_wool", Blocks.BROWN_WOOL);
    public static final Block GREEN_QUILTED_WOOL = registerCopyBlock("green_quilted_wool", Blocks.GREEN_WOOL);
    public static final Block RED_QUILTED_WOOL = registerCopyBlock("red_quilted_wool", Blocks.RED_WOOL);
    public static final Block BLACK_QUILTED_WOOL = registerCopyBlock("black_quilted_wool", Blocks.BLACK_WOOL);

    // public static final Block GRAVESTONE = registerCopyBlock("gravestone", Blocks.STONE);

    public static void addAdditionalBlockProperties() {
        fuelRegistryAddition(KELP_BLOCK, 4000); // 400t = 200s = 3m20s
        fuelRegistryAddition(CHARCOAL_BLOCK, 16000); // 16000t = 800s = 13m20s
        bookshelfFuelRegistryAddition(ACACIA_BOOKSHELF);
        bookshelfFuelRegistryAddition(BIRCH_BOOKSHELF);
        bookshelfFuelRegistryAddition(DARK_OAK_BOOKSHELF);
        bookshelfFuelRegistryAddition(JUNGLE_BOOKSHELF);
        bookshelfFuelRegistryAddition(SPRUCE_BOOKSHELF);
        woolFuelRegistryAddition(WHITE_QUILTED_WOOL);
        woolFuelRegistryAddition(ORANGE_QUILTED_WOOL);
        woolFuelRegistryAddition(MAGENTA_QUILTED_WOOL);
        woolFuelRegistryAddition(LIGHT_BLUE_QUILTED_WOOL);
        woolFuelRegistryAddition(YELLOW_QUILTED_WOOL);
        woolFuelRegistryAddition(LIME_QUILTED_WOOL);
        woolFuelRegistryAddition(PINK_QUILTED_WOOL);
        woolFuelRegistryAddition(GRAY_QUILTED_WOOL);
        woolFuelRegistryAddition(LIGHT_GRAY_QUILTED_WOOL);
        woolFuelRegistryAddition(CYAN_QUILTED_WOOL);
        woolFuelRegistryAddition(PURPLE_QUILTED_WOOL);
        woolFuelRegistryAddition(BLUE_QUILTED_WOOL);
        woolFuelRegistryAddition(BROWN_QUILTED_WOOL);
        woolFuelRegistryAddition(GREEN_QUILTED_WOOL);
        woolFuelRegistryAddition(RED_QUILTED_WOOL);
        woolFuelRegistryAddition(BLACK_QUILTED_WOOL);

        flammableRegistryAddition(QMTags.BOOKSHELVES, 30, 20);
        flammableRegistryAddition(QMTags.QUILTED_WOOL, 30, 60);
        flammableRegistryAddition(QMTags.REINFORCED_PLANKS, 5, 20);
        flammableRegistryAddition(THATCH, 60, 20);
        flammableRegistryAddition(THATCH_SLAB, 5, 20);
        flammableRegistryAddition(THATCH_STAIRS, 5, 20);
        flammableRegistryAddition(THATCH_WALL, 5, 20);
        flammableRegistryAddition(BAMBOO_BLOCK, 60, 60);
        flammableRegistryAddition(CHARCOAL_BLOCK, 5, 5);
    }

    private static void flammableRegistryAddition(Block block, int burnChance, int spreadChance) {
        FlammableBlockRegistry.getDefaultInstance().add(block, burnChance, spreadChance);
    }
    private static void flammableRegistryAddition(Tag<Block> blockTag, int burnChance, int spreadChance) {
        FlammableBlockRegistry.getDefaultInstance().add(blockTag, burnChance, spreadChance);
    }

    private static void fuelRegistryAddition(Block block, int burnTime) {
        SheetLib.addBlockToFuelRegistry(block, burnTime);
    }
    private static void bookshelfFuelRegistryAddition(Block block) {
        fuelRegistryAddition(block, 300);
    } // 300t = 15s
    private static void woolFuelRegistryAddition(Block block) {
        fuelRegistryAddition(block, 100);
    }

    private static Block register(String id, Block block) { // calls all block/block item registers
        return SheetLib.block(QuaziModded.MOD_ID, id, block, QuaziModded.ITEM_GROUP);
    }
    private static Block registerCopyBlock(String id, Block copyBlock) { // registers a block with the same properties as the passed in block
        return SheetLib.copiedBlock(QuaziModded.MOD_ID, id, copyBlock, QuaziModded.ITEM_GROUP);
    }

    public static void setBlockRenderLayers() {
        setTransparencyRenderLayer(REINFORCED_GLASS);
        setTransparencyRenderLayer(REINFORCED_GLASS_PANE);
    }
    private static void setTransparencyRenderLayer(Block block) {
        SheetLib.setTransparencyRenderLayer(block);
    }
}
