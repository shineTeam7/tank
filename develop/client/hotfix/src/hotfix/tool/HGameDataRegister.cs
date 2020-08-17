using System;
using ShineEngine;

/// <summary>
///
/// </summary>
public class HGameDataRegister:GGameDataRegister
{
	public override void regist()
	{
		base.regist();

		add(new HotfixDataMaker());

		add(new HPlayerPartDataMaker());
		add(new HPlayerListDataMaker());
	}
}