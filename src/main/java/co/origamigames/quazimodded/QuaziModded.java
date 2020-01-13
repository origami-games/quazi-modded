package co.origamigames.quazimodded;

import co.origamigames.quazimodded.init.*;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class QuaziModded implements ModInitializer {

    public static final String MOD_ID = "quazi-modded";
    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "item_group"), () -> new ItemStack(QMBlocks.REINFORCED_GLASS));

	@Override
	public void onInitialize() {
        QMBiomes.registerAll();
        QMBlocks.registerAll();
        QMBlocks.addBlocksToFuelRegistry();
        QMLootAdditions.registerAll();

        QMTags.init();

        new QMEntities();
        new QMItems();

        // world gen
        QMWorldGen.addFeatures();
    }
}
