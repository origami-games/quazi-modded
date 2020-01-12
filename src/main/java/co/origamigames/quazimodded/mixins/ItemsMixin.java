package co.origamigames.quazimodded.mixins;

import org.objectweb.asm.Opcodes;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.Slice;

import co.origamigames.quazimodded.init.QMItems;

import org.spongepowered.asm.mixin.injection.At;

import net.minecraft.item.Item;
import net.minecraft.item.Items;

@Mixin(Items.class)
public class ItemsMixin {
    @ModifyArg(method = "<clinit>", at = @At(value = "INVOKE", target = "Lnet/minecraft/item/Item;<init>(Lnet/minecraft/item/Item$Settings;)V"), slice = @Slice(from = @At(value = "CONSTANT", args = "stringValue=honeycomb"), to = @At(value = "FIELD", target = "Lnet/minecraft/item/Items;HONEYCOMB:Lnet/minecraft/item/Item;", opcode = Opcodes.PUTSTATIC)))
    private static Item.Settings modifyItemSettings(Item.Settings original) {
        return original.recipeRemainder(QMItems.BEESWAX);
    }
}
