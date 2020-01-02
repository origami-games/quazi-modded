package co.origamigames.quazimodded.init;

import co.origamigames.quazimodded.QuaziModded;
import co.origamigames.quazimodded.world.biome.*;
import net.fabricmc.fabric.api.biomes.v1.FabricBiomes;
import net.fabricmc.fabric.api.biomes.v1.OverworldBiomes;
import net.fabricmc.fabric.api.biomes.v1.OverworldClimate;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;

public class QMBiomes {

    public static final Biome GRAVEYARD = register("graveyard", new GraveyardBiome());

    public static void registerAll() {
        addOverworldBiome(GRAVEYARD, .5d);
    }

    static void addOverworldBiome(Biome biome, double weight) {
        OverworldBiomes.addContinentalBiome(biome, OverworldClimate.DRY, weight / 2);
        OverworldBiomes.addContinentalBiome(biome, OverworldClimate.TEMPERATE, weight / 2);

        FabricBiomes.addSpawnBiome(biome);
    }

    private static Biome register(String id, Biome biome) {
        return Registry.register(Registry.BIOME, new Identifier(QuaziModded.MOD_ID, id), biome);
    }
}
