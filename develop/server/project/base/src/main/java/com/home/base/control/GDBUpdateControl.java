package com.home.base.control;

import com.home.commonBase.control.DBUpdateControl;

public class GDBUpdateControl extends DBUpdateControl
{
	@Override
	protected int getNowDataVersion()
	{
		return HCodeCheckRecord.dbDataVersion;
	}
	
	@Override
	protected int getLastDataVersion()
	{
		return HCodeCheckRecord.lastDBDataVersion;
	}
}
