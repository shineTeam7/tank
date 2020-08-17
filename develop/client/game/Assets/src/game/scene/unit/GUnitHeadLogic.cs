using System;
using ShineEngine;
using UnityEngine;
using UnityEngine.UI;

/// <summary>
/// 
/// </summary>
public class GUnitHeadLogic:UnitHeadLogic3DOne
{
	public override void init()
	{
		base.init();
	}

	public override void dispose()
	{
		base.dispose();
	}

	public override void onAttributeChange(bool[] changeSet)
	{
		base.onAttributeChange(changeSet);
	}

	protected override string getUIModelName()
	{
		return "npcHead";
	}

	protected override UIModel toCreateModel()
	{
		return new UIModel_npcHead();
	}

	public override void onRefreshHp()
	{
		base.onRefreshHp();

		Ctrl.print("血条更新:",_unit.fight.getAttributeLogic().getHp(),_unit.fight.getAttributeLogic().getHpMax());
	}

	public override void onRefreshPhysicsShield()
	{
		base.onRefreshPhysicsShield();

	}

	public override void onFrame(int delay)
	{
		base.onFrame(delay);

	}
}