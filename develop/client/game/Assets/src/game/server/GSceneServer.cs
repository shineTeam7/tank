using System;
using ShineEngine;

/// <summary>
///
/// </summary>
public class GSceneServer:SceneServer
{
	public override void initMessage()
	{
		base.initMessage();

		addRequestMaker(new GSceneBaseRequestMaker());
		addResponseMaker(new GSceneBaseResponseMaker());
		addClientRequestBind(new GSceneBaseRequestBindTool());

		addRequestMaker(new GSceneRequestMaker());
		addResponseMaker(new GSceneResponseMaker());
		addClientRequestBind(new GSceneRequestBindTool());
	}
}