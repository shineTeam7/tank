package com.home.scene.scene.scene;

import com.home.base.constlist.generate.GSceneType;
import com.home.base.constlist.generate.GUnitAICommandType;
import com.home.base.global.GGlobal;
import com.home.commonBase.config.game.RandomNameConfig;
import com.home.commonBase.constlist.generate.UnitAIModeType;
import com.home.commonBase.data.role.CharacterUseData;
import com.home.commonBase.data.role.RoleShowData;
import com.home.commonBase.data.scene.unit.UnitData;
import com.home.commonBase.scene.base.Unit;
import com.home.commonScene.logic.unit.SCharacterUseLogic;
import com.home.commonScene.part.ScenePlayer;
import com.home.commonScene.scene.scene.SSceneInoutLogic;

public class GSceneInoutLogic extends SSceneInoutLogic
{
	private boolean _initRobots=false;
	
	@Override
	protected void beforePlayerPreEnter(ScenePlayer player)
	{
		super.beforePlayerPreEnter(player);
		
		//客户端大乱斗,先注入数据
		if(_scene.getType()==GSceneType.MeleeSingle)
		{
			if(!_initRobots)
			{
				_initRobots=true;
				
				SCharacterUseLogic[] logics=new SCharacterUseLogic[GGlobal.meleePlayerNum];
				
				logics[0]=player.useLogic;
				
				for(int i=1;i<logics.length;++i)
				{
					//单位信息数据
					logics[i]=createUseLogicForRobot(player);
				}
				
				setSignedLogics(logics);
			}
		}
	}
	
	@Override
	protected void beforePlayerEnter(ScenePlayer player)
	{
		super.beforePlayerEnter(player);
		
		//单人战斗
		if(_scene.getType()==GSceneType.MeleeSingle)
		{
			//指定进入角色构造
			long[] signedPlayers=_sScene.sInOut.getSignedPlayerIDList();
			
			if(signedPlayers!=null)
			{
				for(long v:signedPlayers)
				{
					//不是自己(有其他角色就自行创建)
					if(v!=player.playerID)
					{
						UnitData unitData=_sScene.sInOut.createCharacterDataForRobot(v);
						
						//添加
						Unit unit=_scene.toAddUnit(unitData);
						//不必现在给自己推,待会跟EnterSceneRequest一起
						_scene.toActiveUnit(unit,false);
						
						unit.ai.setAIMode(UnitAIModeType.Base);
						unit.aiCommand.doLoopCommand(GUnitAICommandType.Chaos);
					}
				}
			}
		}
	}
	
	@Override
	public SCharacterUseLogic createUseLogicForRobot(ScenePlayer player)
	{
		SCharacterUseLogic logic=new SCharacterUseLogic();
		CharacterUseData uData=player.createCharacterUseDataBySaveData(1,1);
		//不绑定
		player.initUseLogicByUseData(logic,uData,false);
		
		long playerID=getRobotPlayerID();
		
		RoleShowData roleShowData=player.createRoleShowData();
		roleShowData.playerID=playerID;
		
		//第一组
		roleShowData.name=RandomNameConfig.randomName(1);
		
		logic.setSignedRoleShowData(roleShowData);
		
		logic.setBelongPlayerID(playerID);
		//logic.setControlPlayer(player);
		
		return logic;
	}
}
