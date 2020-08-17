using System;
using ShineEngine;
using UnityEngine;

/// <summary>
/// 
/// </summary>
public class GSceneCameraLogic:SceneCameraFixedLogic
{
	public GSceneCameraLogic()
	{

	}

	public override void onSceneLoad()
	{
		base.onSceneLoad();

		GameObject camera=GameObject.Find("Camera");

		//去掉残留相机
		if(camera!=null)
		{
			GameObject.Destroy(camera);
		}
	}

	public override void init()
	{
		base.init();

	}

	public override void dispose()
	{
		base.dispose();
	}

	public override void onFrame(int delay)
	{
		base.onFrame(delay);

		GameObject gameObject=_scene.hero.show.gameObject;

		if(gameObject!=null)
		{
			_mainCamera.setTargetPos(gameObject.transform.position);
		}
	}
}