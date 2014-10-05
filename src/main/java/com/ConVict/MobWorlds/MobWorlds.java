package com.ConVict.MobWorlds;

import com.ConVict.MobWorlds.handler.ConfigurationHandler;
import com.ConVict.MobWorlds.init.ModBlock;
import com.ConVict.MobWorlds.init.ModItem;
import com.ConVict.MobWorlds.proxy.IProxy;
import com.ConVict.MobWorlds.referance.Reference;
import com.ConVict.MobWorlds.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid= Reference.MOD_ID, name= Reference.MOD_NAME, version= Reference.MOD_VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class MobWorlds{

    @Mod.Instance("MobWorlds")
    public static MobWorlds instance;

    @SidedProxy(clientSide = Reference.CLIENT_SIDE_PROXY, serverSide = Reference.SERVER_SIDE_PROXY)
    public static IProxy proxy;

    @Mod.EventHandler
        public void preInit(FMLPreInitializationEvent event)

    {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());

        ModItem.init();
        ModBlock.init();

        LogHelper.info("Making tools");
    }

    @Mod.EventHandler
        public void init(FMLInitializationEvent event)

    {
        LogHelper.info("Getting packed");
    }

    @Mod.EventHandler
        public void postInit(FMLPostInitializationEvent event)

    {
        LogHelper.info("Time to explore!");
    }

}
