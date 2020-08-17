package com.home.test;

import com.home.base.global.BaseSetting;
import com.home.commonBase.constlist.generate.TriggerEventType;
import com.home.commonBase.constlist.generate.TriggerGroupType;
import com.home.commonBase.trigger.SceneTriggerExecutor;
import com.home.game.app.GGameApp;
import com.home.shine.control.ThreadControl;
import com.home.shine.global.ShineSetting;

public class TempTest
{
	public static void main(String[] args)
	{
	
	}
	
	private static void preTest(Runnable func)
	{
		ShineSetting.isAllInOne=true;
		BaseSetting.init(false);
		new GGameApp(1).startCustom(func);
	}
	
	private static void testTrigger()
	{
		preTest(()->
		{
			SceneTriggerExecutor e=new SceneTriggerExecutor();
			e.construct();
			e.init(TriggerGroupType.Scene,1);
			
			ThreadControl.getMainTimeDriver().setFrame(k->
			{
				e.onFrame(k);
			});
			
			e.triggerEvent(TriggerEventType.OnSceneStart);
		});
	}
	
	//private static PosData _pos=new PosData();
	//private static PosData _pos2=new PosData();
	//
	//private static void testPathFinding(GameScene scene)
	//{
	//	//scene.pos.findPath();
	//
	//	for(int i=0;i<3;i++)
	//	{
	//		testPathFindingOne(scene);
	//	}
	//
	//	long t=Ctrl.getTimer();
	//
	//	testPathFindingOne(scene);
	//
	//	Ctrl.print("A",Ctrl.getTimer()-t);
	//}
	//
	//private static void testPathFindingOne(GameScene scene)
	//{
	//	PosData originPos=scene.originPos;
	//	PosData sizePos=scene.sizePos;
	//
	//	for(int i=0;i<100;i++)
	//	{
	//		_pos.x=originPos.x+MathUtils.randomFloat()*sizePos.x;
	//		_pos.z=originPos.z+MathUtils.randomFloat()*sizePos.z;
	//
	//		_pos2.x=originPos.x+MathUtils.randomFloat()*sizePos.x;
	//		_pos2.z=originPos.z+MathUtils.randomFloat()*sizePos.z;
	//
	//		scene.pos.findPath(_list,MapMoveType.Land,false,_pos,_pos2);
	//	}
	//}
}
