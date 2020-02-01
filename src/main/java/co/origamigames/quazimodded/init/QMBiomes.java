package co.origamigames.quazimodded.init;

import co.origamigames.quazimodded.QuaziModded;
import co.origamigames.quazimodded.world.biome.*;
import co.origamigames.sheet.SheetLib;
import net.fabricmc.fabric.api.biomes.v1.OverworldClimate;
import net.minecraft.world.biome.Biome;

// currently all unused
public class QMBiomes {
    public static final Biome GRAVEYARD = overworldBiome("graveyard", new GraveyardBiome(), OverworldClimate.COOL, .5d);

    private static Biome overworldBiome(String id, Biome biome, OverworldClimate climate, double weight) {
        return SheetLib.overworldBiome(QuaziModded.MOD_ID, id, biome, climate, weight);
    }
}
