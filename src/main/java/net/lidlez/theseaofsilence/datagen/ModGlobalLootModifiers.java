package net.lidlez.theseaofsilence.datagen;

import net.lidlez.theseaofsilence.TheSeaOfSilence;
import net.lidlez.theseaofsilence.item.ModItems;
import net.lidlez.theseaofsilence.loot.AddItemsModifier;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
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
        add("shard_of_silence_from_guard", new AddItemsModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/elder_guardian")).build()
        }, ModItems.SHARD_OF_SILENCE.get()));
        add("story_book_from_village", new AddItemsModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/village/village_cartographer")).build(),
                    LootItemRandomChanceCondition.randomChance(0.3f).build()
        }, ModItems.STORY_BOOK.get()));

        add("soul_catalyst_from_warden", new AddItemsModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/warden")).build()
        }, ModItems.SOUL_CATALYST.get()));
    }
}
