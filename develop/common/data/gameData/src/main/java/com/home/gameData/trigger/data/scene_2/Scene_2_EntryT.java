package com.home.gameData.trigger.data.scene_2;

import com.home.gameData.trigger.base.GSceneT;

/** 场景2入口 */
public class Scene_2_EntryT extends GSceneT
{
	@Override
	protected void init()
	{
		isOpen=true;
	}
	
	@Override
	protected void event()
	{
		//onSceneStart();
		onTriggerGMCommand();
	}
	
	@Override
	protected void condition()
	{
		//trigger指令为1时，触发
		equalsInt(getTriggerGMCommandIntArg(0),1);
	}
	
	@Override
	protected void action()
	{
		gTestFunc();
		
		setSVar("master",getUnit(35));
		
		forLoop(4,()->
		{
			setLocalVar("unit",createAddPuppet(1,1,getScenePlacePos(addInt(10002,getCurrentLoopIndex())),asUnit(getSVar("master")),7000));
			moveToUnit(asUnit(getLocalVar("unit")),asUnit(getSVar("master")),0.5f);
		});
		
		openTrigger(Scene_2_CheckT.class);
		wait(7000);
		closeTrigger(Scene_2_CheckT.class);
	}
}
