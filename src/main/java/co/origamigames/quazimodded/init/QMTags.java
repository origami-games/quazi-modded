package co.origamigames.quazimodded.init;

import co.origamigames.quazimodded.QuaziModded;
import net.fabricmc.fabric.api.tag.TagRegistry;
import net.minecraft.block.Block;
import net.minecraft.tag.Tag;
import net.minecraft.util.Identifier;

public class QMTags {
    public static final Tag<Block> BOOKSHELVES = blockTag("bookshelves");
    public static final Tag<Block> QUILTED_WOOL = blockTag("quilted_wool");
    public static final Tag<Block> REINFORCED_PLANKS = blockTag("reinforced_planks");

    private static Tag<Block> blockTag(String path) {
        return TagRegistry.block(new Identifier(QuaziModded.MOD_ID, path));
    }
}
