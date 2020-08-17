using System;
using ShineEngine;

/// <summary>
/// 主工程app
/// </summary>
public class GMainApp:MainApp
{
	protected override MainFactoryControl createFactoryControl()
	{
		return new GMainFactoryControl();
	}

	protected override void initSetting()
	{
		BaseSetting.init();
	}
}