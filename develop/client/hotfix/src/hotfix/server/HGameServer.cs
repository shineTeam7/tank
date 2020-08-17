using System;
using ShineEngine;

/// <summary>
///
/// </summary>
public class HGameServer:GGameServer
{
	public override void initMessage()
	{
		base.initMessage();

		addRequestMaker(new HSceneBaseRequestMaker());
		addResponseMaker(new HSceneBaseResponseMaker());
		addClientRequestBind(new HSceneBaseRequestBindTool());

		addRequestMaker(new HGameRequestMaker());
		addResponseMaker(new HGameResponseMaker());
		addClientRequestBind(new HGameRequestBindTool());
		addRequestMaker(new HCenterRequestMaker());
		addResponseMaker(new HCenterResponseMaker());
		addClientRequestBind(new HCenterRequestBindTool());
	}
}