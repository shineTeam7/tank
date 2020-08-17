/// <summary>
/// 服务器连接
/// </summary>
public class GGameServer:GameServer
{
	public override void initMessage()
	{
		base.initMessage();

		addRequestMaker(new GSceneBaseRequestMaker());
		addResponseMaker(new GSceneBaseResponseMaker());
		addClientRequestBind(new GSceneBaseRequestBindTool());

		addRequestMaker(new GGameRequestMaker());
		addResponseMaker(new GGameResponseMaker());
		addClientRequestBind(new GGameRequestBindTool());
		addRequestMaker(new GCenterRequestMaker());
		addResponseMaker(new GCenterResponseMaker());
		addClientRequestBind(new GCenterRequestBindTool());
	}
}