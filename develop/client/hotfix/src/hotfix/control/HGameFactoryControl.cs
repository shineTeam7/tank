using System;
using ShineEngine;

/// <summary>
///
/// </summary>
public class HGameFactoryControl:GGameFactoryControl
{
	public override GameDataRegister createDataRegister()
	{
		return new HGameDataRegister();
	}

	public override ConfigControl createConfigControl()
	{
		return new HConfigControl();
	}

	public override GameServer createGameServer()
	{
		return new HGameServer();
	}

	public override SceneServer createSceneServer()
	{
		return new HSceneServer();
	}

	public override Player createPlayer()
	{
		return new HPlayer();
	}

	public override ConfigReadData createConfigReadData()
	{
		return new HConfigReadData();
	}

	public override GlobalReadData createGlobalReadData()
	{
		return new HGlobalReadData();
	}

	public override GameMainControl createGameMainControl()
	{
		return new HGameMainControl();
	}

	public override GameUIControl createGameUIControl()
	{
		return new HGameUIControl();
	}
}