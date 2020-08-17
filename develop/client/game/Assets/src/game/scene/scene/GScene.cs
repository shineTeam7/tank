using System;
using ShineEngine;

/// <summary>
/// 
/// </summary>
public class GScene:Scene
{

	public GScene()
	{

	}

	protected override void registLogics()
	{
		base.registLogics();

	}

	protected override SceneInOutLogic createInOutLogic()
	{
		switch(_type)
		{
			default:
			{
				return base.createInOutLogic();
			}
		}
	}

	protected override ScenePosLogic createPosLogic()
	{
		return new GScenePosLogic();
	}

	protected override SceneFightLogic createFightLogic()
	{
		return new GSceneFightLogic();
	}

	protected override SceneShowLogic createShowLogic()
	{
		return new GSceneShowLogic();
	}

	protected override SceneLoadLogic createLoadLogic()
	{
		return new GSceneLoadLogic();
	}

	protected override SceneCameraLogic createCameraLogic()
	{
		return new GSceneCameraLogic();
	}
}