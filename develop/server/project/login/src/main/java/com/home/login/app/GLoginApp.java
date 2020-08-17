package com.home.login.app;

import com.home.base.control.GBaseFactoryControl;
import com.home.commonBase.control.BaseFactoryControl;
import com.home.commonLogin.app.LoginApp;
import com.home.commonLogin.control.LoginFactoryControl;
import com.home.commonLogin.global.LoginC;
import com.home.login.control.GLoginFactoryControl;
import com.home.login.control.GLoginMainControl;
import com.home.login.global.GLoginC;

public class GLoginApp extends LoginApp
{
	public GLoginApp(int id)
	{
		super(id);
		
		GLoginC.app=this;
	}
	
	@Override
	protected void makeControls()
	{
		super.makeControls();
		
		GLoginC.main=(GLoginMainControl)LoginC.main;
	}
	
	@Override
	protected BaseFactoryControl createBaseFactoryControl()
	{
		return new GBaseFactoryControl();
	}
	
	@Override
	protected LoginFactoryControl createFactoryControl()
	{
		return new GLoginFactoryControl();
	}
}
