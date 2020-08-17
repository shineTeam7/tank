package com.home.client.app;

import com.home.base.constlist.generate.GRobotTestModeType;
import com.home.base.global.BaseSetting;
import com.home.commonBase.constlist.generate.RobotTestModeType;
import com.home.commonBase.global.CommonSetting;
import com.home.commonClient.global.ClientGlobal;

public class ClientSimpleApp
{
	public static void main(String[] args)
	{
		CommonSetting.isClient=true;
		BaseSetting.init(false);
		
		ClientGlobal.init();
		
		ClientGlobal.num=1;
		ClientGlobal.nameFront="robotA";
		
		//ClientGlobal.mode=RobotTestModeType.Login;
		ClientGlobal.mode=GRobotTestModeType.TestMelee;
		
		new GClientApp().start();
	}
}