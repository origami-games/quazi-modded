package co.origamigames.quazimodded.mixins;

import co.origamigames.quazimodded.QuaziModded;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.EnchantingTableBlock;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(EnchantingTableBlock.class)
public class EnchantingTableBlockMixin {

	@Redirect(method = "randomDisplayTick", at = @At(value = "INVOKE", target = "Lnet/minecraft/block/BlockState;getBlock()Lnet/minecraft/block/Block;"))
	private Block getReplacedBlock(BlockState state) {
		if (QuaziModded.ENCHANTMENT_BOOSTERS.contains(state.getBlock())) return Blocks.BOOKSHELF;
		else return Blocks.AIR;
	}
}
