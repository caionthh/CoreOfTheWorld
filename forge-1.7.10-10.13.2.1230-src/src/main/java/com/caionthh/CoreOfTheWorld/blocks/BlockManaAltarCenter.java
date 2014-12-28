package com.caionthh.CoreOfTheWorld.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import com.caionthh.CoreOfTheWorld.blocks.entities.TileEntityManaAltarCenter;
import com.caionthh.CoreOfTheWorld.lib.*;

import cpw.mods.fml.common.registry.GameRegistry;

public class BlockManaAltarCenter extends Block implements ITileEntityProvider {

	//Name
	public String name = "ManaAltarCenter";
	
	
	public BlockManaAltarCenter() {
		super(Material.rock);
		
		//Name
		setBlockName(Constants.blockManaAltarCenterName);
		//Creative
		setCreativeTab(CreativeTabs.tabBlock);
				
		//Registry
		GameRegistry.registerBlock(this, name);
		
		//Set Texture
		setBlockTextureName(Constants.modid +":"+ name);
		
	}
	
	//TileEntity
	@Override
	public TileEntity createTileEntity(World world, int metadata) {
		return new TileEntityManaAltarCenter();
	}

	@Override
	public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
		return new TileEntityManaAltarCenter();
	}
	
	
	

}
