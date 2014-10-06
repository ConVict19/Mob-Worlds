package com.ConVict.MobWorlds.init;

import com.ConVict.MobWorlds.block.blockMobWorlds;
import com.ConVict.MobWorlds.block.blockOreJewel;
import com.ConVict.MobWorlds.referance.Names;
import com.ConVict.MobWorlds.referance.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlock {

    public static final blockMobWorlds Ore_Jewels = new blockOreJewel();

    public static void init() {
       GameRegistry.registerBlock(Ore_Jewels, Names.Blocks.ORE_JEWEL);
    }

}
