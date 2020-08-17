package com.home.client.control;

import com.home.client.part.hPlayer.HPlayer;
import com.home.client.scene.scene.GScene;
import com.home.commonClient.control.ClientFactoryControl;
import com.home.commonClient.control.SceneControl;
import com.home.commonClient.part.player.Player;
import com.home.commonClient.scene.base.GameScene;

public class GClientFactoryControl extends ClientFactoryControl
{
	@Override
	public GClientMainControl createMainControl()
	{
		return new GClientMainControl();
	}
	
	@Override
	public GClientBehaviourControl createBehaviourControl()
	{
		return new GClientBehaviourControl();
	}
	
	@Override
	public SceneControl createSceneControl()
	{
		return new GSceneControl();
	}
	
	//--逻辑组--//
	
	/** 创建角色 */
	public Player createPlayer()
	{
		return new HPlayer();
	}
	
	/** 创建场景 */
	public GameScene createScene()
	{
		return new GScene();
	}
}
