package com.home.scene.server;

import com.home.commonScene.server.SceneServer;
import com.home.scene.constlist.generate.GSceneRequestType;
import com.home.scene.constlist.generate.HSceneRequestType;
import com.home.scene.tool.generate.GSceneRequestMaker;
import com.home.scene.tool.generate.GSceneResponseBindTool;
import com.home.scene.tool.generate.GSceneResponseMaker;
import com.home.scene.tool.generate.HSceneRequestMaker;
import com.home.scene.tool.generate.HSceneResponseBindTool;
import com.home.scene.tool.generate.HSceneResponseMaker;
import com.home.sceneBase.utils.GSceneBaseUtils;
import com.home.shine.control.BytesControl;

public class GSceneServer extends SceneServer
{
	@Override
	protected void initMessage()
	{
		super.initMessage();
		
		GSceneBaseUtils.initGSceneBaseMessage(this);
		
		BytesControl.addMessageConst(GSceneRequestType.class,true,false);
		BytesControl.addMessageConst(GSceneRequestType.class,false,false);
		
		addRequestMaker(new GSceneRequestMaker());
		addClientResponseMaker(new GSceneResponseMaker());
		addClientResponseBind(new GSceneResponseBindTool());
		
		BytesControl.addMessageConst(HSceneRequestType.class,true,false);
		BytesControl.addMessageConst(HSceneRequestType.class,false,false);
		
		addRequestMaker(new HSceneRequestMaker());
		addClientResponseMaker(new HSceneResponseMaker());
		addClientResponseBind(new HSceneResponseBindTool());
	}
}
