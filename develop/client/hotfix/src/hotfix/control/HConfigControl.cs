using System;
using ShineEngine;

/// <summary>
///
/// </summary>
public class HConfigControl:GConfigControl
{
	public override int getMsgDataVersion()
	{
		return HCodeCheckRecord.msgDataVersion;
	}

	protected override int getHotfixConfigVersion()
	{
		return HCodeCheckRecord.configVersion;
	}

	public override void refreshConfig()
	{
		base.refreshConfig();

		HTextEnum.readConfig();
	}
}