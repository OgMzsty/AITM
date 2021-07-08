package com.mzsty.aitm.client.models;

// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class WhitekerModel extends EntityModel<Entity> {
	private final ModelRenderer RightDoor;
	private final ModelRenderer LeftDoor;
	private final ModelRenderer bb_main;

	public WhitekerModel() {
		texWidth = 256;
		texHeight = 256;

		RightDoor = new ModelRenderer(this);
		RightDoor.setPos(-8.25F, 5.5F, -10.25F);
		RightDoor.setTexSize(76, 112).addBox(7.75F, -16.5F, -0.25F, 1.0F, 33.0F, 2.0F, 0.0F, false);
		RightDoor.setTexSize(82, 109).addBox(0.0F, -16.5F, 0.0F, 8.0F, 33.0F, 2.0F, 0.0F, false);

		LeftDoor = new ModelRenderer(this);
		LeftDoor.setPos(8.25F, 5.5F, -10.25F);
		setRotationAngle(LeftDoor, 0.0F, 1.5272F, 0.0F);
		LeftDoor.setTexSize(110, 46).addBox(-8.0F, -16.5F, 0.0F, 8.0F, 33.0F, 2.0F, 0.0F, false);

		bb_main = new ModelRenderer(this);
		bb_main.setPos(0.0F, 24.0F, 0.0F);
		bb_main.setTexSize(0, 0).addBox(-12.0F, -2.0F, -12.0F, 24.0F, 2.0F, 24.0F, 0.0F, false);
		bb_main.setTexSize(0, 53).addBox(-11.0F, -2.25F, -11.0F, 22.0F, 1.0F, 22.0F, 0.0F, false);
		bb_main.setTexSize(120, 0).addBox(8.25F, -39.0F, -11.25F, 3.0F, 37.0F, 3.0F, 0.0F, false);
		bb_main.setTexSize(64, 112).addBox(-11.25F, -39.0F, -11.25F, 3.0F, 37.0F, 3.0F, 0.0F, false);
		bb_main.setTexSize(52, 112).addBox(-11.25F, -39.0F, 8.25F, 3.0F, 37.0F, 3.0F, 0.0F, false);
		bb_main.setTexSize(40, 112).addBox(8.25F, -39.0F, 8.25F, 3.0F, 37.0F, 3.0F, 0.0F, false);
		bb_main.setTexSize(0, 76).addBox(-10.25F, -35.0F, -9.0F, 2.0F, 33.0F, 18.0F, 0.0F, false);
		bb_main.setTexSize(108, 107).addBox(-9.0F, -35.0F, 8.25F, 18.0F, 33.0F, 2.0F, 0.0F, false);
		bb_main.setTexSize(70, 58).addBox(8.25F, -35.0F, -9.0F, 2.0F, 33.0F, 18.0F, 0.0F, false);
		bb_main.setTexSize(6, 127).addBox(8.5F, -35.0F, -0.5F, 2.0F, 33.0F, 1.0F, 0.0F, false);
		bb_main.setTexSize(0, 127).addBox(-10.5F, -35.0F, -0.5F, 2.0F, 33.0F, 1.0F, 0.0F, false);
		bb_main.setTexSize(102, 109).addBox(-0.5F, -38.0F, 8.5F, 1.0F, 36.0F, 2.0F, 0.0F, false);
		bb_main.setTexSize(66, 26).addBox(-9.0F, -42.0F, -9.0F, 18.0F, 2.0F, 18.0F, 0.0F, false);
		bb_main.setTexSize(0, 26).addBox(-11.0F, -40.0F, -11.0F, 22.0F, 5.0F, 22.0F, 0.0F, false);
		bb_main.setTexSize(22, 76).addBox(-10.0F, -39.0F, -12.0F, 20.0F, 3.0F, 1.0F, 0.0F, false);
		bb_main.setTexSize(40, 89).addBox(-12.0F, -39.0F, -10.0F, 1.0F, 3.0F, 20.0F, 0.0F, false);
		bb_main.setTexSize(66, 53).addBox(-10.0F, -39.0F, 11.0F, 20.0F, 3.0F, 1.0F, 0.0F, false);
		bb_main.setTexSize(72, 0).addBox(11.0F, -39.0F, -10.0F, 1.0F, 3.0F, 20.0F, 0.0F, false);
		bb_main.setTexSize(0, 7).addBox(-3.0F, -43.0F, -3.0F, 6.0F, 1.0F, 6.0F, 0.0F, false);
		bb_main.setTexSize(4, 27).addBox(-1.5F, -47.0F, -1.5F, 3.0F, 4.0F, 3.0F, 0.0F, false);
		bb_main.setTexSize(0, 1).addBox(-2.5F, -48.0F, -2.5F, 5.0F, 1.0F, 5.0F, 0.0F, false);
		bb_main.setTexSize(0, 10).addBox(0.0F, -47.0F, -3.0F, 0.0F, 4.0F, 6.0F, 0.0F, false);
		bb_main.setTexSize(0, 6).addBox(0.0F, -47.0F, -3.0F, 0.0F, 4.0F, 6.0F, 0.0F, false);
	}

	@Override public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		RightDoor.render(matrixStack, buffer, packedLight, packedOverlay);
		LeftDoor.render(matrixStack, buffer, packedLight, packedOverlay);
		bb_main.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}