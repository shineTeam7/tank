using System;
using ShineEngine;

/// <summary>
/// 游戏单位状态类型
/// </summary>
public static class GUnitStateType
{
	/** 空闲 */
	public const int Idle=1;

	/** 移动 */
	public const int Move=2;

	/** 浮空上升 */
	public const int FloatUp=3;

	/** 浮空下落 */
	public const int FloatDown=4;

	/** 攻击 */
	public const int Attack=5;

	/** 浮空攻击  */
	public const int FloatAttack=6;

	/** 倒地 */
	public const int Lay=7;

	public static bool getIsGround(int state)
	{
		if(state==Idle || state==Move)
			return true;

		return false;
	}

	public static bool getIsFloat(int state)
	{
		if(state==FloatUp || state==FloatDown)
			return true;

		return false;
	}
}