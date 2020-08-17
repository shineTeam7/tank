package com.home.gmClient.control;

import com.home.commonGMClient.control.GMClientFactoryControl;
import com.home.commonGMClient.control.GMClientMainControl;

public class GGMClientFactoryControl extends GMClientFactoryControl
{
	@Override
	public GMClientMainControl createMainControl()
	{
		return new GGMClientMainControl();
	}
}
