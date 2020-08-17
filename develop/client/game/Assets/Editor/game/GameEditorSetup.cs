using System;
using ShineEngine;
using UnityEditor;

/// <summary>
///
/// </summary>
[InitializeOnLoad]
public class GameEditorSetup
{
	static GameEditorSetup()
	{
		#if(UNITY_EDITOR)
		{
			init();
		}
		#endif
	}

	private static void init()
	{
		EditorC.factory=new GGameEditorFactoryControl();
		EditorC.main=EditorC.factory.createMainControl();
		EditorC.main.init();
	}
}