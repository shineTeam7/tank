package com.home.client.scene.scene;

import com.home.base.constlist.generate.GRobotTestModeType;
import com.home.base.constlist.generate.GSceneType;
import com.home.commonBase.scene.scene.SceneAOILogic;
import com.home.commonBase.scene.scene.ScenePlayLogic;
import com.home.commonBase.scene.scene.ScenePosLogic;
import com.home.commonClient.global.ClientGlobal;
import com.home.commonClient.scene.base.GameScene;

public class GScene extends GameScene
{
	@Override
	protected ScenePosLogic createPosLogic()
	{
		return new GScenePosLogic();
	}
	
	
	@Override
	protected ScenePlayLogic createPlayLogic()
	{
		switch(_type)
		{
			case GSceneType.Melee:
			case GSceneType.MeleeSingle:
			{
				return new GSceneMeleePlayLogic();
			}
			default:
			{
				return super.createPlayLogic();
			}
		}
	}
	
	@Override
	protected void onSceneStart()
	{
		super.onSceneStart();
		
		switch(ClientGlobal.mode)
		{
			case GRobotTestModeType.TestMelee:
			{
				//TODO:随机移动 开枪
				
				//getHero().ai.setAIMode(UnitAIModeType.Base);
				//((GUnitMoveLogic)getHero().move).moveOnce();
			}
				break;
		}
	}
}
