package com.home.scene.control;

import com.home.commonScene.control.SceneClientGMControl;
import com.home.commonScene.control.SceneFactoryControl;
import com.home.commonScene.control.SceneMainControl;
import com.home.commonScene.scene.base.SScene;
import com.home.commonScene.server.SceneServer;
import com.home.scene.scene.scene.GScene;
import com.home.scene.server.GSceneServer;

public class GSceneFactoryControl extends SceneFactoryControl
{
	@Override
	public SceneMainControl createMainControl()
	{
		return new GSceneMainControl();
	}
	
	@Override
	public SceneServer createServer()
	{
		return new GSceneServer();
	}
	
	@Override
	public SScene createScene()
	{
		return new GScene();
	}
}
