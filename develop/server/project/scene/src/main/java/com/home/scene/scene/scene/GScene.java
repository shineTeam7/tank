package com.home.scene.scene.scene;

import com.home.commonBase.scene.scene.SceneAOILogic;
import com.home.commonBase.scene.scene.SceneInOutLogic;
import com.home.commonBase.scene.scene.SceneMethodLogic;
import com.home.commonBase.scene.scene.SceneUnitFactoryLogic;
import com.home.commonScene.scene.base.SScene;
import com.home.commonSceneBase.scene.scene.SceneAOIAllLogic;
import com.home.sceneBase.scene.scene.GSceneUnitFactoryLogic;

public class GScene extends SScene
{
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
}
