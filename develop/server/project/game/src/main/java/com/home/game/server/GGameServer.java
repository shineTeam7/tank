package com.home.game.server;

import com.home.base.constlist.generate.GServerMessageType;
import com.home.commonGame.server.GameServer;
import com.home.game.constlist.generate.GGameRequestType;
import com.home.game.constlist.generate.GGameResponseType;
import com.home.game.tool.generate.GGameRequestMaker;
import com.home.game.tool.generate.GGameResponseBindTool;
import com.home.game.tool.generate.GGameResponseMaker;
import com.home.game.tool.generate.GGameServerRequestMaker;
import com.home.game.tool.generate.GGameServerResponseMaker;
import com.home.game.tool.generate.HGameRequestMaker;
import com.home.game.tool.generate.HGameResponseBindTool;
import com.home.game.tool.generate.HGameResponseMaker;
import com.home.sceneBase.constlist.generate.GSceneBaseRequestType;
import com.home.sceneBase.constlist.generate.GSceneBaseResponseType;
import com.home.sceneBase.constlist.generate.HSceneBaseRequestType;
import com.home.sceneBase.constlist.generate.HSceneBaseResponseType;
import com.home.sceneBase.tool.generate.GSceneBaseRequestMaker;
import com.home.sceneBase.tool.generate.GSceneBaseResponseBindTool;
import com.home.sceneBase.tool.generate.GSceneBaseResponseMaker;
import com.home.sceneBase.tool.generate.HSceneBaseRequestMaker;
import com.home.sceneBase.tool.generate.HSceneBaseResponseBindTool;
import com.home.sceneBase.tool.generate.HSceneBaseResponseMaker;
import com.home.sceneBase.utils.GSceneBaseUtils;
import com.home.shine.control.BytesControl;

/** 逻辑服进程 */
public class GGameServer extends GameServer
{
	public GGameServer()
	{

	}
	
	@Override
	protected void initMessage()
	{
		super.initMessage();
		
		GSceneBaseUtils.initGSceneBaseMessage(this);
		
		BytesControl.addMessageConst(GServerMessageType.class,true,true);
		BytesControl.addMessageConst(GServerMessageType.class,false,true);
		
		BytesControl.addMessageConst(GGameRequestType.class,true,false);
		BytesControl.addMessageConst(GGameResponseType.class,false,false);
		
		addRequestMaker(new GGameRequestMaker());
		addClientResponseMaker(new GGameResponseMaker());
		addClientResponseBind(new GGameResponseBindTool());
		
		addRequestMaker(new HGameRequestMaker());
		addClientResponseMaker(new HGameResponseMaker());
		addClientResponseBind(new HGameResponseBindTool());
		
		addRequestMaker(new GGameServerRequestMaker());
		addServerResponseMaker(new GGameServerResponseMaker());
	}
}
