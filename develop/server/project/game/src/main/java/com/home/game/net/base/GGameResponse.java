package com.home.game.net.base;

import com.home.commonGame.net.base.GameResponse;
import com.home.commonGame.part.player.Player;
import com.home.game.part.player.GPlayer;

public abstract class GGameResponse extends GameResponse
{
	/** 主角 */
	protected GPlayer gme;
	
	@Override
	public void setPlayer(Player player)
	{
		super.setPlayer(player);
		gme=(GPlayer)player;
	}
}
