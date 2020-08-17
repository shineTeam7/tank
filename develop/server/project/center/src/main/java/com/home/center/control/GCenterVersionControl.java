package com.home.center.control;

import com.home.center.part.centerGlobal.GCenterGlobal;
import com.home.commonCenter.control.CenterVersionControl;
import com.home.shine.support.func.ObjectCall;

/** 中心服版本控制 */
public class GCenterVersionControl extends CenterVersionControl
{
	@Override
	public void init()
	{
		super.init();
		
		
	}
	
	private void registGFuncG(int version,ObjectCall<GCenterGlobal> func)
	{
		registGFunc(version,k->func.apply((GCenterGlobal)k));
	}
}
