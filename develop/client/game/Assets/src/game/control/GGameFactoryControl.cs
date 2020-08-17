using System;
using ShineEngine;

/// <summary>
/// 游戏工厂控制
/// </summary>
public class GGameFactoryControl:GameFactoryControl
{
	public override GameDataRegister createDataRegister()
	{
		return new GGameDataRegister();
	}

	public override ConfigControl createConfigControl()
	{
		return new GConfigControl();
	}

	public override GameServer createGameServer()
	{
		return new GGameServer();
	}

	public override SceneServer createSceneServer()
	{
		return new GSceneServer();
	}

	public override Player createPlayer()
	{
		return new GPlayer();
	}

	public override SceneControl createSceneControl()
	{
		return new GSceneControl();
	}

	public override InfoControl createInfoControl()
	{
		return new GInfoControl();
	}

	public override KeyboardControl createKeyboardControl()
	{
		return new GKeyboardControl();
	}

	public override TriggerControl createTriggerControl()
	{
		return new GTriggerControl();
	}

	public override ConfigReadData createConfigReadData()
	{
		return new GConfigReadData();
	}

	public override GlobalReadData createGlobalReadData()
	{
		return new GGlobalReadData();
	}

	public override RoleShowData createRoleShowData()
	{
		return new GRoleShowData();
	}

	public override CharacterIdentityData createCharacterIdentityData()
	{
		return new GCharacterIdentityData();
	}

	public override CharacterUseData createCharacterUseData()
	{
		return new GCharacterUseData();
	}

	public override Scene createScene()
	{
		return new GScene();
	}

	public override Unit createUnit()
	{
		return new GUnit();
	}

	public override Bullet createBullet()
	{
		return new GBullet();
	}

	public override UnitEffect createUnitEffect()
	{
		return new GUnitEffect();
	}

	public override CharacterUseLogic createCharacterUseLogic()
	{
		return new CharacterUseLogic();
	}

	public override BagPart createBagPart()
	{
		return new GBagPart();
	}

	public override BulletPosLogic createBulletPosLogic()
	{
		return new GBulletPosLogic();
	}

	public override BulletShowLogic createBulletShowLogic()
	{
		return new GBulletShowLogic();
	}

	public override CharacterIdentityLogic createCharacterIdentityLogic()
	{
		return new GCharacterIdentityLogic();
	}

	public override CharacterPart createCharacterPart()
	{
		return new GCharacterPart();
	}

	public override CharacterSaveData createCharacterSaveData()
	{
		return new GCharacterSaveData();
	}

	public override GameApp createGameApp()
	{
		return new GGameApp();
	}

	public override GameDataRegister createGameDataRegister()
	{
		return new GGameDataRegister();
	}

	public override RolePart createRolePart()
	{
		return new GRolePart();
	}

	public override SceneCameraLogic createSceneCameraLogic()
	{
		return new GSceneCameraLogic();
	}

	public override SceneFightLogic createSceneFightLogic()
	{
		return new GSceneFightLogic();
	}

	public override SceneLoadLogic createSceneLoadLogic()
	{
		return new GSceneLoadLogic();
	}

	public override ScenePosLogic createScenePosLogic()
	{
		return new GScenePosLogic();
	}

	public override SceneShowLogic createSceneShowLogic()
	{
		return new GSceneShowLogic();
	}

	public override UnitAvatarLogic createUnitAvatarLogic()
	{
		return new GUnitAvatarLogic();
	}

	public override UnitFightLogic createUnitFightLogic()
	{
		return new GUnitFightLogic();
	}

	public override UnitHeadLogic createUnitHeadLogic()
	{
		return new GUnitHeadLogic();
	}

	public override UnitPosLogic createUnitPosLogic()
	{
		return new GUnitPosLogic();
	}

	public override UnitShowLogic createUnitShowLogic()
	{
		return new GUnitShowLogic();
	}
}
