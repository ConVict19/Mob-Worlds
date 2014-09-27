package com.ConVict.MobWorlds;

import com.ConVict.MobWorlds.configuration.ConfigurationHandler;
import com.ConVict.MobWorlds.proxy.IProxy;
import com.ConVict.MobWorlds.referance.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.item.Item;

@Mod(modid= Reference.MOD_ID, name= Reference.MOD_NAME, version= Reference.MOD_VERSION)
public class MobWorlds{

    @Mod.Instance("MobWorlds")
    public static MobWorlds instance;

    @SidedProxy(clientSide = Reference.CLIENT_SIDE_PROXY, serverSide = Reference.SERVER_SIDE_PROXY)
    public static IProxy proxy;

    @Mod.EventHandler
        public void preInit(FMLPreInitializationEvent event)

    {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
    }

    @Mod.EventHandler
        public void init(FMLInitializationEvent event)

    {

    }

    @Mod.EventHandler
        public void postInit(FMLPostInitializationEvent event)

    {

    }

}
