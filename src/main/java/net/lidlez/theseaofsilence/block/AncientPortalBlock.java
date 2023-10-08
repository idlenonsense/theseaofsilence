package net.lidlez.theseaofsilence.block;

import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;

public class AncientPortalBlock extends Block {
    public static final BooleanProperty IS_ACTIVE = BooleanProperty.create("is_active");
    public static final BooleanProperty ACTIVE = IS_ACTIVE;

    public AncientPortalBlock(Properties pProperties) {
        super(pProperties);
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        pBuilder.add(ACTIVE);
    }

    public BlockState getStateForPlacement(BlockPlaceContext pContext) {
        return this.defaultBlockState().setValue(ACTIVE, Boolean.valueOf(false));
    }
}
