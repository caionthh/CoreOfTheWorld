package com.caionthh.CoreOfTheWorld.lib;

import com.caionthh.CoreOfTheWorld.items.*;

public class ModItems {
	
	
	//Core
	public static ItemCoreCasing itemCoreCasing;
	public static ItemCoreMeat itemCoreMeat;
	
	
	//Create All Items
	public static void CreateAllItems() {
		
		//Core
		itemCoreCasing = new ItemCoreCasing();
		itemCoreMeat = new ItemCoreMeat();
		
	}
	
	

}
