package com.home.client.app;

import com.home.base.extern.GExternMethod;
import com.home.base.global.BaseSetting;
import com.home.client.control.GClientBaseFactoryControl;
import com.home.client.control.GClientBehaviourControl;
import com.home.client.control.GClientFactoryControl;
import com.home.client.control.GClientMainControl;
import com.home.client.control.GSceneControl;
import com.home.client.global.GClientC;
import com.home.commonBase.control.BaseFactoryControl;
import com.home.commonBase.global.CommonSetting;
import com.home.commonClient.app.ClientApp;
import com.home.commonClient.control.ClientFactoryControl;
import com.home.commonClient.global.ClientC;
import com.home.commonClient.global.ClientGlobal;
import com.home.shine.global.ShineSetting;

public class GClientApp extends ClientApp
{
	public static void main(String[] args)
	{
		CommonSetting.isClient=true;
		BaseSetting.init(true);
		
		ShineSetting.logNeedConsole=true;
		
		ClientGlobal.init();
		ClientGlobal.readByMainArgs(args);
		ClientApp.setClientReleaseConfig();
		
		new GClientApp().start();
	}
	
	public GClientApp()
	{
		super();
		
		GClientC.app=this;
	}
	
	@Override
	protected void makeControls()
	{
		super.makeControls();
		
		GClientC.main=(GClientMainControl)ClientC.main;
		GClientC.behaviour=(GClientBehaviourControl)ClientC.behaviour;
		GClientC.scene=(GSceneControl)ClientC.scene;
	}
	
	@Override
	protected void loadLib()
	{
		super.loadLib();
		
		GExternMethod.init();
	}
	
	@Override
	protected BaseFactoryControl createBaseFactoryControl()
	{
		return new GClientBaseFactoryControl();
	}
	
	@Override
	protected ClientFactoryControl createFactoryControl()
	{
		return new GClientFactoryControl();
	}
}
