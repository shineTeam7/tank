package com.home.manager.app;

import com.home.base.control.GBaseFactoryControl;
import com.home.commonBase.control.BaseFactoryControl;
import com.home.commonManager.app.ManagerApp;
import com.home.commonManager.control.ManagerFactoryControl;
import com.home.manager.control.GManagerFactoryControl;

public class GManagerApp extends ManagerApp
{
	@Override
	protected BaseFactoryControl createBaseFactoryControl()
	{
		return new GBaseFactoryControl();
	}
	
	@Override
	protected ManagerFactoryControl createFactoryControl()
	{
		return new GManagerFactoryControl();
	}
}
