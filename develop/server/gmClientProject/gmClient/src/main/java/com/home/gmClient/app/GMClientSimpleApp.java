package com.home.gmClient.app;

import com.home.base.global.BaseSetting;

public class GMClientSimpleApp
{
	public static void main(String[] args)
	{
		BaseSetting.init(false);
		new GGMClientApp().start();
	}
}
