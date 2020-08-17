package com.home.gameData.trigger.data.guide_1;

import com.home.commonData.trigger.base.GuideT;

/** 引导入口 */
public class GuideEntryT extends GuideT
{
	@Override
	protected void init()
	{
		isOpen=true;
	}
	
	@Override
	protected void event()
	{
		onGameStart();
	}
	
	@Override
	protected void condition()
	{
	
	}
	
	@Override
	protected void action()
	{
	
	}
}
