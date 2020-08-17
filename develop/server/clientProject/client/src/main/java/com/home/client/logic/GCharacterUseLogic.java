package com.home.client.logic;

import com.home.base.data.role.GCharacterUseData;
import com.home.commonBase.data.role.MUnitUseData;
import com.home.commonClient.logic.unit.CharacterUseLogic;
import com.home.commonClient.logic.unit.MUnitFightDataLogic;

public class GCharacterUseLogic extends CharacterUseLogic
{
	private GCharacterUseData _data;
	
	@Override
	public void setData(MUnitUseData data)
	{
		super.setData(data);
		
		_data=(GCharacterUseData)data;
	}
	
	/** 游戏数据 */
	public GCharacterUseData getGData()
	{
		return _data;
	}
	
	@Override
	protected void makeFightDataLogic(MUnitFightDataLogic logic)
	{
		logic.index=_data.id;
	}
}
