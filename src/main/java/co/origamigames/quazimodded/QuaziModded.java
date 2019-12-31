package co.origamigames.quazimodded;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import co.origamigames.quazimodded.init.*;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.tag.TagRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.tag.Tag;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class QuaziModded implements ModInitializer {
    
    public static final String MOD_ID = "quazi-modded";
    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "item_group"), () -> new ItemStack(QMBlocks.REINFORCED_GLASS));

    public static final Tag<Block> ENCHANTMENT_BOOSTERS = TagRegistry.block(new Identifier(MOD_ID, "enchantment_boosters"));    

	@Override
	public void onInitialize() {
        QMBiomes.registerAll();
        QMBlocks.registerAll();
        QMLootAdditions.registerAll();

        new QMEntities();
        new QMItems();

        // world gen
        QMWorldGen.addFeatures();
    }

    public static List<ItemStack> getEnchantmentBoosterStacks() {
        List<ItemStack> ret = new ArrayList<>();
        List<Block> blockTag = new ArrayList<>(ENCHANTMENT_BOOSTERS.values());
        List<Item> tag = new ArrayList<>();
        for (Block block : blockTag) {
            Item item = block.asItem();
            if (item != Items.AIR)
                tag.add(item);
        }
        if (tag.contains(Items.BOOKSHELF)) {
            ret.add(new ItemStack(Items.BOOKSHELF));
            tag.remove(Items.BOOKSHELF);
        }
        tag.sort(Comparator.comparing(item -> Registry.ITEM.getId(item).toString()));
        for (Item item : tag) {
            ret.add(new ItemStack(item));
        }
        return ret;
    }
}
