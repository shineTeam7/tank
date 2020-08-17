package com.home.center.app;

import com.home.base.constlist.generate.GServerMessageType;
import com.home.base.control.GBaseFactoryControl;
import com.home.center.constlist.generate.GCenterRequestType;
import com.home.center.constlist.generate.GCenterResponseType;
import com.home.center.part.centerGlobal.GCenterGlobal;
import com.home.center.control.GCenterFactoryControl;
import com.home.center.control.GCenterMainControl;
import com.home.center.global.GCenterC;
import com.home.commonBase.control.BaseFactoryControl;
import com.home.commonCenter.app.CenterApp;
import com.home.commonCenter.control.CenterFactoryControl;
import com.home.commonCenter.global.CenterC;
import com.home.shine.control.BytesControl;

/** 中心服App(登录,转发,逻辑一体) */
public class GCenterApp extends CenterApp
{
	public GCenterApp()
	{
		super();
		
		GCenterC.app=this;
	}
	
	@Override
	protected void messageRegist()
	{
		super.messageRegist();
		
		BytesControl.addMessageConst(GServerMessageType.class,true,true);
		BytesControl.addMessageConst(GServerMessageType.class,false,true);
		
		BytesControl.addMessageConst(GCenterRequestType.class,true,false);
		BytesControl.addMessageConst(GCenterResponseType.class,false,false);
	}
	
	@Override
	protected void makeControls()
	{
		super.makeControls();
		
		GCenterC.main=(GCenterMainControl)CenterC.main;
		GCenterC.global=(GCenterGlobal)CenterC.global;
	}
	
	@Override
	protected BaseFactoryControl createBaseFactoryControl()
	{
		return new GBaseFactoryControl();
	}
	
	@Override
	protected CenterFactoryControl createFactoryControl()
	{
		return new GCenterFactoryControl();
	}
}
