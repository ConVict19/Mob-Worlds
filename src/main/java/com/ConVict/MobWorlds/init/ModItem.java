package com.ConVict.MobWorlds.init;

import com.ConVict.MobWorlds.item.itemJewel;
import com.ConVict.MobWorlds.item.itemMobWorlds;
import com.ConVict.MobWorlds.item.itemPunchStick;
import com.ConVict.MobWorlds.referance.Names;
import com.ConVict.MobWorlds.referance.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItem {

    public static final itemMobWorlds punchStick = new itemPunchStick();
    public static final itemMobWorlds Jewel = new itemJewel();

    public static void init()
    {
        GameRegistry.registerItem(punchStick,Names.Items.PunchStick);
        GameRegistry.registerItem(Jewel, Names.Items.JEWEL);
    }

}