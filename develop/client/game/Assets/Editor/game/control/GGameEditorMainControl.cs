using System;
using ShineEngine;
using UnityEditor;
using UnityEngine;

/// <summary>
///
/// </summary>
public class GGameEditorMainControl:GameEditorMainControl
{
	public override void showSceneEditorWindow()
	{
		EditorWindow.GetWindowWithRect<GSceneEditorWindow>(new Rect(0,0,400,300),true,"场景编辑器",true).show();
	}
}