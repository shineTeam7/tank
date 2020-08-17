package com.home.test;

import com.home.base.global.BaseSetting;
import com.home.manager.app.GManagerApp;

public class ManagerStart
{
	public static void main(String[] args)
	{
		BaseSetting.init(false);
		new GManagerApp().start();
	}
}
