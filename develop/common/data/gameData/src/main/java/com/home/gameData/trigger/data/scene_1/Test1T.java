package com.home.gameData.trigger.data.scene_1;

import com.home.commonData.trigger.base.SceneT;

public class Test1T extends SceneT
{
	@Override
	protected void init()
	{
		isOpen=true;
		priority=1;
	}
	
	@Override
	protected void event()
	{
		//onSceneStart();
		//onInterval(1000);
	}
	
	@Override
	protected void condition()
	{
		//unitIsAlive(triggerUnit());
		//and(randomBoolean(),randomBoolean());
		
		//equals(randomBoolean(),randomBoolean());
	}
	
	@Override
	protected void action()
	{
		//print("AA");
		//wait(200);
		//
		//setSVar("aa",addInt(getSInt("aa"),1));
		//
		//print(addStr("看一下",convertInt2Str(getSInt("aa"))));
		
		//wait(200);
		//
		//print(addStr(convertInt2Str(addInt(1,3)),convertFloat2Str(addFloat(3.1f,2.62f))));
		//
		//if(randomBoolean())
		//{
		//	print("C1");
		//}
		//else if(randomBoolean())
		//{
		//	print("C2");
		//}
		//else
		//{
		//	print("C3");
		//}
		//
		//wait(200);
		//
		//forLoop(5);
		//{
		//	wait(300);
		//	print(addStr("DD:",convertInt2Str(getCurrentLoopIndex())));
		//}
		//
		//runTrigger(Test2T.class);
		
	}
}
