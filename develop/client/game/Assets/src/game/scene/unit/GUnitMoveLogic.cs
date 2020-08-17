using System;
using ShineEngine;

/// <summary>
///
/// </summary>
public class GUnitMoveLogic:UnitMoveLogic
{
	protected override void onDriveChanged()
	{
		base.onDriveChanged();

		// HGameUI.fight.setDrive(isOnVehicle());
	}
}