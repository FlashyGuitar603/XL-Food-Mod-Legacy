package mariot7.xlfoodmod.items;

import mariot7.xlfoodmod.Main;
import mariot7.xlfoodmod.XLFoodModTab;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.init.MobEffects;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.List;

public class Slushie extends ItemFood {

    protected String name;

    public Slushie(String name, int amount, float saturation, boolean isWolfFood) {
        super(amount, saturation, isWolfFood);
        this.setAlwaysEdible();
        this.setMaxStackSize(1);
        this.setCreativeTab(XLFoodModTab.tabXLFoodMod);
        this.name = name;
        setUnlocalizedName(name);
        setRegistryName(name);
    }

    public void registerItemModel() {
        Main.proxy.registerItemRenderer(this, 0, name);
    }

    protected void onFoodEaten(ItemStack itemstack, World world, EntityPlayer player) {
        player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 300, 1));
        player.inventory.addItemStackToInventory(new ItemStack(Items.GLASS_BOTTLE));
    }

    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
        tooltip.add(I18n.format("slushie.tooltip", TextFormatting.GREEN, TextFormatting.RESET));
    }

    @Override
    public EnumAction getItemUseAction(ItemStack stack) {
        return EnumAction.DRINK;
    }
}