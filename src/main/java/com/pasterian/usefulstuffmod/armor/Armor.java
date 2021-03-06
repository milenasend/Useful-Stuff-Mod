package com.pasterian.usefulstuffmod.armor;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

import com.pasterian.usefulstuffmod.UMCreativeTabs;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class Armor extends ItemArmor {

	private String texturePath = "pasterian:";
	private String iconPath = "pasterian:";

	public Armor(ArmorMaterial p_i45325_1_, int p_i45325_2_, int p_i45325_3_,String type) {
		super(p_i45325_1_, p_i45325_2_, p_i45325_3_);

		this.setMaxStackSize(1);
		this.setCreativeTab(UMCreativeTabs.usefulStuffTabArmor);
		this.SetArmorType(type.toLowerCase(), p_i45325_3_);
	}

	private void SetArmorType(String type, int p_i45325_3_) {

		switch(p_i45325_3_)
		{
		case 0:
			this.setUnlocalizedName(type + "Helmet");
			this.texturePath += type + "_layer_1.png";
			this.iconPath += type + "_helmet";
			break;
		case 1:
			this.setUnlocalizedName(type + "Chest");
			this.texturePath += type + "_layer_1.png";
			this.iconPath += type + "_chest";
			break;
		case 2:
			this.setUnlocalizedName(type + "Leggings");
			this.texturePath += type + "_layer_2.png";
			this.iconPath += type + "_leggings";
			break;
		case 3:
			this.setUnlocalizedName(type + "Boots");
			this.texturePath += type + "_layer_2.png";
			this.iconPath += type + "_boots";
			break;
		}

	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister reg){

		this.itemIcon = reg.registerIcon(this.iconPath);
		}

	public String getArmorTexture(ItemStack stack, Entity entity, int slot, int layer) {
		return this.texturePath;
	}
}