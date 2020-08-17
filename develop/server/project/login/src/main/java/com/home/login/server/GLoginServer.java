package com.home.login.server;

import com.home.commonLogin.server.LoginServer;
import com.home.login.tool.generate.GLoginHttpResponseMaker;
import com.home.login.tool.generate.GLoginServerRequestMaker;
import com.home.login.tool.generate.GLoginServerResponseMaker;

public class GLoginServer extends LoginServer
{
	@Override
	protected void initMessage()
	{
		super.initMessage();
		
		addServerBytesHttpResponseMaker(new GLoginHttpResponseMaker());
		
		addRequestMaker(new GLoginServerRequestMaker());
		addServerResponseMaker(new GLoginServerResponseMaker());
	}
}
