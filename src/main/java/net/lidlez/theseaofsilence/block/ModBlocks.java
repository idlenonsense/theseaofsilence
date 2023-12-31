package net.lidlez.theseaofsilence.block;

import net.lidlez.theseaofsilence.TheSeaOfSilence;
import net.lidlez.theseaofsilence.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, TheSeaOfSilence.MOD_ID);

    /*
    * Непосредственно добавляем блоки
    */
    public static  final RegistryObject<Block> LANGUID_STONE = registerBlock("languid_stone",
            () -> new LanguidStoneBlock(BlockBehaviour.Properties.of().sound(SoundType.AMETHYST).strength(1.2F, 3.0F).noLootTable()));
    public static  final RegistryObject<Block> WATER_LILY = BLOCKS.register("water_lily",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.POPPY)));
    public static  final RegistryObject<Block> ANCIENT_PORTAL = registerBlock("ancient_portal",
            () -> new AncientPortalBlock(BlockBehaviour.Properties.copy(Blocks.BEDROCK).noLootTable()));



    /*
     * Система регистрации блоков
     */
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return  toReturn;
    }

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block){
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }



    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}

