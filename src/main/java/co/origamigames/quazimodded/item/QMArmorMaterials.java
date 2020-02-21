package co.origamigames.quazimodded.item;

import co.origamigames.quazimodded.init.QMItems;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Lazy;

import java.util.function.Supplier;

public enum QMArmorMaterials implements ArmorMaterial {
    HERMES_BOOTS("hermes_boots", 92, 4, 2, 0, 0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, () -> {
        return null;
    }),
    LEAD_HELMET("lead_helmet", 144, 25, 1, 0, 0.05F, SoundEvents.ITEM_ARMOR_EQUIP_IRON, () -> {
        return Ingredient.ofItems(QMItems.LEAD_INGOT);
    });

    private final String name;
    private final int durability;
    private final int enchantability;
    private final int protectionAmount;
    private final float toughness;
    private final float knockbackResistance;
    private final SoundEvent equipSound;
    private final Lazy<Ingredient> repairIngredient;

    @SuppressWarnings("all")
    private QMArmorMaterials(String name, int durability, int enchantability, int protectionAmount, float toughness, float knockbackResistance, SoundEvent equipSound,
            Supplier<Ingredient> repairIngredient) {
        this.name = name;
        this.durability = durability;
        this.enchantability = enchantability;
        this.protectionAmount = protectionAmount;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.equipSound = equipSound;
        this.repairIngredient = new Lazy(repairIngredient);
    }

    @Override
    public int getDurability(EquipmentSlot slot) {
        return this.durability;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getProtectionAmount(EquipmentSlot slot) {
        return this.protectionAmount;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return (Ingredient) this.repairIngredient.get();
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
