using System;
using ShineEngine;
using Spine.Unity;
using UnityEngine;

/// <summary>
/// 
/// </summary>
public class GBulletShowLogic:BulletShowLogic
{
	private Transform _transform;

	public GBulletShowLogic()
	{

	}

	public override void init()
	{

		base.init();
	}

	public override void dispose()
	{
		base.dispose();

		_transform=null;
	}

	public override void effectLoadOver()
	{
		base.effectLoadOver();

		if(_effect!=null)
		{
			_transform=_effect.transform;
		}
	}

	public Transform transform
	{
		get
		{
			return _transform;
		}
	}

}