package com.mzsty.aitm.client.render;

import com.mzsty.aitm.AITM;
import com.mstzy.aitm.client.models.ModelEleventhTardis;
import com.mzsty.aitm.common.tile.TileTardis;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.tileentity.TileEntityRenderer;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.vector.Vector3f;

public class RenderTardis extends TileEntityRenderer<TileTardis> {

    public ModelEleventhTardis model = new ModelEleventhTardis();
    public ResourceLocation location = new ResourceLocation(AITM.MODID, "textures/blocks/eleventh_tardis.png");

    public RenderTardis(TileEntityRendererDispatcher p_i226006_1_) {
        super(p_i226006_1_);
    }

    @Override
    public void render(TileTardis p_225616_1_, float p_225616_2_, MatrixStack p_225616_3_, IRenderTypeBuffer p_225616_4_, int p_225616_5_, int p_225616_6_) {
        p_225616_3_.pushPose();
        p_225616_3_.translate(0.5, 0, 0.5);
        p_225616_3_.scale(0.75f, 0.75f, 0.75f);
        p_225616_3_.translate(0, 1.501f, 0);
        p_225616_3_.mulPose(Vector3f.XN.rotationDegrees(180f));
        model.renderToBuffer(p_225616_3_, p_225616_4_.getBuffer(RenderType.entityTranslucent(location)), p_225616_5_, p_225616_6_, 1, 1, 1, 1);
        p_225616_3_.popPose();
    }
}
