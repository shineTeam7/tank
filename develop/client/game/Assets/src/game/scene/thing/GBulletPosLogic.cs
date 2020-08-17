using System;
using ShineEngine;
using UnityEngine;

/// <summary>
/// 
/// </summary>
public class GBulletPosLogic:BulletPosLogic
{
	private GBulletShowLogic _showLogic;

	public GBulletPosLogic()
	{

	}

	public override void init()
	{
		_showLogic=(GBulletShowLogic)_bullet.show;

		base.init();
	}

	protected override void initPos()
	{
		base.initPos();

	}

	protected override void initBullet()
	{
		base.initBullet();

		switch(_levelConfig.castType)
		{

		}
	}

	protected override void onBulletFrame(int delay)
	{
		base.onBulletFrame(delay);

		//已失效
		if(!_bullet.enabled)
			return;

		switch(_levelConfig.castType)
		{

		}
	}
}