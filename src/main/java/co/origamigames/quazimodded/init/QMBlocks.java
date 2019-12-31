package co.origamigames.quazimodded.init;

import co.origamigames.quazimodded.QuaziModded;
import co.origamigames.quazimodded.block.*;
import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tools.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FallingBlock;
import net.minecraft.block.GlassBlock;
import net.minecraft.block.Material;
import net.minecraft.block.OreBlock;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.WallBlock;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class QMBlocks {

    // define blocks
    public static final Block ASH_BLOCK = new FallingBlock(FabricBlockSettings.copy(Blocks.SAND).breakByTool(FabricToolTags.PICKAXES).build());

    public static final Block AMETHYST_ORE = new OreBlock(FabricBlockSettings.of(Material.STONE).strength(3.0F, 3.0F).build());
    public static final Block AMETHYST_BLOCK = new Block(FabricBlockSettings.copy(Blocks.DIAMOND_BLOCK).build());
    public static final Block LEAD_ORE = new OreBlock(FabricBlockSettings.of(Material.STONE).strength(3.0F, 3.0F).build());
    public static final Block LEAD_BLOCK = new Block(FabricBlockSettings.copy(Blocks.DIAMOND_BLOCK).build());

    public static final Block BAMBOO_BLOCK = new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS).build());
    public static final Block CHARCOAL_BLOCK = new Block(FabricBlockSettings.copy(Blocks.COAL_BLOCK).build());
    public static final Block KELP_BLOCK = new Block(FabricBlockSettings.copy(Blocks.DRIED_KELP_BLOCK).build());
    public static final Block SUGAR_BLOCK = new FallingBlock(FabricBlockSettings.copy(Blocks.SAND).breakByTool(FabricToolTags.SHOVELS).build());
    public static final Block SUGAR_CANE_BLOCK = new Block(FabricBlockSettings.copy(Blocks.DRIED_KELP_BLOCK).build());

    public static final Block THATCH = new Block(FabricBlockSettings.copy(Blocks.HAY_BLOCK).build());
    public static final Block THATCH_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.HAY_BLOCK).build());
    public static final Block THATCH_STAIRS = new CustomStairsBlock(THATCH.getDefaultState(), FabricBlockSettings.copy(Blocks.HAY_BLOCK).build());
    public static final Block THATCH_WALL = new WallBlock(FabricBlockSettings.copy(Blocks.HAY_BLOCK).build());

    public static final Block REINFORCED_GLASS = new GlassBlock(FabricBlockSettings.copy(Blocks.GLASS).breakByTool(FabricToolTags.PICKAXES).resistance(360000000.0F).build());
    public static final Block REINFORCED_GLASS_PANE = new CustomPaneBlock(FabricBlockSettings.copy(Blocks.GLASS_PANE).breakByTool(FabricToolTags.PICKAXES).resistance(360000000.0F).build());
    public static final Block REINFORCED_STONE = new PistonImmovableBlock(FabricBlockSettings.copy(Blocks.WHITE_WOOL).sounds(BlockSoundGroup.STONE).breakByTool(FabricToolTags.PICKAXES).strength(0.8F, 360000000.0F).build());
    public static final Block REINFORCED_BRICKS = new Block(FabricBlockSettings.copy(Blocks.BRICKS).strength(0.8F, 360000000.0F).build());
    public static final Block REINFORCED_ACACIA_PLANKS = new Block(FabricBlockSettings.copy(Blocks.ACACIA_PLANKS).strength(0.8F, 360000000.0F).build());
    public static final Block REINFORCED_BIRCH_PLANKS = new Block(FabricBlockSettings.copy(Blocks.BIRCH_PLANKS).strength(0.8F, 360000000.0F).build());
    public static final Block REINFORCED_DARK_OAK_PLANKS = new Block(FabricBlockSettings.copy(Blocks.DARK_OAK_PLANKS).strength(0.8F, 360000000.0F).build());
    public static final Block REINFORCED_JUNGLE_PLANKS = new Block(FabricBlockSettings.copy(Blocks.JUNGLE_PLANKS).strength(0.8F, 360000000.0F).build());
    public static final Block REINFORCED_OAK_PLANKS = new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS).strength(0.8F, 360000000.0F).build());
    public static final Block REINFORCED_SPRUCE_PLANKS = new Block(FabricBlockSettings.copy(Blocks.SPRUCE_PLANKS).strength(0.8F, 360000000.0F).build());

    public static final Block LIT_REDSTONE_LAMP = new Block(FabricBlockSettings.copy(Blocks.REDSTONE_LAMP).build());

    public static final Block CANDLE = new CandleBlock(FabricBlockSettings.of(Material.PART).lightLevel(14).sounds(BlockSoundGroup.STONE).build());

    public static final Block ACACIA_BOOKSHELF = registerBookshelf();
    public static final Block BIRCH_BOOKSHELF = registerBookshelf();
    public static final Block DARK_OAK_BOOKSHELF = registerBookshelf();
    public static final Block JUNGLE_BOOKSHELF = registerBookshelf();
    public static final Block SPRUCE_BOOKSHELF = registerBookshelf();

    public static final Block WHITE_QUILTED_WOOL = registerBlock(Blocks.WHITE_WOOL);
    public static final Block ORANGE_QUILTED_WOOL = registerBlock(Blocks.ORANGE_WOOL);
    public static final Block MAGENTA_QUILTED_WOOL = registerBlock(Blocks.MAGENTA_WOOL);
    public static final Block LIGHT_BLUE_QUILTED_WOOL = registerBlock(Blocks.LIGHT_BLUE_WOOL);
    public static final Block YELLOW_QUILTED_WOOL = registerBlock(Blocks.YELLOW_WOOL);
    public static final Block LIME_QUILTED_WOOL = registerBlock(Blocks.LIME_WOOL);
    public static final Block PINK_QUILTED_WOOL = registerBlock(Blocks.PINK_WOOL);
    public static final Block GRAY_QUILTED_WOOL = registerBlock(Blocks.GRAY_WOOL);
    public static final Block LIGHT_GRAY_QUILTED_WOOL = registerBlock(Blocks.LIGHT_GRAY_WOOL);
    public static final Block CYAN_QUILTED_WOOL = registerBlock(Blocks.CYAN_WOOL);
    public static final Block PURPLE_QUILTED_WOOL = registerBlock(Blocks.PURPLE_WOOL);
    public static final Block BLUE_QUILTED_WOOL = registerBlock(Blocks.BLUE_WOOL);
    public static final Block BROWN_QUILTED_WOOL = registerBlock(Blocks.BROWN_WOOL);
    public static final Block GREEN_QUILTED_WOOL = registerBlock(Blocks.GREEN_WOOL);
    public static final Block RED_QUILTED_WOOL = registerBlock(Blocks.RED_WOOL);
    public static final Block BLACK_QUILTED_WOOL = registerBlock(Blocks.BLACK_WOOL);

    public static final Block GRAVESTONE = new GravestoneBlock(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE).build());

    public static void registerAll() {
        register("ash_block", ASH_BLOCK);

        register("amethyst_ore", AMETHYST_ORE);
        register("amethyst_block", AMETHYST_BLOCK);
        register("lead_ore", LEAD_ORE);
        register("lead_block", LEAD_BLOCK);

        register("bamboo_block", BAMBOO_BLOCK);
        register("charcoal_block", CHARCOAL_BLOCK);
        register("kelp_block", KELP_BLOCK);
        register("sugar_block", SUGAR_BLOCK);
        register("sugar_cane_block", SUGAR_CANE_BLOCK);

        register("thatch", THATCH);
        register("thatch_slab", THATCH_SLAB);
        register("thatch_stairs", THATCH_STAIRS);
        register("thatch_wall", THATCH_WALL);

        register("reinforced_glass", REINFORCED_GLASS);
        register("reinforced_glass_pane", REINFORCED_GLASS_PANE);
        register("reinforced_stone", REINFORCED_STONE);
        register("reinforced_bricks", REINFORCED_BRICKS);
        register("reinforced_acacia_planks", REINFORCED_ACACIA_PLANKS);
        register("reinforced_birch_planks", REINFORCED_BIRCH_PLANKS);
        register("reinforced_dark_oak_planks", REINFORCED_DARK_OAK_PLANKS);
        register("reinforced_jungle_planks", REINFORCED_JUNGLE_PLANKS);
        register("reinforced_oak_planks", REINFORCED_OAK_PLANKS);
        register("reinforced_spruce_planks", REINFORCED_SPRUCE_PLANKS);

        register("lit_redstone_lamp", LIT_REDSTONE_LAMP);

        register("candle", CANDLE);

        register("acacia_bookshelf", ACACIA_BOOKSHELF);
        register("birch_bookshelf", BIRCH_BOOKSHELF);
        register("dark_oak_bookshelf", DARK_OAK_BOOKSHELF);
        register("jungle_bookshelf", JUNGLE_BOOKSHELF);
        register("spruce_bookshelf", SPRUCE_BOOKSHELF);

        register("white_quilted_wool", WHITE_QUILTED_WOOL);
        register("orange_quilted_wool", ORANGE_QUILTED_WOOL);
        register("magenta_quilted_wool", MAGENTA_QUILTED_WOOL);
        register("light_blue_quilted_wool", LIGHT_BLUE_QUILTED_WOOL);
        register("yellow_quilted_wool", YELLOW_QUILTED_WOOL);
        register("lime_quilted_wool", LIME_QUILTED_WOOL);
        register("pink_quilted_wool", PINK_QUILTED_WOOL);
        register("gray_quilted_wool", GRAY_QUILTED_WOOL);
        register("light_gray_quilted_wool", LIGHT_GRAY_QUILTED_WOOL);
        register("cyan_quilted_wool", CYAN_QUILTED_WOOL);
        register("purple_quilted_wool", PURPLE_QUILTED_WOOL);
        register("blue_quilted_wool", BLUE_QUILTED_WOOL);
        register("brown_quilted_wool", BROWN_QUILTED_WOOL);
        register("green_quilted_wool", GREEN_QUILTED_WOOL);
        register("red_quilted_wool", RED_QUILTED_WOOL);
        register("black_quilted_wool", BLACK_QUILTED_WOOL);

        register("gravestone", GRAVESTONE);

        QMItems.registerBlockItems();
    }

    static void register(String id, Block block) {
        Registry.register(Registry.BLOCK, new Identifier(QuaziModded.MOD_ID, id), block);
    }

    public static Block registerBookshelf() {
        return new Block(FabricBlockSettings.copy(Blocks.BOOKSHELF).build());
    }

    public static Block registerBlock(Block copyBlock) {
        return new Block(FabricBlockSettings.copy(copyBlock).build());
    }
}
