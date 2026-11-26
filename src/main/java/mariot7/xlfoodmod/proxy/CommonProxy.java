package mariot7.xlfoodmod.proxy;

import mariot7.xlfoodmod.init.Smeltingxlfoodmod;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {
	
	public void preInit(FMLPreInitializationEvent preEvent) {
		Smeltingxlfoodmod.initSmelting();
	}
	
	public void init(FMLInitializationEvent event) {

	}

	public void postInit(FMLPostInitializationEvent postEvent) {
	
	}
	
	public void registerItemRenderer(Item item, int meta, String id) {
	}
	
	
}
