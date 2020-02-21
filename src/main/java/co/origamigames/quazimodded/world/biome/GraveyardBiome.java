package co.origamigames.quazimodded.world.biome;

import com.google.common.collect.ImmutableList;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.Blocks;
import net.minecraft.entity.EntityCategory;
import net.minecraft.entity.EntityType;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.world.biome.*;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.decorator.BeehiveTreeDecorator;
import net.minecraft.world.gen.decorator.CountExtraChanceDecoratorConfig;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.surfacebuilder.SurfaceBuilder;

public class GraveyardBiome extends Biome {
    public static final BranchedTreeFeatureConfig FANCY_TREE_NO_LEAVES_WITH_RARE_BEEHIVES_CONFIG = new BranchedTreeFeatureConfig.Builder(new SimpleBlockStateProvider(Blocks.OAK_LOG.getDefaultState()), new SimpleBlockStateProvider(Blocks.AIR.getDefaultState()), new BlobFoliagePlacer(0, 0)).treeDecorators(ImmutableList.of(new BeehiveTreeDecorator(0.002F))).build();
    public static final BranchedTreeFeatureConfig OAK_TREE_NO_LEAVES_WITH_RARE_BEEHIVES_CONFIG = new BranchedTreeFeatureConfig.Builder(new SimpleBlockStateProvider(Blocks.OAK_LOG.getDefaultState()), new SimpleBlockStateProvider(Blocks.AIR.getDefaultState()), new BlobFoliagePlacer(2, 0)).baseHeight(4).heightRandA(2).foliageHeight(3).noVines().treeDecorators(ImmutableList.of(new BeehiveTreeDecorator(0.002F))).build();

    private int foliageColor = 7302514;

    public GraveyardBiome() {
        super(new Settings().configureSurfaceBuilder(SurfaceBuilder.DEFAULT, SurfaceBuilder.GRASS_CONFIG).precipitation(Precipitation.RAIN).category(Category.FOREST).depth(0.24F).scale(0.2F).temperature(0.6F).downfall(0.8F).effects((new BiomeEffects.Builder()).waterColor(7302514).waterFogColor(2503992).fogColor(15064052).particleConfig(new BiomeParticleConfig(ParticleTypes.SMOKE, 0.01F, (random) -> random.nextGaussian() * 9.999999974752427E-7D, (random) -> random.nextGaussian() * 9.999999747378752E-5D, (random) -> random.nextGaussian() * 9.999999974752427E-7D)).build()).parent(null));
        this.addStructureFeature(Feature.MINESHAFT.configure(new MineshaftFeatureConfig(0.004D, MineshaftFeature.Type.NORMAL)));
        this.addStructureFeature(Feature.STRONGHOLD.configure(FeatureConfig.DEFAULT));
        this.addStructureFeature(Feature.STRONGHOLD.configure(FeatureConfig.DEFAULT));
        DefaultBiomeFeatures.addLandCarvers(this);
        DefaultBiomeFeatures.addDefaultStructures(this);
        DefaultBiomeFeatures.addDungeons(this);
        DefaultBiomeFeatures.addMineables(this);
        DefaultBiomeFeatures.addDefaultOres(this);
        DefaultBiomeFeatures.addDefaultDisks(this);
        addForestTrees(this);
        DefaultBiomeFeatures.addForestGrass(this);
        DefaultBiomeFeatures.addDefaultMushrooms(this);
        DefaultBiomeFeatures.addDefaultVegetation(this);
        DefaultBiomeFeatures.addFrozenTopLayer(this);
        this.addSpawn(EntityCategory.CREATURE, new SpawnEntry(EntityType.WOLF, 5, 4, 4));
        this.addSpawn(EntityCategory.AMBIENT, new SpawnEntry(EntityType.BAT, 10, 8, 8));
        this.addSpawn(EntityCategory.MONSTER, new SpawnEntry(EntityType.ZOMBIE, 95, 4, 4));
        this.addSpawn(EntityCategory.MONSTER, new SpawnEntry(EntityType.ZOMBIE_VILLAGER, 5, 1, 1));
        this.addSpawn(EntityCategory.MONSTER, new SpawnEntry(EntityType.SKELETON, 100, 4, 4));
        this.addSpawn(EntityCategory.MONSTER, new SpawnEntry(EntityType.ENDERMAN, 10, 1, 4));
        this.addSpawn(EntityCategory.MONSTER, new SpawnEntry(EntityType.WITCH, 5, 1, 1));
    }

    public static void addForestTrees(Biome biome) {
        biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, net.minecraft.world.gen.feature.Feature.RANDOM_SELECTOR.configure(new RandomFeatureConfig(ImmutableList.of(net.minecraft.world.gen.feature.Feature.FANCY_TREE.configure(FANCY_TREE_NO_LEAVES_WITH_RARE_BEEHIVES_CONFIG).withChance(0.1F)), net.minecraft.world.gen.feature.Feature.NORMAL_TREE.configure(OAK_TREE_NO_LEAVES_WITH_RARE_BEEHIVES_CONFIG))).createDecoratedFeature(Decorator.COUNT_EXTRA_HEIGHTMAP.configure(new CountExtraChanceDecoratorConfig(5, 0.1F, 1))));
    }

    @Environment(EnvType.CLIENT)
    @Override
    public int getGrassColorAt(double x, double z) {
        return foliageColor;
    }

    @Environment(EnvType.CLIENT)
    @Override
    public int getFoliageColor() {
        return foliageColor;
    }

    @Environment(EnvType.CLIENT)
    @Override
    public int getSkyColor() {
        return foliageColor;
    }
}
