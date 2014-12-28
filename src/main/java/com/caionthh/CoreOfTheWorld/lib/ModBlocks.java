package com.caionthh.CoreOfTheWorld.lib;

import net.minecraft.block.material.Material;

import com.caionthh.CoreOfTheWorld.blocks.BlockItemSpreader;
import com.caionthh.CoreOfTheWorld.blocks.BlockManaAltarCenter;
import com.caionthh.CoreOfTheWorld.blocks.entities.TileEntityItemSpreader;
import com.caionthh.CoreOfTheWorld.blocks.entities.TileEntityManaAltarCenter;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks {

	
	
	//Mana Altar
	public static BlockManaAltarCenter blockManaAltarCenter;
	
	
	//Item Spreader
	public static BlockItemSpreader blockItemSpreader;
	
	
	
	//Create All Blocks
	public static void CreateAllBlocks() {
		
		//Mana Altar
		blockManaAltarCenter = new BlockManaAltarCenter();
		GameRegistry.registerTileEntity(TileEntityManaAltarCenter.class, "caionthhManaAltarCenterEntity");
		
		
		//ItemSpreader
		blockItemSpreader = new BlockItemSpreader();
		GameRegistry.registerTileEntity(TileEntityItemSpreader.class, "caionthhItemSpreaderEntity");
		
	}
	
	
	
	
}
