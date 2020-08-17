using System;
using ShineEngine;

/// <summary>
///
/// </summary>
public class GGameEditorFactoryControl:GameEditorFactoryControl
{
	public override MainApp createMainApp()
	{
		return new GMainApp();
	}

	public override GameEditorMainControl createMainControl()
	{
		return new GGameEditorMainControl();
	}
}