package com.pasterian.usefulstuffmod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;

import com.pasterian.usefulstuffmod.blocks.BlueQuartz;
import com.pasterian.usefulstuffmod.blocks.BlueShardOre;
import com.pasterian.usefulstuffmod.blocks.CyanQuartz;
import com.pasterian.usefulstuffmod.blocks.CyanShardOre;
import com.pasterian.usefulstuffmod.blocks.GemOre;
import com.pasterian.usefulstuffmod.blocks.GreenQuartz;
import com.pasterian.usefulstuffmod.blocks.GreenShardOre;
import com.pasterian.usefulstuffmod.blocks.MinablePick;
import com.pasterian.usefulstuffmod.blocks.ParmentaBlock;
import com.pasterian.usefulstuffmod.blocks.PinkQuartz;
import com.pasterian.usefulstuffmod.blocks.PinkShardOre;
import com.pasterian.usefulstuffmod.blocks.PurpleQuartz;
import com.pasterian.usefulstuffmod.blocks.PurpleShardOre;
import com.pasterian.usefulstuffmod.blocks.RedQuartz;
import com.pasterian.usefulstuffmod.blocks.RedShardOre;
import com.pasterian.usefulstuffmod.blocks.ShardOre;
import com.pasterian.usefulstuffmod.blocks.YellowQuartz;
import com.pasterian.usefulstuffmod.blocks.YellowShardOre;

import cpw.mods.fml.common.registry.GameRegistry;

public class UMBlocks {

	//Blocks
		public static Block minablePick;
		public static Block shardOre;
		public static Block gemOre;
		public static Block parmentaBlock;
		
		public static Block blueShardOre;
		public static Block redShardOre;
		public static Block yellowShardOre;
		public static Block cyanShardOre;
		public static Block greenShardOre;
		public static Block pinkShardOre;
		public static Block purpleShardOre;
		
		public static Block redQuartz;
		public static Block yellowQuartz;
		public static Block blueQuartz;
		public static Block pinkQuartz;
		public static Block purpleQuartz;
		public static Block cyanQuartz;
		public static Block greenQuartz;
		
		
public static void init() {
		
	//Initializing Blocks
		redShardOre 	 = new RedShardOre(Material.rock);
		blueShardOre 	 = new BlueShardOre(Material.rock);
		cyanShardOre  	 = new CyanShardOre(Material.rock);
		greenShardOre 	 = new GreenShardOre(Material.rock);
		pinkShardOre 	 = new PinkShardOre(Material.rock);
		purpleShardOre 	 = new PurpleShardOre(Material.rock);
		yellowShardOre 	 = new YellowShardOre(Material.rock);
	
		redQuartz 	     = new RedQuartz(Material.rock);
		yellowQuartz 	 = new YellowQuartz(Material.rock);
		blueQuartz 	     = new BlueQuartz(Material.rock);
		pinkQuartz 	     = new PinkQuartz(Material.rock);
		purpleQuartz 	 = new PurpleQuartz(Material.rock);
		cyanQuartz 		 = new CyanQuartz(Material.rock);
		greenQuartz 	 = new GreenQuartz(Material.rock);
	
		parmentaBlock 	 = new ParmentaBlock(Material.rock);
		minablePick		 = new MinablePick(Material.rock);
		shardOre 		 = new ShardOre(Material.rock);
		gemOre			 = new GemOre(Material.rock);	
	
		//enderWaterBlock		 = new BlockEnderWater();
		
	// Registering Blocks
		addBlock(minablePick, "MinablePick");
		addBlock(shardOre, "shardOre");
		addBlock(gemOre, "gemOre");
		addBlock(parmentaBlock, "parmentaBlock");	
		
		addBlock(redShardOre, "redshardOre");
		addBlock(yellowShardOre, "yellowshardOre");
		addBlock(cyanShardOre, "cyanshardOre");
		addBlock(greenShardOre, "greenshardOre");
		addBlock(blueShardOre, "blueShardOre");
		addBlock(pinkShardOre, "pinkshardOre");
		addBlock(purpleShardOre, "purpleshardOre");
				
		addBlock(redQuartz, "redQuartz");
		addBlock(blueQuartz, "blueQuartz");
		addBlock(cyanQuartz, "cyanQuartz");
		addBlock(pinkQuartz, "pinkQuartz");
		addBlock(purpleQuartz, "purpleQuartz");
		addBlock(yellowQuartz, "yellowQuartz");
		addBlock(greenQuartz, "greenQuartz");
		
	
	}

public static void addBlock(Block block, String name)
{
	block.setBlockName(name);
	GameRegistry.registerBlock(block, name);
}

public static void addBlock(Block block, Class<? extends ItemBlock> item, String name)
{
	block.setBlockName(name);
	GameRegistry.registerBlock(block, item, name);
}

public static void addBlock(Block block, Class<? extends ItemBlock> item, String name, Object... args)
{
	block.setBlockName(name);
	GameRegistry.registerBlock(block, item, name, args);
}
}
