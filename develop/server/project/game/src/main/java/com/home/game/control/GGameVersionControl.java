package com.home.game.control;

import com.home.commonGame.control.GameVersionControl;
import com.home.game.part.gameGlobal.GGameGlobal;
import com.home.shine.support.func.ObjectCall;

public class GGameVersionControl extends GameVersionControl
{
	@Override
	public void init()
	{
		super.init();
	}
	
	private void registGFuncG(int version,ObjectCall<GGameGlobal> func)
	{
		registGFunc(version,k->func.apply((GGameGlobal)k));
	}
}
