package com.home.gameData.trigger.data.scene_2;

import com.home.gameData.trigger.base.GSceneT;

public class Scene_2_CheckT extends GSceneT
{
	@Override
	protected void init()
	{
	
	}
	
	@Override
	protected void event()
	{
		onUnitMove();
	}
	
	@Override
	protected void condition()
	{
		equalsInt(getUnitFightUnitID(triggerUnit()),50001);
	}
	
	@Override
	protected void action()
	{
		//距离在范围内
		if(lessThanFloat(posDistance(getUnitPos(triggerUnit()),getUnitPos(asUnit(getSVar("master")))),1f))
		{
			unitAddHpPercent(asUnit(getSVar("master")),100);
			removeUnit(triggerUnit());
		}
	}
}
