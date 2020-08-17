package com.home.test;

import com.home.base.global.BaseSetting;
import com.home.center.app.GCenterApp;
import com.home.commonBase.global.BaseC;

public class DBUpdateStart
{
	public static void main(String[] args)
	{
		BaseSetting.init(false);
		
		new GCenterApp().startCustom(()->
		{
			BaseC.dbUpdate.execute();
		});
	}
}
