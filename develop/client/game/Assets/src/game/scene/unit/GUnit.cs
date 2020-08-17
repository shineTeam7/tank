using System;
using ShineEngine;

/// <summary>
/// 游戏单位
/// </summary>
public class GUnit:Unit
{
	public GUnitHeadLogic gHead;

	public GUnit()
	{

	}

	protected override void registLogics()
	{
		base.registLogics();

		gHead=(GUnitHeadLogic)head;

	}

	protected override UnitIdentityLogic createIdentityLogic()
	{
		switch(type)
		{
			case UnitType.Character:
			{
				return new GCharacterIdentityLogic();
			}
		}

		return base.createIdentityLogic();
	}

	protected override UnitPosLogic createPosLogic()
	{
		return new GUnitPosLogic();
	}

	protected override UnitFightLogic createFightLogic()
	{
		return new GUnitFightLogic();
	}

	protected override UnitShowLogic createShowLogic()
	{
		if(_type==UnitType.Character)
		{
			return new GCharacterShowLogic();
		}

		return new GUnitShowLogic();
	}

	protected override UnitMoveLogic createMoveLogic()
	{
		return new GUnitMoveLogic();
	}

	protected override UnitAvatarLogic createAvatarLogic()
	{
		return new GUnitAvatarLogic();
	}

	protected override UnitHeadLogic createHeadLogic()
	{
		return new GUnitHeadLogic();
	}

	protected override CharacterControlLogic createCharacterControlLogic()
	{
		return new GCharacterControlLogic();
	}
}