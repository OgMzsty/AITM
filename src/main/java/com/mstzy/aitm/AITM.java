package com.mstzy.aitm;

import com.mstzy.aitm.client.init.TileRenderRegistry;
import com.mstzy.aitm.common.init.AIRegistry;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(AITM.MODID)
public class AITM {
    public static AITM INSTANCE;

    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MODID = "aitmmod";

    public AITM() {
        INSTANCE = this;

        AIRegistry.register();
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {

    }

    private void doClientStuff(final FMLClientSetupEvent event) {
        TileRenderRegistry.register();
    }

}
