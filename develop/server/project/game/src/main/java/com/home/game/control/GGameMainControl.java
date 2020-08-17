package com.home.game.control;

import com.home.commonGame.control.GameMainControl;
import com.home.game.part.player.GPlayer;

/** 逻辑服主控制 */
public class GGameMainControl extends GameMainControl
{
	/** 获取在线角色by playerID(找不到返回null) */
	public GPlayer getGPlayerByID(long playerID)
	{
		return (GPlayer)getPlayerByID(playerID);
	}
}
