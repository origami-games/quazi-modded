package co.origamigames.quazimodded.mixin;

import co.origamigames.quazimodded.world.biome.*;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.dimension.Dimension;
import net.minecraft.world.dimension.DimensionType;
import net.minecraft.world.dimension.OverworldDimension;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(OverworldDimension.class)
public abstract class OverworldDimensionMixin extends Dimension {
    public OverworldDimensionMixin(World world, DimensionType type, float f) {
        super(world, type, f);
    }

    @Environment(EnvType.CLIENT)
    @Inject(method = "isFogThick", at = @At("HEAD"), cancellable = true)
    private void isFogThick(int x, int z, CallbackInfoReturnable<Boolean> cir) {
        Biome biome = world.getBiome(new BlockPos(x, 0, z));
        if (biome instanceof GraveyardBiome) {
            cir.setReturnValue(true);
        }
    }
}
