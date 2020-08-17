using System;
using ShineEngine;

/// <summary>
/// 角色显示逻辑
/// </summary>
public class GCharacterShowLogic:GUnitShowLogic
{
	private GCharacterIdentityData _idData;

	public GCharacterShowLogic()
	{

	}

	public override void init()
	{
		base.init();

		_idData=(GCharacterIdentityData)_data.identity;
	}

	public override void dispose()
	{
		base.dispose();

		_idData=null;
	}
}