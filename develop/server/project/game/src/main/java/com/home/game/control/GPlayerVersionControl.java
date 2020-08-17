package com.home.game.control;

import com.home.commonGame.control.PlayerVersionControl;
import com.home.game.part.player.GPlayer;
import com.home.shine.support.func.ObjectCall;

/** 游戏版本控制 */
public class GPlayerVersionControl extends PlayerVersionControl
{
	@Override
	public void init()
	{
		super.init();
		
		
	}
	
	private void registGFuncG(int version,ObjectCall<GPlayer> func)
	{
		registGFunc(version,k->func.apply((GPlayer)k));
	}
}
