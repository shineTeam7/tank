using System;
using System.Diagnostics;
using ShineEngine;
using UnityEngine;
using UnityEngine.UI;

/// <summary>
/// 单位位移控制逻辑
/// </summary>
public class GUnitPosLogic:UnitPosLogic
{
	/** 游戏单位 */
	private GUnit _gUnit;

	private GUnitPosData _gd;

	private DirData _tShootDir=new DirData();

	private int _sendShootDirTime=0;

	public GUnitPosLogic()
	{

	}

	public override void init()
	{
		base.init();

		_gUnit=(GUnit)_unit;
		_gd=(GUnitPosData)_data.pos;
	}

	public override void dispose()
	{
		base.dispose();

		_gUnit=null;
		_gd=null;
	}

	public override void onFrame(int delay)
	{
		base.onFrame(delay);

		if(_sendShootDirTime>0)
		{
			if((_sendShootDirTime-=delay)<=0)
			{
				_sendShootDirTime=0;
				CUnitChangeShootDirRequest.create(_unit.instanceID,_gd.shootDir).send();
			}
		}
	}

	public void onSetShootDir()
	{
		((GUnitShowLogic)_unit.show).setShootDir(_gd.shootDir);
	}

	public void setShootDirByServer(DirData data)
	{
		_gd.shootDir=data;
		onSetShootDir();
	}

	public void setShootDir(float dir)
	{
		bool changed;

		if(_gd.shootDir==null)
		{
			_gd.shootDir=_tShootDir;

			changed=true;
		}
		else
		{
			changed=_gd.shootDir.direction!=dir;
		}

		if(changed)
		{
			_gd.shootDir.direction=dir;

			onSetShootDir();

			doSendShootDir();
		}
	}

	private void doSendShootDir()
	{
		if(_sendShootDirTime==0)
		{
			CUnitChangeShootDirRequest.create(_unit.instanceID,_gd.shootDir).send();
			_sendShootDirTime=200;
		}
	}

	public void cancelShootDir()
	{
		_gd.shootDir=null;
		onSetShootDir();
		CUnitChangeShootDirRequest.create(_unit.instanceID,null).send();
		_sendShootDirTime=0;
	}
}