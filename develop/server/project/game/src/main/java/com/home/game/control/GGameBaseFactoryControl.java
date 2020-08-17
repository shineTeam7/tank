package com.home.game.control;

import com.home.base.control.GBaseFactoryControl;
import com.home.commonBase.scene.base.Region;
import com.home.commonBase.scene.base.Unit;
import com.home.commonGame.scene.base.GameRegion;
import com.home.game.scene.unit.GUnit;

public class GGameBaseFactoryControl extends GBaseFactoryControl
{
	@Override
	public Unit createUnit()
	{
		return new GUnit();
	}
	
	/** 创建区域 */
	public Region createRegion()
	{
		return new GameRegion();
	}
}
