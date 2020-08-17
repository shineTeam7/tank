package com.home.test;

import com.home.base.global.BaseSetting;
import com.home.center.app.GCenterApp;

public class CenterStart
{
	public static void main(String[] args)
	{
		BaseSetting.init(false);
		new GCenterApp().start();
	}
}
