package com.mstzy.aitm.client.models;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelEleventhTardis extends EntityModel<Entity> {
    private final ModelRenderer bb_main3;
    private final ModelRenderer rigthdoor;
    private final ModelRenderer leftdoor;

    public ModelEleventhTardis() {
        texWidth = 256;
        texHeight = 256;

        bb_main3 = new ModelRenderer(this);
        bb_main3.setPos(0.0F, 24.0F, 0.0F);
        bb_main3.texOffs(0, 0).addBox(-18.0F, -2.0F, -18.0F, 36.0F, 2.0F, 36.0F, 0.0F, false);
        bb_main3.texOffs(118, 163).addBox(-17.0F, -59.0F, -17.0F, 3.0F, 57.0F, 3.0F, 0.0F, false);
        bb_main3.texOffs(106, 163).addBox(-17.0F, -59.0F, 14.0F, 3.0F, 57.0F, 3.0F, 0.0F, false);
        bb_main3.texOffs(0, 38).addBox(-16.0F, -61.0F, -16.0F, 32.0F, 8.0F, 32.0F, 0.0F, false);
        bb_main3.texOffs(0, 78).addBox(-14.0F, -63.0F, -14.0F, 28.0F, 2.0F, 28.0F, 0.0F, false);
        bb_main3.texOffs(0, 0).addBox(-3.0F, -64.0F, -3.0F, 6.0F, 1.0F, 6.0F, 0.0F, false);
        bb_main3.texOffs(0, 0).addBox(-3.0F, -70.0F, -3.0F, 6.0F, 1.0F, 6.0F, 0.0F, false);
        bb_main3.texOffs(0, 7).addBox(-2.0F, -71.0F, -2.0F, 4.0F, 7.0F, 4.0F, 0.0F, false);
        bb_main3.texOffs(94, 163).addBox(14.0F, -59.0F, 14.0F, 3.0F, 57.0F, 3.0F, 0.0F, false);
        bb_main3.texOffs(62, 108).addBox(14.0F, -59.0F, -17.0F, 3.0F, 57.0F, 3.0F, 0.0F, false);
        bb_main3.texOffs(0, 108).addBox(-15.0F, -53.0F, -14.0F, 1.0F, 51.0F, 28.0F, 0.0F, false);
        bb_main3.texOffs(142, 142).addBox(-14.0F, -53.0F, -15.0F, 28.0F, 51.0F, 1.0F, 0.0F, false);
        bb_main3.texOffs(142, 90).addBox(-18.0F, -58.0F, -16.0F, 2.0F, 4.0F, 32.0F, 0.0F, false);
        bb_main3.texOffs(108, 0).addBox(16.0F, -58.0F, -16.0F, 2.0F, 4.0F, 32.0F, 0.0F, false);
        bb_main3.texOffs(142, 132).addBox(-16.0F, -58.0F, 16.0F, 32.0F, 4.0F, 2.0F, 0.0F, false);
        bb_main3.texOffs(142, 126).addBox(-16.0F, -58.0F, -18.0F, 32.0F, 4.0F, 2.0F, 0.0F, false);
        bb_main3.texOffs(84, 84).addBox(14.0F, -53.0F, -14.0F, 1.0F, 51.0F, 28.0F, 0.0F, false);

        rigthdoor = new ModelRenderer(this);
        rigthdoor.setPos(-14.0F, -2.0F, 14.0F);
        bb_main3.addChild(rigthdoor);
        rigthdoor.texOffs(144, 36).addBox(0.0F, -51.0F, 0.0F, 13.0F, 51.0F, 1.0F, 0.0F, false);
        rigthdoor.texOffs(24, 0).addBox(12.0F, -34.0F, 0.5F, 1.0F, 6.0F, 1.0F, 0.0F, false);

        leftdoor = new ModelRenderer(this);
        leftdoor.setPos(14.0F, -2.0F, 14.0F);
        bb_main3.addChild(leftdoor);
        leftdoor.texOffs(172, 36).addBox(-15.0F, -51.0F, 0.0F, 15.0F, 51.0F, 1.0F, 0.0F, false);
        leftdoor.texOffs(22, 7).addBox(-12.0F, -34.0F, 0.5F, 1.0F, 5.0F, 1.0F, 0.0F, false);
    }


    @Override
    public void setupAnim(Entity p_225597_1_, float p_225597_2_, float p_225597_3_, float p_225597_4_, float p_225597_5_, float p_225597_6_) {

    }

    @Override
    public void renderToBuffer(MatrixStack p_225598_1_, IVertexBuilder p_225598_2_, int p_225598_3_, int p_225598_4_, float p_225598_5_, float p_225598_6_, float p_225598_7_, float p_225598_8_) {
        bb_main3.render(p_225598_1_, p_225598_2_, p_225598_3_, p_225598_4_, p_225598_5_, p_225598_6_, p_225598_7_, p_225598_8_);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.xRot = x;
        modelRenderer.yRot = y;
        modelRenderer.zRot = z;
    }
}