package co.origamigames.quazimodded.item;

import java.util.function.Supplier;

import co.origamigames.quazimodded.init.QMItems;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Lazy;

public enum QMArmorMaterials implements ArmorMaterial {
    HERMES_BOOTS("hermes_boots", 92, 4, 2, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0, () -> {
        return null;
    }),
    LEAD_HELMET("lead_helmet", 144, 25, 1, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0, () -> {
        return Ingredient.ofItems(QMItems.LEAD_INGOT);
    });

    private final String name;
    private final int durability;
    private final int enchantability;
    private final int protectionAmount;
    private final SoundEvent equipSound;
    private final float toughness;
    private final Lazy<Ingredient> repairIngredient;

    @SuppressWarnings("all")
    private QMArmorMaterials(String name, int durability, int enchantability, int protectionAmount, SoundEvent equipSound, float toughness,
            Supplier<Ingredient> repairIngredient) {
        this.name = name;
        this.durability = durability;
        this.enchantability = enchantability;
        this.protectionAmount = protectionAmount;
        this.equipSound = equipSound;
        this.toughness = toughness;
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
}
