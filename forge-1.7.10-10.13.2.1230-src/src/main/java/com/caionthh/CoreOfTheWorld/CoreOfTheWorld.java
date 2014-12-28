package com.caionthh.CoreOfTheWorld;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

import com.caionthh.CoreOfTheWorld.lib.*;


//Mod BASE
@Mod(modid = Constants.modid, name = Constants.name, version = Constants.version)
public class CoreOfTheWorld {
	
	
	//Event Handler Pre INIT
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
	
		//Start Blocks
		ModBlocks.CreateAllBlocks();
		
		//Items
		ModItems.CreateAllItems();
	}
	
	
	//Initialization
	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		
	}
	
	
	//Post Init
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
		
	}
	
	

}
