package com.home.game.scene.scene;

import com.home.commonBase.scene.scene.SceneAOILogic;
import com.home.commonBase.scene.scene.SceneInOutLogic;
import com.home.commonBase.scene.scene.SceneMethodLogic;
import com.home.commonBase.scene.scene.SceneUnitFactoryLogic;
import com.home.commonGame.scene.base.GameScene;
import com.home.commonSceneBase.scene.scene.SceneAOIAllLogic;
import com.home.sceneBase.scene.scene.GSceneUnitFactoryLogic;

/** 游戏场景 */
public class GScene extends GameScene
{
	@Override
	protected void registLogics()
	{
		super.registLogics();
	}
	
	@Override
	protected SceneInOutLogic createInOutLogic()
	{
		return new GSceneInoutLogic();
	}
	
	@Override
	protected SceneAOILogic createAOILogic()
	{
		return new SceneAOIAllLogic();
	}
	
	@Override
	protected SceneUnitFactoryLogic createUnitFactoryLogic()
	{
		return new GSceneUnitFactoryLogic();
	}
	
	@Override
	protected SceneMethodLogic createMethodLogic()
	{
		return new GSceneMethodLogic();
	}
	
	@Override
	public void dispose()
	{
		super.dispose();
	}
}
