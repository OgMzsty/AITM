package com.mstzy.aitm.init;

import com.mstzy.aitm.blocks.BlockTardis;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;

public class AIBlocks {

    public static final RegistryObject<Block> TARDIS = register(new BlockTardis(AbstractBlock.Properties.of(Material.BARRIER).noOcclusion().dynamicShape()), "tardis", ItemGroup.TAB_BUILDING_BLOCKS);


    public static <T extends Block> RegistryObject<T> register(T block, String name, ItemGroup group) {

        if(group != null) {
            AIRegistry.ITEM_REGISTER.register(name, () -> new BlockItem(block, new Item.Properties().tab(group)));
        }

        return AIRegistry.BLOCK_REGISTER.register(name, () -> block);
    }
}
