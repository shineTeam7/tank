using System;
using ShineEngine;
using UnityEngine;

/// <summary>
/// 单位外显逻辑
/// </summary>
public class GUnitAvatarLogic:UnitAvatarLogic
{
	/** 造型改变 */
	public override void onAvatarChange(int modelID)
	{
		base.onAvatarChange(modelID);

		Ctrl.print("造型改变：" + modelID);
	}

	/** 造型部件改变 */
	public override void onAvatarPartChange(IntIntMap dic)
	{
		base.onAvatarPartChange(dic);

		Ctrl.print("部件改变" + dic);

	}
}