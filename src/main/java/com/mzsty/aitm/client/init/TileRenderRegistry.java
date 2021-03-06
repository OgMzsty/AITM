package com.mzsty.aitm.client.init;

import com.mzsty.aitm.client.render.WhitekerRenderer;
import com.mzsty.aitm.common.init.AITiles;
import net.minecraft.client.renderer.tileentity.TileEntityRenderer;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.client.registry.ClientRegistry;

import java.util.function.Function;

public class TileRenderRegistry {


    public static void register() {
        bindTileEntityRenderer(AITiles.TARDIS, WhitekerRenderer::new);
    }

    public static <T extends TileEntity> void bindTileEntityRenderer(RegistryObject<TileEntityType<T>> tileEntityType, Function<? super TileEntityRendererDispatcher, ? extends TileEntityRenderer<? super T>> rendererFactory) {
        ClientRegistry.bindTileEntityRenderer(tileEntityType.get(), rendererFactory);
    }
}
