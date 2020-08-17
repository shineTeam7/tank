package com.home.all;

import com.home.base.global.BaseSetting;
import com.home.center.app.GCenterApp;
import com.home.commonManager.global.ManagerC;
import com.home.game.app.GGameApp;
import com.home.login.app.GLoginApp;
import com.home.manager.app.GManagerApp;
import com.home.scene.app.GSceneApp;
import com.home.shine.ShineSetup;
import com.home.shine.control.ThreadControl;
import com.home.shine.ctrl.Ctrl;
import com.home.shine.global.ShineSetting;

/** 简版合一执行 */
public class AllSimpleApp
{
	public static void main(String[] args)
	{
		ShineSetting.isAllInOne=true;
		BaseSetting.init(false);
		
		new GManagerApp().start();
		new GCenterApp().start();
		new GLoginApp(1).start();
		new GGameApp(1).start();
		new GSceneApp(1).start();
	}
}
