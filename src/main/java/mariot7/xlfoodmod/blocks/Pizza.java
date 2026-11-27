package mariot7.xlfoodmod.blocks;

import mariot7.xlfoodmod.Main;
import mariot7.xlfoodmod.XLFoodModTab;
import net.minecraft.block.BlockCake;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class Pizza extends BlockCake {
	
	protected String name;
	protected static final AxisAlignedBB[] CAKE_AABB = new AxisAlignedBB[] {
			new AxisAlignedBB(0.0625D, 0.0D, 0.0625D, 0.9375D, 0.19D, 0.9375D),
			new AxisAlignedBB(0.1875D, 0.0D, 0.0625D, 0.9375D, 0.19D, 0.9375D),
			new AxisAlignedBB(0.3125D, 0.0D, 0.0625D, 0.9375D, 0.19D, 0.9375D),
			new AxisAlignedBB(0.4375D, 0.0D, 0.0625D, 0.9375D, 0.19D, 0.9375D),
			new AxisAlignedBB(0.5625D, 0.0D, 0.0625D, 0.9375D, 0.19D, 0.9375D),
			new AxisAlignedBB(0.6875D, 0.0D, 0.0625D, 0.9375D, 0.19D, 0.9375D),
			new AxisAlignedBB(0.8125D, 0.0D, 0.0625D, 0.9375D, 0.19D, 0.9375D)};

	public Pizza(String name, int foodlevel, float saturation) {
		super();
		this.setTickRandomly(true);
		this.setHardness(0.5F);
		this.setSoundType(SoundType.CLOTH);
		this.setCreativeTab(XLFoodModTab.tabXLFoodMod);
		this.name = name;
		setUnlocalizedName(name);
		setRegistryName(name);
	}

	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
	{
		return CAKE_AABB[((Integer)state.getValue(BITES)).intValue()];
	}
	
	public void registerItemModel(Item itemBlock) {
		Main.proxy.registerItemRenderer(itemBlock, 0, name);
	}
	
	public Item createItemBlock() {
		return new ItemBlock(this).setRegistryName(getRegistryName());
	}

	@Override
	public ItemStack getItem(World worldIn, BlockPos pos, IBlockState state) {
		return new ItemStack(Item.getItemFromBlock(this));
	}
}