using System;
using ShineEngine;

/// <summary>
/// 主工程工厂控制
/// </summary>
public class GMainFactoryControl:MainFactoryControl
{
	public override MainLoginControl createLoginControl()
	{
		return new GMainLoginControl();
	}

	public override CILRuntimeControl createILRuntimeControl()
	{
		return new GILRuntimeControl();
	}

	public override GameNatureUIControl createGameNUIControl()
	{
		return new GGameNatureUiControl();
	}
}