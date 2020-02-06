package co.origamigames.quazimodded.world.biome;

import co.origamigames.quazimodded.world.gen.surfacebuilder.QMSurfaceBuilder;
import com.google.common.collect.ImmutableList;
import net.minecraft.block.Blocks;
import net.minecraft.entity.EntityCategory;
import net.minecraft.entity.EntityType;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.decorator.CountExtraChanceDecoratorConfig;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.feature.BranchedTreeFeatureConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.RandomFeatureConfig;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.SimpleStateProvider;
import net.minecraft.world.gen.surfacebuilder.SurfaceBuilder;

public class GraveyardBiome extends Biome {

    // public static final RandomPatchFeatureConfig GRAVESTONE_CONFIG;
    public static final BranchedTreeFeatureConfig OAK_TREE_NO_LEAVES_CONFIG;
    public static final BranchedTreeFeatureConfig FANCY_TREE_NO_LEAVES_CONFIG;

    public GraveyardBiome() {
        super(new Biome.Settings().configureSurfaceBuilder(SurfaceBuilder.DEFAULT, QMSurfaceBuilder.GRAVEYARD_CONFIG)
                .precipitation(Biome.Precipitation.NONE).category(Biome.Category.DESERT).depth(.24F).scale(.2F)
                .temperature(.6F).downfall(.7F).parent((String) null));

        addFeatures(this);

        this.addSpawn(EntityCategory.MONSTER, new Biome.SpawnEntry(EntityType.ZOMBIE, 19, 4, 4));
        this.addSpawn(EntityCategory.MONSTER, new Biome.SpawnEntry(EntityType.ZOMBIE_VILLAGER, 1, 1, 1));
        this.addSpawn(EntityCategory.MONSTER, new Biome.SpawnEntry(EntityType.SKELETON, 100, 4, 4));
        this.addSpawn(EntityCategory.MONSTER, new Biome.SpawnEntry(EntityType.ENDERMAN, 10, 1, 4));
    }

    public static void addFeatures(Biome biome) {
        // biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(GRAVESTONE_CONFIG)
        //         .createDecoratedFeature(Decorator.COUNT_HEIGHTMAP_DOUBLE.configure(new CountDecoratorConfig(1))));

        biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION,
                Feature.RANDOM_SELECTOR
                        .configure(new RandomFeatureConfig(
                                ImmutableList.of(Feature.FANCY_TREE.configure(FANCY_TREE_NO_LEAVES_CONFIG)
                                        .withChance(0.33333334F)),
                                Feature.NORMAL_TREE.configure(OAK_TREE_NO_LEAVES_CONFIG)))
                        .createDecoratedFeature(Decorator.COUNT_EXTRA_HEIGHTMAP
                                .configure(new CountExtraChanceDecoratorConfig(0, 0.05F, 1))));

        DefaultBiomeFeatures.addLandCarvers(biome);
        DefaultBiomeFeatures.addDesertDeadBushes(biome);
    }

    static {
        // GRAVESTONE_CONFIG = (new RandomPatchFeatureConfig.Builder(
        //         new SimpleStateProvider(QMBlocks.GRAVESTONE.getDefaultState()), new SimpleBlockPlacer())).tries(1)
        //                 .build();

        FANCY_TREE_NO_LEAVES_CONFIG = (new BranchedTreeFeatureConfig.Builder(new SimpleStateProvider(Blocks.OAK_LOG.getDefaultState()),
                new SimpleStateProvider(Blocks.AIR.getDefaultState()), new BlobFoliagePlacer(0, 0))).build();
        OAK_TREE_NO_LEAVES_CONFIG = (new BranchedTreeFeatureConfig.Builder(new SimpleStateProvider(Blocks.OAK_LOG.getDefaultState()),
                new SimpleStateProvider(Blocks.AIR.getDefaultState()), new BlobFoliagePlacer(2, 0))).baseHeight(4).heightRandA(2)
                        .foliageHeight(3).build();
    }
}
