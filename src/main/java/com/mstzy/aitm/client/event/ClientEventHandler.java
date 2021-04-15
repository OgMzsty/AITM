package com.mstzy.aitm.client.event;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screen.MainMenuScreen;
import net.minecraft.client.gui.screen.VideoSettingsScreen;
import net.minecraftforge.client.event.GuiScreenEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class ClientEventHandler {

    @SubscribeEvent
    public void onGUI(GuiScreenEvent.InitGuiEvent.Pre guiScreenEvent) {
        if(guiScreenEvent.getGui() instanceof MainMenuScreen) {
           // guiScreenEvent.setCanceled(true);
          //  Minecraft.getInstance().setScreen(new VideoSettingsScreen(Minecraft.getInstance().screen, Minecraft.getInstance().options));
        }
    }
}
