/*******************************************************************************
 * Copyright (c) 2011-2014 SirSengir.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser Public License v3
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/lgpl-3.0.txt
 *
 * Various Contributors including, but not limited to:
 * SirSengir (original work), CovertJaguar, Player, Binnie, MysteriousAges
 ******************************************************************************/
package forestry.farming.items;

import javax.annotation.Nullable;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

import forestry.core.utils.Translator;
import forestry.farming.models.EnumFarmBlockTexture;

public class ItemBlockFarm extends ItemBlock {

	public ItemBlockFarm(Block block) {
		super(block);
		setHasSubtypes(true);
	}

	@Override
	public int getMetadata(int i) {
		return i;
	}

	@Override
	public void addInformation(ItemStack itemstack, @Nullable World world, List<String> info, ITooltipFlag par4) {
		info.add(Translator.translateToLocal("tile.for.ffarm.tooltip"));
		if (itemstack.getTagCompound() == null) {
			return;
		}
		EnumFarmBlockTexture texture = EnumFarmBlockTexture.getFromCompound(itemstack.getTagCompound());

		info.add(Translator.translateToLocal("tile.for.ffarm.material.tooltip") + texture.getFormatting() + TextFormatting.ITALIC + " "+ texture.getName());
	}

	@Override
	public String getUnlocalizedName(ItemStack itemstack) {
		return super.getUnlocalizedName(itemstack) + "." + itemstack.getItemDamage();
	}
}
