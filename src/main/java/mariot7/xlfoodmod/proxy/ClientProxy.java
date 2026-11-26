package mariot7.xlfoodmod.proxy;

import mariot7.xlfoodmod.Reference;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy{

    public void preInit(FMLPreInitializationEvent preEvent) {
		super.preInit(preEvent);
	}
	
	public void init(FMLInitializationEvent event) {

	}
	
    public void postInit(FMLPostInitializationEvent postEvent) {		
		super.postInit(postEvent);
	}
    
	@Override
	public void registerItemRenderer(Item item, int meta, String id) {
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(Reference.MOD_ID + ":" + id, "inventory"));
	}

    
}
