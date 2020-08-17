using System;
using ShineEngine;
using UnityEngine.SceneManagement;

/// <summary>
/// 
/// </summary>
public class GSceneControl:SceneControl
{
	private UnityEngine.SceneManagement.Scene _rootScene;

	public GSceneControl()
	{

	}

	public override void onMatchSuccess(int funcID,int index,PlayerMatchData[] matcheDatas)
	{
		switch(funcID)
		{

		}
	}

	public override void onMatchTimeOut(int funcID)
	{

	}


	/** 主角射击朝向 */
	public void heroStartShootDir()
	{
		Unit unit;
		if(_scene!=null && (unit=_scene.hero)!=null)
			((GCharacterControlLogic)unit.control).startShootDir();
	}

	/** 主角射击朝向 */
	public void heroShootDir(float dir)
	{
		Unit unit;
		if(_scene!=null && (unit=_scene.hero)!=null)
			((GCharacterControlLogic)unit.control).shootDir(dir);
	}

	/** 主角取消设计朝向 */
	public void heroCancelShootDir()
	{
		Unit unit;
		if(_scene!=null && (unit=_scene.hero)!=null)
			((GCharacterControlLogic)unit.control).cancelShootDir();
	}
}