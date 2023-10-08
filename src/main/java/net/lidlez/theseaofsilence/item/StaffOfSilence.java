package net.lidlez.theseaofsilence.item;

import net.lidlez.theseaofsilence.block.AncientPortalBlock;
import net.lidlez.theseaofsilence.block.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;


public class StaffOfSilence extends Item {

    public StaffOfSilence(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public InteractionResult useOn(UseOnContext pContext) {
        Level level = pContext.getLevel();
        BlockPos blockpos = pContext.getClickedPos();
        BlockState blockstate = level.getBlockState(blockpos);
        Player player = pContext.getPlayer();
        if (blockstate.is(ModBlocks.ANCIENT_PORTAL.get()) && !blockstate.getValue(AncientPortalBlock.ACTIVE)) {
            if (level.isClientSide) {
                return InteractionResult.SUCCESS;
            } else {
                player.setHealth(10f);
                BlockState blockstate1 = blockstate.setValue(AncientPortalBlock.ACTIVE, Boolean.valueOf(true));
                level.setBlock(blockpos, blockstate1, 2);
                pContext.getItemInHand().shrink(1);
                }
                return InteractionResult.CONSUME;
        } else {
            return InteractionResult.PASS;
        }
    }


}
