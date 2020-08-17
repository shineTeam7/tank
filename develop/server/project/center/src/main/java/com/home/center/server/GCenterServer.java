package com.home.center.server;

import com.home.center.tool.generate.GCenterRequestMaker;
import com.home.center.tool.generate.GCenterResponseBindTool;
import com.home.center.tool.generate.GCenterResponseMaker;
import com.home.center.tool.generate.GCenterServerRequestMaker;
import com.home.center.tool.generate.GCenterServerResponseMaker;
import com.home.center.tool.generate.HCenterRequestMaker;
import com.home.center.tool.generate.HCenterResponseBindTool;
import com.home.center.tool.generate.HCenterResponseMaker;
import com.home.commonCenter.server.CenterServer;

/** 中心服网络 */
public class GCenterServer extends CenterServer
{
	public GCenterServer()
	{
		
	}
	
	@Override
	protected void initMessage()
	{
		super.initMessage();
		
		addRequestMaker(new GCenterRequestMaker());
		addClientResponseMaker(new GCenterResponseMaker());
		addClientResponseBind(new GCenterResponseBindTool());
		
		addRequestMaker(new HCenterRequestMaker());
		addClientResponseMaker(new HCenterResponseMaker());
		addClientResponseBind(new HCenterResponseBindTool());
		
		addRequestMaker(new GCenterServerRequestMaker());
		addServerResponseMaker(new GCenterServerResponseMaker());
		//		addClientBytesHttpResponseMaker(new CenterHttpResponseMaker());
	}
}
