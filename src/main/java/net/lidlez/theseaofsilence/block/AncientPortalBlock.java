package net.lidlez.theseaofsilence.block;

import jdk.jfr.Enabled;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;

public class AncientPortalBlock extends Block {

    public static final BooleanProperty IS_ACTIVE = BlockStateProperties.ENABLED;

    public AncientPortalBlock(Properties pProperties) {
        super(pProperties);
    }
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        pBuilder.add(IS_ACTIVE);
    }
}
