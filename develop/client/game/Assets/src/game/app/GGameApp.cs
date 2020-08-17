using ShineEngine;
using UnityEngine;

/// <summary>
/// game应用类
/// </summary>
public class GGameApp:GameApp
{
	protected override void makeControls()
	{
		base.makeControls();

		GGameC.factory=(GGameFactoryControl)GameC.factory;
		GGameC.player=(GPlayer)GameC.player;
		GGameC.scene=(GSceneControl)GameC.scene;
	}

	protected override void onStart()
	{
		base.onStart();

	}

	protected override GameFactoryControl createGameFactoryControl()
	{
		return new GGameFactoryControl();
	}
}