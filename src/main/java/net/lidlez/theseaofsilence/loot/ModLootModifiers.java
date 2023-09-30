package net.lidlez.theseaofsilence.loot;

import com.mojang.serialization.Codec;
import net.lidlez.theseaofsilence.TheSeaOfSilence;
import net.minecraftforge.common.loot.IGlobalLootModifier;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModLootModifiers  {

    public static final DeferredRegister<Codec<? extends IGlobalLootModifier>> LOOT_MODIFIER_SEREALIZERS =
            DeferredRegister.create(ForgeRegistries.Keys.GLOBAL_LOOT_MODIFIER_SERIALIZERS, TheSeaOfSilence.MOD_ID);

    public static final RegistryObject<Codec<? extends IGlobalLootModifier>> ADD_ITEM =
            LOOT_MODIFIER_SEREALIZERS.register("add_item", AddItemsModifier.CODEC);

    public static void register(IEventBus eventBus) {
        LOOT_MODIFIER_SEREALIZERS.register(eventBus);
    }

}
