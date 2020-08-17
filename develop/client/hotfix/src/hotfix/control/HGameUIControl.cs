using System;
using ShineEngine;

public class HGameUIControl:GameUIControl
{
	/// <summary>
	/// 初始化UI
	/// </summary>
	protected override void initUI()
	{
		HGameUI.init();
	}

	public override void init()
	{
		base.init();

	}

	public override void alert(string msg,Action sureCall)
	{

	}

	public override void notice(string msg)
	{

	}
}
