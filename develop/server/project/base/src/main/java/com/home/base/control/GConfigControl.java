package com.home.base.control;

import com.home.base.constlist.generate.GTextEnum;
import com.home.base.constlist.generate.HTextEnum;
import com.home.commonBase.control.ConfigControl;

/** 配置控制 */
public class GConfigControl extends ConfigControl
{
	@Override
	protected int getGameConfigVersion()
	{
		return GCodeCheckRecord.configVersion;
	}
	
	@Override
	protected int getHotfixConfigVersion()
	{
		return HCodeCheckRecord.configVersion;
	}
	
	@Override
	public int getDBDataVersion()
	{
		return HCodeCheckRecord.dbDataVersion;
	}
	
	@Override
	public int getMsgDataVersion()
	{
		return HCodeCheckRecord.msgDataVersion;
	}
	
	@Override
	protected void refreshConfig()
	{
		super.refreshConfig();
		
		GTextEnum.readConfig();
		HTextEnum.readConfig();
	}
}
