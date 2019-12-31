package co.origamigames.quazimodded.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.EntityContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.FlintAndSteelItem;
import net.minecraft.item.ItemStack;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;

public class CandleBlock extends Block {
    protected static final VoxelShape BOUNDING_SHAPE = Block.createCuboidShape(6.0D, 0.0D, 6.0D, 10.0D, 6.0D, 10.0D);
    public static final BooleanProperty LIT = BooleanProperty.of("lit");

    public CandleBlock(Settings settings) {
        super(settings);
        this.setDefaultState(
                (BlockState) ((BlockState) ((BlockState) this.stateManager.getDefaultState()).with(LIT, false)));
    }

    public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, EntityContext ePos) {
        return BOUNDING_SHAPE;
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> stateManager) {
        stateManager.add(LIT);
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand,
            BlockHitResult hit) {
        if (!state.get(LIT) && player.inventory.getMainHandStack().getItem() instanceof FlintAndSteelItem) {
            world.setBlockState(pos, state.with(LIT, true));
            world.playSound(player, pos, SoundEvents.ITEM_FLINTANDSTEEL_USE, SoundCategory.BLOCKS, 1.0F, 1.8f);
            spawnParticles(world, pos);

            if (!player.isCreative()) {
                ItemStack stack = player.getStackInHand(hand);
				stack.damage(1, player, ((p) -> {
				p.sendToolBreakStatus(hand);
				}));
			}

            return ActionResult.SUCCESS;
        }

        return ActionResult.FAIL;
    }

    @Override
    public int getLuminance(BlockState state) {
        return (boolean) state.get(LIT) ? super.getLuminance(state) : 0;
    }

    public BlockState getStateForNeighborUpdate(BlockState state, Direction facing, BlockState neighborState,
            IWorld world, BlockPos pos, BlockPos neighborPos) {
        return facing == Direction.DOWN && !this.canPlaceAt(state, world, pos) ? Blocks.AIR.getDefaultState()
                : super.getStateForNeighborUpdate(state, facing, neighborState, world, pos, neighborPos);
    }

    private static void spawnParticles(World world, BlockPos pos) {
        double d = (double) pos.getX() + 0.5D;
        double e = (double) pos.getY() + 0.5D;
        double f = (double) pos.getZ() + 0.5D;
        world.addParticle(ParticleTypes.SMOKE, d, e, f, 0.0D, 0.0D, 0.0D);
        world.addParticle(ParticleTypes.FLAME, d, e, f, 0.0D, 0.0D, 0.0D);
    }

    @Override
    public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
        if (state.get(LIT))
            spawnParticles(world, pos);
    }
}
