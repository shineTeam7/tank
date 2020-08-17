package com.home.test;

import com.home.base.global.BaseSetting;
import com.home.commonLogin.app.LoginApp;
import com.home.login.app.GLoginApp;

public class LoginStart
{
	public static void main(String[] args)
	{
		BaseSetting.init(false);
		new GLoginApp(1).start();
	}
}
