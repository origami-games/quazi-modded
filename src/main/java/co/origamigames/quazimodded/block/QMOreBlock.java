package co.origamigames.quazimodded.block;

import co.origamigames.quazimodded.init.QMBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

import java.util.Random;

public class QMOreBlock extends Block {
    public QMOreBlock(Block.Settings settings) {
        super(settings);
    }

    public void onStacksDropped(BlockState state, World world, BlockPos pos, ItemStack stack) {
        super.onStacksDropped(state, world, pos, stack);
        if (EnchantmentHelper.getLevel(Enchantments.SILK_TOUCH, stack) > 0) {
            return;
        }
        int exp = this.getExperienceWhenMined(world.random);
        if (exp > 0) {
            this.dropExperience(world, pos, exp);
        }
    }

    protected int getExperienceWhenMined(Random random) {
        if(this == QMBlocks.AMETHYST_ORE) {
            return MathHelper.nextInt(random, 3, 7);
        } else {
            return 0;
        }
    }
}
