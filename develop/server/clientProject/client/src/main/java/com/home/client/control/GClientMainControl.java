package com.home.client.control;

import com.home.client.tool.generate.GCenterRequestMaker;
import com.home.client.tool.generate.GCenterResponseMaker;
import com.home.client.tool.generate.GGameRequestMaker;
import com.home.client.tool.generate.GGameResponseMaker;
import com.home.client.tool.generate.HCenterRequestMaker;
import com.home.client.tool.generate.HCenterResponseMaker;
import com.home.client.tool.generate.HGameRequestMaker;
import com.home.client.tool.generate.HGameResponseMaker;
import com.home.commonClient.control.ClientMainControl;
import com.home.shine.control.BytesControl;

public class GClientMainControl extends ClientMainControl
{
	public GClientMainControl()
	{
		
	}
	
	@Override
	protected void makeResponse()
	{
		super.makeResponse();
		
		BytesControl.addRequestMaker(new GGameRequestMaker());
		_clientResponseMaker.addDic(new GGameResponseMaker());
		BytesControl.addRequestMaker(new HGameRequestMaker());
		_clientResponseMaker.addDic(new HGameResponseMaker());
		
		BytesControl.addRequestMaker(new GCenterRequestMaker());
		_clientResponseMaker.addDic(new GCenterResponseMaker());
		BytesControl.addRequestMaker(new HCenterRequestMaker());
		_clientResponseMaker.addDic(new HCenterResponseMaker());
		
	}
}
