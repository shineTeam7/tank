package com.home.test;

import com.home.base.global.BaseSetting;
import com.home.game.app.GGameApp;

public class Game3Start
{
	public static void main(String[] args)
	{
		BaseSetting.init(false);
		new GGameApp(3).start();
	}
}
