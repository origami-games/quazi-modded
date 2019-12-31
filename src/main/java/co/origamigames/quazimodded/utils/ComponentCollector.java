package co.origamigames.quazimodded.utils;

import it.unimi.dsi.fastutil.objects.Object2IntMap;
import net.minecraft.block.Block;

public interface ComponentCollector {
	Object2IntMap<Block> getActivatingBlocks();
}
