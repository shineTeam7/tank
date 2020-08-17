package com.home.game.control;

import com.home.commonBase.tool.DataRegister;
import com.home.commonGame.control.ClientGMControl;
import com.home.commonGame.control.GameFactoryControl;
import com.home.commonGame.control.GameMainControl;
import com.home.commonGame.control.SceneControl;
import com.home.commonGame.logic.union.PlayerUnionTool;
import com.home.commonGame.logic.union.UnionTool;
import com.home.commonGame.logic.unit.CharacterUseLogic;
import com.home.commonGame.part.gameGlobal.GameGlobal;
import com.home.commonGame.part.player.Player;
import com.home.commonGame.scene.base.GameScene;
import com.home.commonGame.server.GameServer;
import com.home.game.logic.GCharacterUseLogic;
import com.home.game.logic.union.GPlayerUnionTool;
import com.home.game.logic.union.GUnionTool;
import com.home.game.part.gameGlobal.GGameGlobal;
import com.home.game.part.hPlayer.HPlayer;
import com.home.game.scene.scene.GScene;
import com.home.game.server.GGameServer;

/** 游戏工厂类 */
public class GGameFactoryControl extends GameFactoryControl
{
	//--control组--//
	
	@Override
	public GameMainControl createMainControl()
	{
		return new GGameMainControl();
	}
	
	@Override
	public SceneControl createSceneControl()
	{
		return new GSceneControl();
	}
	
	@Override
	public GameServer createServer()
	{
		return new GGameServer();
	}
	
	@Override
	public GameGlobal createGlobal()
	{
		return new GGameGlobal();
	}
	
	@Override
	public ClientGMControl createClientGMControl()
	{
		return new GClientGMControl();
	}
	
	@Override
	public GPlayerWorkControl createPlayerWorkControl()
	{
		return new GPlayerWorkControl();
	}
	
	
	//--逻辑组--//
	
	@Override
	public Player createPlayer()
	{
		return new HPlayer();
	}
	
	@Override
	public GameScene createScene()
	{
		return new GScene();
	}
	
	@Override
	public CharacterUseLogic createCharacterUseLogic()
	{
		return new GCharacterUseLogic();
	}
	
	@Override
	public UnionTool createUnionTool()
	{
		return new GUnionTool();
	}
	
	@Override
	public PlayerUnionTool createPlayerUnionTool()
	{
		return new GPlayerUnionTool();
	}
}
