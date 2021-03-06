package com.caionthh.CoreOfTheWorld.blocks;

import com.caionthh.CoreOfTheWorld.blocks.entities.TileEntityItemSpreader;
import com.caionthh.CoreOfTheWorld.lib.Constants;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockItemSpreader extends Block implements ITileEntityProvider {

	
	//name
	public String name = "ItemSpreader";
	
	public BlockItemSpreader() {
		super(Material.rock);
		
		//Name
		setBlockName(Constants.blockItemSpreaderName);
		//Creative
		setCreativeTab(CreativeTabs.tabBlock);
				
		//Registry
		GameRegistry.registerBlock(this, name);
		
		//Set Texture
		setBlockTextureName(Constants.modid +":"+ name);

		
	}

	@Override
	public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
		return new TileEntityItemSpreader();
	}

}
