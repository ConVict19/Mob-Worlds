package com.ConVict.MobWorlds.block;

import com.ConVict.MobWorlds.referance.Names;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;

import java.util.Random;

public class blockOreJewel extends blockMobWorlds {

    @SideOnly(Side.CLIENT)
    private IIcon[] blockTexture;


    public blockOreJewel() {

        super();
        this.setBlockName(Names.Blocks.ORE_JEWEL);
        this.setHarvestLevel("pickaxe", 2);

    }

    @Override
    public Item getItemDropped(int par1, Random random, int par2) {

        return Item.getItemFromBlock(this);
    }

    @Override
    public int damageDropped(int metaData) {
        return metaData;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister) {

        this.blockTexture = new IIcon[Names.Blocks.ORE_JEWEL_SUBTYPES.length];

        for (int i = 0; i < Names.Blocks.ORE_JEWEL_SUBTYPES.length; i++) {
            //blockTop[i] = iconRegister.registerIcon(String.format("%s.%s_top", getUnwrappedUnlocalizedName(this.getUnlocalizedName()), Names.Blocks.ORE_JEWEL_SUBTYPES[i]));
            blockTexture[i] = iconRegister.registerIcon(String.format("%s.%s_side", getUnwrappedUnlocalizedName(this.getUnlocalizedName()), Names.Blocks.ORE_JEWEL_SUBTYPES[i]));
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int metaData) {
        metaData = MathHelper.clamp_int(metaData, 0, Names.Blocks.ORE_JEWEL_SUBTYPES.length - 1);

        return blockTexture[metaData];
    }
}



