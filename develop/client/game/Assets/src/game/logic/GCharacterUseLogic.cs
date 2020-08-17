using System;
using ShineEngine;

/// <summary>
/// 游戏角色使用逻辑
/// </summary>
public class GCharacterUseLogic:CharacterUseLogic
{
	private GCharacterUseData _data;

	protected override void setData(MUnitUseData data)
	{
		base.setData(data);

		_data=(GCharacterUseData)data;
	}

	/** 游戏数据 */
	public GCharacterUseData getGData()
	{
		return _data;
	}
}