package co.origamigames.quazimodded.world.gen.surfacebuilder;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.world.gen.surfacebuilder.SurfaceConfig;
import net.minecraft.world.gen.surfacebuilder.TernarySurfaceConfig;

public abstract class QMSurfaceBuilder<C extends SurfaceConfig> {

    public static final BlockState GRASS_BLOCK;
    public static final BlockState GRAVEL;
    public static final BlockState DIRT;

    public static final TernarySurfaceConfig GRAVEYARD_CONFIG;

    static {
        GRASS_BLOCK = Blocks.GRASS_BLOCK.getDefaultState();
        GRAVEL = Blocks.GRAVEL.getDefaultState();
        DIRT = Blocks.DIRT.getDefaultState();

        GRAVEYARD_CONFIG = new TernarySurfaceConfig(GRASS_BLOCK, DIRT, GRAVEL);
    }
}
