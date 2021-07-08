package com.mzsty.aitm.common.init;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

import java.util.function.Supplier;

public class AITabs {
	public static final ItemGroup TARDIS_ITEMS = register("tardis_items", () -> Items.ACACIA_BOAT);
	public static final ItemGroup TARDIS_BLOCKS = register("tardis_blocks", () -> Items.ACACIA_BOAT);
	public static final ItemGroup GADGETS = register("sonic", () -> Items.ACACIA_BOAT);


	//================================== METHODS ==================================
	public static ItemGroup register(String name, Supplier<Item> icon) {
		return new ItemGroup(name) {
			@Override public ItemStack makeIcon() {
				return new ItemStack(icon.get());
			}
		};
	}
}
