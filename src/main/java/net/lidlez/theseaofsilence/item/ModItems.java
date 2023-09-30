package net.lidlez.theseaofsilence.item;

import net.lidlez.theseaofsilence.TheSeaOfSilence;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TheSeaOfSilence.MOD_ID);

    public static final RegistryObject<Item> SHALLOW_MIXTURE = ITEMS.register("shallow_mixture",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LANGUID_DUST = ITEMS.register("languid_dust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STAFF_OF_SILENCE = ITEMS.register("staff_of_silence",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ROUGH_SCALE = ITEMS.register("rough_scale",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SHARD_OF_SILENCE = ITEMS.register("shard_of_silence",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TEAR_OF_MIKOTO = ITEMS.register("tear_of_mikoto",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LOST_PAGE_1 = ITEMS.register("lost_page_1",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LOST_PAGE_2 = ITEMS.register("lost_page_2",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LOST_PAGE_3 = ITEMS.register("lost_page_3",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LOST_PAGE_4 = ITEMS.register("lost_page_4",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
