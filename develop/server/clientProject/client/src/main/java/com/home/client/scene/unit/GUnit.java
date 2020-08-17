package com.home.client.scene.unit;

import com.home.commonBase.constlist.generate.UnitType;
import com.home.commonBase.scene.unit.UnitFightLogic;
import com.home.commonBase.scene.unit.UnitIdentityLogic;
import com.home.commonBase.scene.unit.UnitMoveLogic;
import com.home.commonClient.scene.base.GameUnit;
import com.home.commonClient.scene.unit.CharacterIdentityLogic;

/** 游戏单位 */
public class GUnit extends GameUnit
{
	@Override
	protected UnitIdentityLogic createIdentityLogic()
	{
		switch(getType())
		{
			case UnitType.Character:
			{
				return new CharacterIdentityLogic();
			}
			//case UnitType.Puppet:
			//{
			//	return new GPuppetIdentityLogic();
			//}
		}
		
		return super.createIdentityLogic();
	}
	
	@Override
	protected UnitMoveLogic createMoveLogic()
	{
		return new GUnitMoveLogic();
	}
	
	@Override
	protected UnitFightLogic createFightLogic()
	{
		return new GUnitFightLogic();
	}
}
