using System;
using ShineEngine;

/// <summary>
/// 
/// </summary>
public class HSceneServer:GSceneServer
{
	public override void initMessage()
	{
		base.initMessage();

		addRequestMaker(new HSceneBaseRequestMaker());
		addResponseMaker(new HSceneBaseResponseMaker());
		addClientRequestBind(new HSceneBaseRequestBindTool());

		addRequestMaker(new HSceneRequestMaker());
		addResponseMaker(new HSceneResponseMaker());
		addClientRequestBind(new HSceneRequestBindTool());
	}
}