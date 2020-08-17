package com.home.sceneBase.utils;

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
import com.home.shine.control.BytesControl;
import com.home.shine.server.BaseServer;

public class GSceneBaseUtils
{
	public static void initGSceneBaseMessage(BaseServer server)
	{
		//sceneBase
		BytesControl.addMessageConst(GSceneBaseRequestType.class,true,false);
		BytesControl.addMessageConst(GSceneBaseResponseType.class,false,false);
		server.addRequestMaker(new GSceneBaseRequestMaker());
		server.addClientResponseMaker(new GSceneBaseResponseMaker());
		server.addClientResponseBind(new GSceneBaseResponseBindTool());
		
		BytesControl.addMessageConst(HSceneBaseRequestType.class,true,false);
		BytesControl.addMessageConst(HSceneBaseResponseType.class,false,false);
		server.addRequestMaker(new HSceneBaseRequestMaker());
		server.addClientResponseMaker(new HSceneBaseResponseMaker());
		server.addClientResponseBind(new HSceneBaseResponseBindTool());
	}
}
