package co.origamigames.quazimodded.init;

import co.origamigames.sheet.SheetLib;
import net.minecraft.block.Block;
import net.minecraft.world.gen.feature.OreFeatureConfig;

public class QMWorldGen {
    public static void addFeatures() {
        oreGeneration();
        ashBlockGeneration();
    }
    private static void oreGeneration() {
        addOverworldOre(QMBlocks.AMETHYST_ORE, 8, 1, 0, 0, 16);
        addOverworldOre(QMBlocks.LEAD_ORE, 8, 1, 0, 0, 64);
    }
    private static void ashBlockGeneration() {
        addToMagmaDecorator(QMBlocks.ASH_BLOCK, 35, 15, OreFeatureConfig.Target.NETHERRACK);
    }

    private static void addOverworldOre(Block block, int size, int count, int bottomOffset, int topOffset, int maxPerChunk) {
        SheetLib.addOverworldOre(block, size, count, bottomOffset, topOffset, maxPerChunk);
    }
    private static void addToMagmaDecorator(Block block, int size, int count, OreFeatureConfig.Target target) {
        SheetLib.addToMagmaDecorator(block, size, count, target);
    }
}
