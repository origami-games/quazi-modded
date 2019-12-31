package co.origamigames.quazimodded.init;

import co.origamigames.quazimodded.init.QMBlocks;
import net.minecraft.block.Block;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.decorator.CountDecoratorConfig;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;

public class QMWorldGen {
    public static void addFeatures() {
        for (Biome biome : Registry.BIOME) {
            // all overworld features
            if (biome.getCategory() != Biome.Category.NETHER && biome.getCategory() != Biome.Category.THEEND) {
                biome.addFeature(GenerationStep.Feature.UNDERGROUND_ORES,
                        defaultOverworldOre(QMBlocks.AMETHYST_ORE, 8, 1, 0, 0, 16));
                biome.addFeature(GenerationStep.Feature.UNDERGROUND_ORES,
                        defaultOverworldOre(QMBlocks.LEAD_ORE, 8, 1, 0, 0, 64));
            }
            // all nether features
            else if (biome.getCategory() == Biome.Category.NETHER) {
                biome.addFeature(GenerationStep.Feature.UNDERGROUND_ORES,
                        defaultMagmaDecorator(OreFeatureConfig.Target.NETHERRACK, QMBlocks.ASH_BLOCK, 35, 15));
            }
        }
    }

    // configurations
    static ConfiguredFeature<?, ?> defaultOverworldOre(Block block, int size, int count, int bottomOffset,
            int topOffset, int maximum) {
        return Feature.ORE
                .configure(new OreFeatureConfig(OreFeatureConfig.Target.NATURAL_STONE, block.getDefaultState(), size))
                .createDecoratedFeature(Decorator.COUNT_RANGE
                        .configure(new RangeDecoratorConfig(count, bottomOffset, topOffset, maximum)));
    }

    static ConfiguredFeature<?, ?> defaultMagmaDecorator(OreFeatureConfig.Target target, Block block, int size,
            int count) {
        return Feature.ORE.configure(new OreFeatureConfig(target, block.getDefaultState(), size))
                .createDecoratedFeature(Decorator.MAGMA.configure(new CountDecoratorConfig(count)));
    }
}
