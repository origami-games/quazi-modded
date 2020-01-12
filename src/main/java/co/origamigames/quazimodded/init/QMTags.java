package co.origamigames.quazimodded.init;

import co.origamigames.quazimodded.QuaziModded;
import net.fabricmc.fabric.api.tag.TagRegistry;
import net.minecraft.block.Block;
import net.minecraft.tag.Tag;
import net.minecraft.util.Identifier;

public class QMTags {
    public static final Tag<Block> BEE_POLLINATORS = TagRegistry
            .block(new Identifier(QuaziModded.MOD_ID, "bee_pollinators"));

    public static void init() {}
}
