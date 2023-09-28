package org.lidlez.theseaofsilence.item;


import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.lidlez.theseaofsilence.TheSeaOfSilence;

public class ModItems {

    

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(TheSeaOfSilence.MOD_ID, name), item);
    }

    public static void registerModItems() {
        TheSeaOfSilence.LOGGER.info("Register mod items for " + TheSeaOfSilence.MOD_ID);
    }
}
