package com.mzsty.aitm.common.blocks;

import com.mzsty.aitm.common.tile.TileTardis;
import net.minecraft.block.Block;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockReader;

import javax.annotation.Nullable;

public class BlockTardis extends Block {

    public BlockTardis(Properties p_i48440_1_) {
        super(p_i48440_1_);
    }

    @Override
    public BlockRenderType getRenderShape(BlockState p_149645_1_) {
        return BlockRenderType.ENTITYBLOCK_ANIMATED;
    }

    @Override
    public boolean hasTileEntity(BlockState state) {
        return true;
    }

    @Nullable @Override public TileEntity createTileEntity(BlockState state, IBlockReader world) {
        return new TileTardis();
    }
}
