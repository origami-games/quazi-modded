package co.origamigames.quazimodded;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import co.origamigames.quazimodded.init.*;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class QuaziModded implements ModInitializer {

    public static final String MOD_ID = "quazi-modded";
    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "item_group"), () -> new ItemStack(QMBlocks.REINFORCED_GLASS));

	@Override
	public void onInitialize() {
        QMBiomes.registerAll();
        QMBlocks.registerAll();
        QMLootAdditions.registerAll();

        QMTags.init();

        new QMEntities();
        new QMItems();

        // world gen
        QMWorldGen.addFeatures();
    }
}
