package net.lidlez.theseaofsilence.datagen;

import net.lidlez.theseaofsilence.TheSeaOfSilence;
import net.lidlez.theseaofsilence.item.ModItems;
import net.lidlez.theseaofsilence.loot.AddItemsModifier;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.common.data.GlobalLootModifierProvider;
import net.minecraftforge.common.loot.LootTableIdCondition;

public class ModGlobalLootModifiers extends GlobalLootModifierProvider {
    public ModGlobalLootModifiers(PackOutput output) {
        super(output, TheSeaOfSilence.MOD_ID);
    }

    @Override
    protected void start() {
        add("first_page_from_guard", new AddItemsModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/elder_guardian")).build()
        }, ModItems.LOST_PAGE_1.get()));
    }
}
