package co.origamigames.quazimodded.item;

import java.util.UUID;

import com.google.common.collect.Multimap;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;

public class HermesBootsItem extends ArmorItem {
    private static final UUID MOVEMENT_SPEED_MODIFIER_UUID = UUID.fromString("909E118E-F978-41C5-9EDA-BA100BF9CE65");
    private final double movementSpeed = 35;

    public HermesBootsItem(ArmorMaterial material, EquipmentSlot slot, Settings settings) {
        super(material, slot, settings);
    }

    @Override
    public Multimap<String, EntityAttributeModifier> getModifiers(EquipmentSlot slot) {
        Multimap<String, EntityAttributeModifier> multimap = super.getModifiers(slot);
        if (slot == EquipmentSlot.FEET) {
            multimap.put(EntityAttributes.MOVEMENT_SPEED.getId(),
                    new EntityAttributeModifier(MOVEMENT_SPEED_MODIFIER_UUID, "Movement speed modifier",
                            (double) this.movementSpeed / 100, EntityAttributeModifier.Operation.MULTIPLY_BASE));
      }

      return multimap;
    }
}
