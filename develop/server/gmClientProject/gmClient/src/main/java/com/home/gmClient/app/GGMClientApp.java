package com.home.gmClient.app;

import com.home.base.control.GBaseFactoryControl;
import com.home.commonBase.control.BaseFactoryControl;
import com.home.commonGMClient.app.GMClientApp;
import com.home.commonGMClient.control.GMClientFactoryControl;
import com.home.gmClient.control.GGMClientFactoryControl;

public class GGMClientApp extends GMClientApp
{
	@Override
	protected BaseFactoryControl createBaseFactoryControl()
	{
		return new GBaseFactoryControl();
	}
	
	@Override
	protected GMClientFactoryControl createFactoryControl()
	{
		return new GGMClientFactoryControl();
	}
}
