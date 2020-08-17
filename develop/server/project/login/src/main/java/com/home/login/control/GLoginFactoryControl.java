package com.home.login.control;

import com.home.commonLogin.control.LoginFactoryControl;
import com.home.commonLogin.control.LoginMainControl;
import com.home.commonLogin.server.LoginServer;
import com.home.login.server.GLoginServer;

public class GLoginFactoryControl extends LoginFactoryControl
{
	@Override
	public LoginMainControl createMainControl()
	{
		return new GLoginMainControl();
	}
	
	@Override
	public LoginServer createServer()
	{
		return new GLoginServer();
	}
}
