package net.lidlez.theseaofsilence.screen;

import net.lidlez.theseaofsilence.TheSeaOfSilence;
import net.minecraft.client.gui.screens.inventory.ContainerScreen;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.ChestMenu;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class StoryBookScreen extends ContainerScreen {
    private final ResourceLocation GUI = new ResourceLocation(TheSeaOfSilence.MOD_ID, "textures/gui/story_book_gui.png");

    public StoryBookScreen(ChestMenu pMenu, Inventory pPlayerInventory, Component pTitle) {
        super(pMenu, pPlayerInventory, pTitle);
    }


}
