package com.home.scene.app;

import com.home.base.control.GBaseFactoryControl;
import com.home.base.extern.GExternMethod;
import com.home.commonBase.control.BaseFactoryControl;
import com.home.commonBase.global.CommonSetting;
import com.home.commonScene.app.SceneApp;
import com.home.commonScene.control.SceneFactoryControl;
import com.home.commonScene.global.SceneC;
import com.home.scene.control.GSceneBaseFactoryControl;
import com.home.scene.control.GSceneFactoryControl;
import com.home.scene.control.GSceneMainControl;
import com.home.scene.global.GSceneC;

public class GSceneApp extends SceneApp
{
	public GSceneApp(int id)
	{
		super(id);
	}
	
	@Override
	protected void makeControls()
	{
		super.makeControls();
		
		GSceneC.main=(GSceneMainControl)SceneC.main;
	}
	
	@Override
	protected void loadLib()
	{
		super.loadLib();
		
		GExternMethod.init();
	}
	
	@Override
	protected SceneFactoryControl createFactoryControl()
	{
		return new GSceneFactoryControl();
	}
	
	@Override
	protected BaseFactoryControl createBaseFactoryControl()
	{
		return new GSceneBaseFactoryControl();
	}
}
