package co.origamigames.quazimodded.utils;

import net.minecraft.container.Property;
import net.minecraft.enchantment.InfoEnchantment;
import net.minecraft.item.ItemStack;

import java.util.List;
import java.util.Random;

public interface EnchantingTableAccessors {
    Random qm_getRandom();

    Property qm_getSeed();

    List<InfoEnchantment> qm_getEnchantments(ItemStack stack, int slot, int enchantingPower);
}
