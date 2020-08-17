package com.home.base.control;

import com.home.base.configH.base.HConfigReadData;
import com.home.base.data.login.GGameLoginData;
import com.home.base.data.role.GCharacterSaveData;
import com.home.base.data.role.GCharacterUseData;
import com.home.base.data.role.GRoleShowData;
import com.home.base.data.scene.unit.GCharacterIdentityData;
import com.home.base.part.centerGlobal.list.GCenterGlobalListData;
import com.home.base.part.gameGlobal.list.GGameGlobalListData;
import com.home.base.part.hPlayer.list.HPlayerListData;
import com.home.base.tool.GBaseDataRegister;
import com.home.base.trigger.GSceneTriggerExecutor;
import com.home.commonBase.config.base.ConfigReadData;
import com.home.commonBase.control.BaseFactoryControl;
import com.home.commonBase.control.ConfigControl;
import com.home.commonBase.control.TriggerControl;
import com.home.commonBase.data.login.GameLoginData;
import com.home.commonBase.data.role.CharacterSaveData;
import com.home.commonBase.data.role.CharacterUseData;
import com.home.commonBase.data.role.RoleShowData;
import com.home.commonBase.data.scene.unit.identity.CharacterIdentityData;
import com.home.commonBase.part.centerGlobal.list.CenterGlobalListData;
import com.home.commonBase.part.gameGlobal.list.GameGlobalListData;
import com.home.commonBase.part.player.list.PlayerListData;
import com.home.commonBase.table.table.PlayerTable;
import com.home.commonBase.tool.BaseDataRegister;
import com.home.commonBase.trigger.SceneTriggerExecutor;

public class GBaseFactoryControl extends BaseFactoryControl
{
	//--control组--//
	
	@Override
	public BaseDataRegister createBaseDataRegister()
	{
		return new GBaseDataRegister();
	}
	
	@Override
	public ConfigControl createConfigControl()
	{
		return new GConfigControl();
	}
	
	/** trigger控制 */
	public TriggerControl createTriggerControl()
	{
		return new GTriggerControl();
	}
	
	/** 数据库升级控制 */
	public GDBUpdateControl createDBUpdateControl()
	{
		return new GDBUpdateControl();
	}
	
	//--table组-//
	
	//--数据组--//
	
	@Override
	public ConfigReadData createConfigReadData()
	{
		return new HConfigReadData();
	}
	
	@Override
	public RoleShowData createRoleShowData()
	{
		return new GRoleShowData();
	}
	
	@Override
	public PlayerListData createPlayerListData()
	{
		return new HPlayerListData();
	}
	
	@Override
	public CenterGlobalListData createCenterGlobalListData()
	{
		return new GCenterGlobalListData();
	}
	
	@Override
	public GameGlobalListData createGameGlobalListData()
	{
		return new GGameGlobalListData();
	}
	
	@Override
	public CharacterIdentityData createCharacterIdentityData()
	{
		return new GCharacterIdentityData();
	}
	
	@Override
	public CharacterUseData createCharacterUseData()
	{
		return new GCharacterUseData();
	}
	
	@Override
	public CharacterSaveData createCharacterSaveData()
	{
		return new GCharacterSaveData();
	}
	
	@Override
	public GameLoginData createGameLoginData()
	{
		return new GGameLoginData();
	}
	
	//--逻辑组--//
	
	@Override
	public SceneTriggerExecutor createSceneTriggerExecutor()
	{
		return new GSceneTriggerExecutor();
	}
}
