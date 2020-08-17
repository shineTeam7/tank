using System;
using ShineEngine;

/// <summary>
/// 
/// </summary>
public class GBullet:Bullet
{
	public GBullet()
	{
	}

	protected override BulletPosLogic createPosLogic()
	{
		return new GBulletPosLogic();
	}

	protected override BulletShowLogic createShowLogic()
	{
		return new GBulletShowLogic();
	}
}