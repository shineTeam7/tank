package com.home.game.logic;

import com.home.base.data.role.GCharacterUseData;
import com.home.commonBase.data.role.MUnitUseData;
import com.home.commonGame.logic.unit.CharacterUseLogic;

/** 游戏角色使用逻辑 */
public class GCharacterUseLogic extends CharacterUseLogic
{
	private GCharacterUseData _data;
	
	@Override
	protected void setData(MUnitUseData data)
	{
		super.setData(data);
		
		_data=(GCharacterUseData)data;
	}
	
	/** 游戏数据 */
	public GCharacterUseData getGData()
	{
		return _data;
	}
	
}
