using ShineEngine;
using UnityEngine;

/// <summary>
/// 登录控制
/// </summary>
public class HGameMainControl:GameMainControl
{
	public HGameMainControl()
	{

	}

	protected override void doStepInputUser(ClientLoginCacheData data,bool canOffline)
	{
		Ctrl.print("账号输入过程",data);
		// base.doStepInputUser(data,canOffline);
		// inputUserOver(createClientLoginData());

		HGameUI.login.show(data);
	}

	protected override void stepPreGameStart()
	{
		base.stepPreGameStart();

		HGameUI.main.show();
	}

	protected override void stepGameStart()
	{
		base.stepGameStart();


	}
}