using System;
using ShineEngine;

/// <summary>
/// 热更入口
/// </summary>
public class HGameApp:GGameApp
{
	/** 主函数 */
	public static void main()
	{
		new HGameApp().start();
	}

	/** 配置表加载 */
	public static void mainForEditor()
	{
		new HGameApp().startForEditor();
	}

	protected override void makeControls()
	{
		base.makeControls();

		HGameC.main=(HGameMainControl)GameC.main;
		HGameC.ui=(HGameUIControl)GameC.ui;
		HGameC.player=(HPlayer)GameC.player;
	}

	protected override GameFactoryControl createGameFactoryControl()
	{
		return new HGameFactoryControl();
	}
}