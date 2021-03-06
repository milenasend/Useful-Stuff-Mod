package com.pasterian.usefulstuffmod;

import net.minecraft.entity.player.EntityPlayer;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import cpw.mods.fml.common.gameevent.TickEvent.Phase;

public class UMEventHandler {

	public static UMEventHandler INSTANCE = new UMEventHandler();

	@SubscribeEvent
	public void onPlayerTick(TickEvent.PlayerTickEvent event)
	{
		EntityPlayer player = event.player;
		if (event.phase != Phase.START || player.worldObj.isRemote)
		{
			return;
		}

		if (!player.capabilities.isCreativeMode)
		{
			player.capabilities.disableDamage = false;
		
		}
	}
}
