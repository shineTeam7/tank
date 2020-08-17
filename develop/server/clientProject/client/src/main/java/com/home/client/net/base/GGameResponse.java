package com.home.client.net.base;

import com.home.client.part.player.GPlayer;
import com.home.commonClient.net.base.GameResponse;
import com.home.commonClient.part.player.Player;

public abstract class GGameResponse extends GameResponse
{
	/** me */
	public GPlayer gme;
	
	/** 设置主角 */
	@Override
	public void setPlayer(Player player)
	{
		super.setPlayer(player);
		gme=(GPlayer)me;
	}
}
