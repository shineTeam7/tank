using System;
using ShineEngine;
using UnityEngine;

/// <summary>
///
/// </summary>
public class GCharacterControlLogic:CharacterControlLogic
{
	/** 缓存当前摇杆方向 */
	private float _cacheShootDir;
	/** 缓存摄像机方向 */
	private float _cacheShootCameraAxisY;

	private bool _isShootDirMoving=false;



	public override void afterInit()
	{
		base.afterInit();

		_controller.center=new Vector3(0f,1f,0f);
		_controller.radius=1f;
		_controller.height=2f;

	}

	public override void dispose()
	{
		base.dispose();


	}

	/** 开始射击朝向 */
	public void startShootDir()
	{
		//存好摄像机位置
		_cacheShootCameraAxisY=_scene.camera.mainCamera.currentAxisY;
	}

	/** 常规移动朝向 */
	public void shootDir(float dir)
	{
		_cacheShootDir=dir;

		if(!_isShootDirMoving)
		{
			_isShootDirMoving=true;

			((GUnitFightLogic)_unit.fight).setShooting(true);
		}

		doShootDir();
	}

	/** 取消移动朝向 */
	public void cancelShootDir()
	{
		if(!_isShootDirMoving)
			return;

		_isShootDirMoving=false;

		((GUnitFightLogic)_unit.fight).setShooting(false);

		if(_scene.method.canOperate())
		{
			((GUnitPosLogic)_unit.pos).cancelShootDir();
		}
	}

	private void doShootDir()
	{
		float dir=MathUtils.directionCut(_cacheShootDir - _cacheShootCameraAxisY);

		if(_scene.method.canOperate())
		{
			((GUnitPosLogic)_unit.pos).setShootDir(dir);
		}
	}


}