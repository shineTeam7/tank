using System;
using ShineEngine;
using UnityEngine;

/// <summary>
/// 游戏特效
/// </summary>
public class GUnitEffect:UnitEffect
{
	public override void setConfig(EffectConfig config)
	{
		base.setConfig(config);

	}

	protected override void afterLoadOver()
	{
		base.afterLoadOver();

	}

	public override void dispose()
	{
		base.dispose();

	}

	//	public override void onSetPos(PosData pos)
	//	{
	//		if(_bullet!=null)
	//		{
	//			_transform.position=pos.getVector();
	//		}
	//	}

	public override void onSetDir(DirData dir)
	{
		if(_gameObject==null)
			return;


	}
}