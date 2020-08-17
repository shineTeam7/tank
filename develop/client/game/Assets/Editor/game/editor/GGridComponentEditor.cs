using System;
using ShineEngine;
using UnityEditor;

/// <summary>
/// 
/// </summary>
[CustomEditor(typeof(GGridComponent))]
public class GGridComponentEditor:Editor
{
	private GGridComponent _component;

	private SerializedProperty _type;

	private int _typeValue;
	private void OnEnable()
	{
		if(this.target==null)
			return;

		_component=(GGridComponent)target;

		_type=serializedObject.FindProperty("type");
	}

	public override void OnInspectorGUI()
	{
		EditorGUI.BeginChangeCheck();

		base.OnInspectorGUI();

		if(EditorGUI.EndChangeCheck())
		{
			_component.onChanged();
		}
	}
}