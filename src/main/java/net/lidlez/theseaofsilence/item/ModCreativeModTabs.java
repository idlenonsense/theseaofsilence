package net.lidlez.theseaofsilence.item;

import net.lidlez.theseaofsilence.TheSeaOfSilence;
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
                        pOutput.accept(ModItems.SHALLOW_MIXTURE.get());
                        pOutput.accept(ModItems.LANGUID_DUST.get());
                        pOutput.accept(ModItems.STAFF_OF_SILENCE.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
