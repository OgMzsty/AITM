package com.mstzy.aitm.init;

import com.mstzy.aitm.AITM;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class AIRegistry {
    public static boolean initialized = false;

    public static final DeferredRegister<Block> BLOCK_REGISTER = DeferredRegister.create(ForgeRegistries.BLOCKS, AITM.MODID);
    public static final DeferredRegister<Item> ITEM_REGISTER = DeferredRegister.create(ForgeRegistries.ITEMS, AITM.MODID);
    public static final DeferredRegister<TileEntityType<?>> TILE_ENTITY_REGISTER = DeferredRegister.create(ForgeRegistries.TILE_ENTITIES, AITM.MODID);


    public static void register() {



        if(!initialized) {

            new AIBlocks();
            new AITiles();

            IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

            BLOCK_REGISTER.register(bus);
            ITEM_REGISTER.register(bus);
            TILE_ENTITY_REGISTER.register(bus);

            initialized = true;
        }
    }
}
