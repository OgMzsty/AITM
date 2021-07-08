package com.mzsty.aitm.client.render;

import com.mzsty.aitm.AITM;
import com.mzsty.aitm.client.models.ModelEleventhTardis;
import com.mzsty.aitm.common.tile.TileTardis;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.tileentity.TileEntityRenderer;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.vector.Vector3f;

public class SmithRenderer extends TileEntityRenderer<TileTardis> {
    public ModelEleventhTardis model = new ModelEleventhTardis();
    public ResourceLocation texture = new ResourceLocation(AITM.MODID, "textures/blocks/eleventh_tardis.png");

    public SmithRenderer(TileEntityRendererDispatcher p_i226006_1_) {
        super(p_i226006_1_);
    }

    @Override public void render(TileTardis tardis, float partial_ticks, MatrixStack matrix_stack, IRenderTypeBuffer buffer, int p_225616_5_, int p_225616_6_) {
        matrix_stack.pushPose();
        matrix_stack.translate(0.5, 0, 0.5);
        matrix_stack.scale(0.75f, 0.75f, 0.75f);
        matrix_stack.translate(0, 1.501f, 0);
        matrix_stack.mulPose(Vector3f.XN.rotationDegrees(180f));
        model.renderToBuffer(matrix_stack, buffer.getBuffer(RenderType.entityTranslucent(texture)), p_225616_5_, p_225616_6_, 1, 1, 1, 1);
        matrix_stack.popPose();
    }
}
