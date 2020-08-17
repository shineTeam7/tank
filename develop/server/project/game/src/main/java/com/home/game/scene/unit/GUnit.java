package com.home.game.scene.unit;

import com.home.commonBase.scene.unit.UnitAICommandLogic;
import com.home.commonBase.scene.unit.UnitAOILogic;
import com.home.commonBase.scene.unit.UnitFightLogic;
import com.home.commonBase.scene.unit.UnitPosLogic;
import com.home.commonGame.scene.base.GameUnit;
import com.home.sceneBase.scene.unit.GUnitAICommandLogic;
import com.home.sceneBase.scene.unit.GUnitFightLogic;
import com.home.sceneBase.scene.unit.GUnitPosLogic;

/** 游戏单位 */
public class GUnit extends GameUnit
{
	@Override
	protected void registLogics()
	{
		super.registLogics();
	}
	
	@Override
	protected UnitFightLogic createFightLogic()
	{
		return new GUnitFightLogic();
	}
	
	@Override
	protected UnitPosLogic createPosLogic()
	{
		return new GUnitPosLogic();
	}
	
	@Override
	protected UnitAOILogic createAOILogic()
	{
		return new UnitAOILogic();
	}
	
	@Override
	protected UnitAICommandLogic createAICommandLogic()
	{
		return new GUnitAICommandLogic();
	}
}
