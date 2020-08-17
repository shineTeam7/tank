using System;
using ShineEngine;
using UnityEngine;

/// <summary>
/// 单位显示逻辑
/// </summary>
public class GUnitShowLogic:UnitShowLogic3DOne
{
	private Transform _turretTransform=null;

	public GUnitShowLogic()
	{

	}

	public override void dispose()
	{
		base.dispose();

		_turretTransform=null;
	}

	protected override void setMainObj(GameObject obj)
	{
		base.setMainObj(obj);

		_turretTransform=obj.transform.Find("turret");
	}

	protected override void updateShow()
	{
		base.updateShow();

		setShootDir(((GUnitPosData)_unit.getUnitData().pos).shootDir);
	}

	/** 计算摄像机位置点 */
	protected override void calculateCameraPosition()
	{
		if(_mainObj!=null)
		{
			//身体位置
			_cameraPosition=_mainObj.transform.position;
			_cameraPosition.y+=1f;//TODO:暂时先这么干,以后改胸口位置
		}
	}

	protected override void doSetDir(DirData dir)
	{
		base.doSetDir(dir);

		setShootDir(((GUnitPosData)_unit.getUnitData().pos).shootDir);
	}

	/** 显示层设置坐标 */
	public void setShootDir(DirData dir)
	{
		if(_turretTransform!=null)
		{
			Quaternion qt=new Quaternion();

			if(dir==null)
			{
				qt.w=1;
			}
			else
			{
				float direction=MathUtils.directionCut(dir.direction - _unit.pos.getDir().direction);
				qt.SetEulerRotation(0,-direction+CommonSetting.rotationOff,0);
			}

			_turretTransform.localRotation=qt;
		}
	}
}