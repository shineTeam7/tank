package com.home.center.control;

import com.home.center.part.centerGlobal.GCenterGlobal;
import com.home.center.server.GCenterServer;
import com.home.commonBase.tool.DataRegister;
import com.home.commonCenter.control.CenterDBControl;
import com.home.commonCenter.control.CenterFactoryControl;
import com.home.commonCenter.control.CenterMainControl;
import com.home.commonCenter.control.CenterVersionControl;
import com.home.commonCenter.part.centerGlobal.CenterGlobal;
import com.home.commonCenter.server.CenterServer;

/** 中心服工厂控制 */
public class GCenterFactoryControl extends CenterFactoryControl
{
	//--控制组--//
	
	@Override
	public CenterDBControl createDBControl()
	{
		return new GCenterDBControl();
	}
	
	@Override
	public CenterMainControl createMainControl()
	{
		return new GCenterMainControl();
	}
	
	@Override
	public CenterServer createServer()
	{
		return new GCenterServer();
	}
	
	@Override
	public CenterGlobal createGlobal()
	{
		return new GCenterGlobal();
	}
	
	@Override
	public CenterVersionControl createVersionControl()
	{
		return new GCenterVersionControl();
	}
	
	//--逻辑组--//
}
