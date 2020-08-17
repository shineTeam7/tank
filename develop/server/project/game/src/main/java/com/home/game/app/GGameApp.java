package com.home.game.app;

import com.home.base.constlist.generate.GServerMessageType;
import com.home.commonBase.control.BaseFactoryControl;
import com.home.commonBase.global.CommonSetting;
import com.home.commonGame.app.GameApp;
import com.home.commonGame.control.GameFactoryControl;
import com.home.commonGame.global.GameC;
import com.home.game.constlist.generate.GGameRequestType;
import com.home.game.constlist.generate.GGameResponseType;
import com.home.game.control.GGameBaseFactoryControl;
import com.home.game.control.GGameFactoryControl;
import com.home.game.control.GGameMainControl;
import com.home.game.control.GSceneControl;
import com.home.base.extern.GExternMethod;
import com.home.game.part.gameGlobal.GGameGlobal;
import com.home.game.global.GGameC;
import com.home.shine.control.BytesControl;
import com.home.shine.control.ThreadControl;
import com.home.shine.ctrl.Ctrl;
import com.home.shine.utils.MathUtils;

/** 游戏App */
public class GGameApp extends GameApp
{
	public GGameApp(int id)
	{
		super(id);
	}
	
	@Override
	protected void messageRegist()
	{
		super.messageRegist();
		
		BytesControl.addMessageConst(GServerMessageType.class,true,true);
		BytesControl.addMessageConst(GServerMessageType.class,false,true);
		
		BytesControl.addMessageConst(GGameRequestType.class,true,false);
		BytesControl.addMessageConst(GGameResponseType.class,false,false);
	}
	
	@Override
	protected void makeControls()
	{
		super.makeControls();
		
		GGameC.main=(GGameMainControl)GameC.main;
		GGameC.scene=(GSceneControl)GameC.scene;
		GGameC.global=(GGameGlobal)GameC.global;
	}
	
	@Override
	protected void loadLib()
	{
		super.loadLib();
		
		GExternMethod.init();
	}
	
	@Override
	protected void afterStartOver()
	{
		super.afterStartOver();
		
	}
	
	@Override
	protected BaseFactoryControl createBaseFactoryControl()
	{
		return new GGameBaseFactoryControl();
	}
	
	@Override
	protected GameFactoryControl createFactoryControl()
	{
		return new GGameFactoryControl();
	}
}
