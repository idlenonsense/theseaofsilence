package net.lidlez.theseaofsilence.item;

import net.lidlez.theseaofsilence.TheSeaOfSilence;
import net.lidlez.theseaofsilence.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TheSeaOfSilence.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TSS_TAB = CREATIVE_MODE_TABS.register("tss_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SHALLOW_MIXTURE.get()))
                    .title(Component.translatable("creativetab.tss_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.LOST_PAGE_1.get());
                        pOutput.accept(ModItems.LOST_PAGE_2.get());
                        pOutput.accept(ModItems.LOST_PAGE_3.get());
                        pOutput.accept(ModItems.LOST_PAGE_4.get());
                        pOutput.accept(ModItems.STORY_BOOK.get());

                        pOutput.accept(ModItems.SHALLOW_MIXTURE.get());
                        pOutput.accept(ModItems.LANGUID_DUST.get());
                        pOutput.accept(ModItems.STAFF_OF_SILENCE.get());
                        pOutput.accept(ModItems.SHARD_OF_SILENCE.get());
                        pOutput.accept(ModItems.ROUGH_SCALE.get());
                        pOutput.accept(ModItems.TEAR_OF_MIKOTO.get());
                        pOutput.accept(ModItems.WATER_LILY.get());
                        pOutput.accept(ModItems.SOUL_CATALYST.get());
                        pOutput.accept(ModItems.LANGUID_SHARD.get());

                        pOutput.accept(ModBlocks.LANGUID_STONE.get());
                        pOutput.accept(ModBlocks.ANCIENT_PORTAL.get());


                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
