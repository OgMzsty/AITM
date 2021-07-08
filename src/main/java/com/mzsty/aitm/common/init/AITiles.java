    package com.mzsty.aitm.common.init;

import com.mzsty.aitm.common.tile.TileTardis;
import net.minecraft.block.Block;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;

import java.util.function.Supplier;

public class AITiles {
    public static final RegistryObject<TileEntityType<TileTardis>> TARDIS = addType("tardis", TileTardis::new, AIBlocks.TARDIS);

    public static <T extends TileEntity> RegistryObject<TileEntityType<T>> addType(String name, Supplier<T> tileEntitySupplier, RegistryObject<? extends Block> block) {
        return AIRegistry.TILE_ENTITY_REGISTER.register(name, () -> TileEntityType.Builder.of(tileEntitySupplier, block.get()).build(null));
    }
}
