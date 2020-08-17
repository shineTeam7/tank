using ShineEngine;

public class GConfigControl:ConfigControl
{
	protected override int getGameConfigVersion()
	{
		return GCodeCheckRecord.configVersion;
	}

	public override void refreshConfig()
	{
		base.refreshConfig();

		GTextEnum.readConfig();
	}
}
