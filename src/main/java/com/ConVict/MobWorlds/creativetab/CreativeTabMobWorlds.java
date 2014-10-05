package com.ConVict.MobWorlds.creativetab;

import com.ConVict.MobWorlds.init.ModItem;
import com.ConVict.MobWorlds.referance.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabMobWorlds {

    public static final CreativeTabs MobWorlds_Tab = new CreativeTabs(Reference.MOD_ID.toLowerCase()) {

        @Override
        public Item getTabIconItem() {

            return ModItem.punchStick;
        }
    };
}
