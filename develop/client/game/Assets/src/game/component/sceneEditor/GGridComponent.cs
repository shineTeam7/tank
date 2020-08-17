using System;
using ShineEngine;
using Unity.Collections;
using UnityEngine;

/// <summary>
///
/// </summary>
public class GGridComponent:MonoBehaviour
{
	[ShineEngine.ReadOnly]
	public int x;
	[ShineEngine.ReadOnly]
	public int z;
	/** 类型 */
	public int type;

	private Action<GGridComponent> _changeFunc;

	public void setChangeFunc(Action<GGridComponent> func)
	{
		_changeFunc=func;
	}

	public void onChanged()
	{
		if(_changeFunc!=null)
			_changeFunc(this);
	}
}