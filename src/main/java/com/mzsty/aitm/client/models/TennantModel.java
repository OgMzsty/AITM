package com.mzsty.aitm.client.models;// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class TennantModel extends EntityModel<Entity> {
	private final ModelRenderer model;
	private final ModelRenderer Shell;
	private final ModelRenderer RightDoor;
	private final ModelRenderer LeftDoor;

	public TennantModel() {
		texWidth = 256;
		texHeight = 256;

		model = new ModelRenderer(this);
		model.setPos(0.0F, 24.0F, 0.0F);
		

		Shell = new ModelRenderer(this);
		Shell.setPos(0.0F, 0.0F, 0.0F);
		model.addChild(Shell);
		Shell.setTexSize(0, 10).addBox(-1.5F, -43.75F, -1.5F, 3.0F, 4.0F, 3.0F, -0.25F, false);
		Shell.setTexSize(60, 49).addBox(-9.0F, -39.0F, -9.0F, 18.0F, 2.0F, 18.0F, 0.0F, false);
		Shell.setTexSize(34, 95).addBox(10.25F, -36.375F, -10.0F, 1.0F, 3.0F, 20.0F, 0.0F, false);
		Shell.setTexSize(63, 33).addBox(-10.0F, -36.375F, 10.25F, 20.0F, 3.0F, 1.0F, 0.0F, false);
		Shell.setTexSize(79, 95).addBox(-11.25F, -36.375F, -10.0F, 1.0F, 3.0F, 20.0F, 0.0F, false);
		Shell.setTexSize(63, 37).addBox(-10.0F, -36.375F, -11.25F, 20.0F, 3.0F, 1.0F, 0.0F, false);
		Shell.setTexSize(0, 24).addBox(-10.5F, -37.0F, -10.5F, 21.0F, 4.0F, 21.0F, 0.0F, false);
		Shell.setTexSize(0, 49).addBox(-10.0F, -2.25F, -10.0F, 20.0F, 1.0F, 20.0F, 0.0F, false);
		Shell.setTexSize(42, 118).addBox(7.75F, -33.0F, -0.5F, 2.0F, 31.0F, 1.0F, 0.0F, false);
		Shell.setTexSize(56, 70).addBox(-0.5F, -36.0F, 7.75F, 1.0F, 34.0F, 2.0F, 0.0F, false);
		Shell.setTexSize(36, 118).addBox(-9.75F, -33.0F, -0.5F, 2.0F, 31.0F, 1.0F, 0.0F, false);
		Shell.setTexSize(0, 70).addBox(7.5F, -33.0F, -7.5F, 2.0F, 31.0F, 15.0F, 0.0F, false);
		Shell.setTexSize(65, 69).addBox(-9.5F, -33.0F, -7.5F, 2.0F, 31.0F, 15.0F, 0.0F, false);
		Shell.setTexSize(88, 0).addBox(-7.5F, -33.0F, 7.5F, 15.0F, 31.0F, 2.0F, 0.0F, false);
		Shell.setTexSize(122, 0).addBox(-7.5F, -33.0F, 1.5F, 15.0F, 31.0F, 2.0F, 0.0F, false);
		Shell.setTexSize(12, 1).addBox(0.0F, -43.875F, -2.0F, 0.0F, 4.0F, 4.0F, 0.0F, false);
		Shell.setTexSize(0, 5).addBox(-2.0F, -39.875F, -2.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);
		Shell.setTexSize(0, 0).addBox(-2.0F, -44.25F, -2.0F, 4.0F, 1.0F, 4.0F, -0.25F, false);
		Shell.setTexSize(12, 6).addBox(0.0F, -43.875F, -2.0F, 0.0F, 4.0F, 4.0F, 0.0F, false);
		Shell.setTexSize(12, 6).addBox(0.0F, -43.875F, -1.5F, 0.0F, 4.0F, 3.0F, 0.0F, false);
		Shell.setTexSize(12, 6).addBox(0.0F, -43.875F, -1.5F, 0.0F, 4.0F, 3.0F, 0.0F, false);
		Shell.setTexSize(45, 13).addBox(-1.5F, -41.125F, -1.5F, 3.0F, 0.0F, 3.0F, 0.0F, false);
		Shell.setTexSize(45, 13).addBox(-1.5F, -42.375F, -1.5F, 3.0F, 0.0F, 3.0F, 0.0F, false);
		Shell.setTexSize(0, 0).addBox(-11.0F, -2.0F, -11.0F, 22.0F, 2.0F, 22.0F, 0.0F, false);
		Shell.setTexSize(24, 116).addBox(-10.25F, -33.0F, -10.25F, 3.0F, 31.0F, 3.0F, 0.0F, false);
		Shell.setTexSize(0, 116).addBox(-10.25F, -33.0F, 7.25F, 3.0F, 31.0F, 3.0F, 0.0F, false);
		Shell.setTexSize(114, 33).addBox(7.25F, -33.0F, 7.25F, 3.0F, 31.0F, 3.0F, 0.0F, false);
		Shell.setTexSize(12, 116).addBox(7.25F, -33.0F, -10.25F, 3.0F, 31.0F, 3.0F, 0.0F, false);

		RightDoor = new ModelRenderer(this);
		RightDoor.setPos(-7.25F, -18.5F, -9.5F);
		model.addChild(RightDoor);
		setRotationAngle(RightDoor, 0.0F, 0.0F, 0.0F);
		RightDoor.setTexSize(74, 116).addBox(6.75F, -14.5F, -0.25F, 1.0F, 31.0F, 2.0F, 0.0F, false);
		RightDoor.setTexSize(34, 70).addBox(0.0F, -14.5F, 0.0F, 7.0F, 31.0F, 2.0F, 0.0F, false);

		LeftDoor = new ModelRenderer(this);
		LeftDoor.setPos(7.25F, -17.5F, -9.5F);
		model.addChild(LeftDoor);
		LeftDoor.setTexSize(101, 69).addBox(-7.0F, -15.5F, 0.0F, 7.0F, 31.0F, 2.0F, 0.0F, false);
	}


	@Override public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		model.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}