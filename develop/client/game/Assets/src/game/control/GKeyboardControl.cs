using System;
using ShineEngine;
using UnityEngine;

/// <summary>
/// 游戏键盘控制
/// </summary>
public class GKeyboardControl:KeyboardControl
{
	private PosData _tempPos=new PosData();

	protected override void onKey(KeyCode code,bool isDown)
	{
		base.onKey(code,isDown);

		switch(code)
		{
			case KeyCode.J:
			{
				if(isDown)
				{
					// GameC.server.getSocket().closeTest();

					Unit hero=GameC.scene.getScene().hero;

					hero.fight.useSkill(1001,1);

					// Unit enemy=hero.fight.getNearestEnemy(10f);
					//
					// if(enemy!=null)
					// {
					// 	hero.ai.skillTo(1001,SkillTargetData.createByTargetUnit(enemy.instanceID));
					// }

					// ClientGMRequest.create("test 24").send();
				}
			}
				break;
			case KeyCode.U:
			{
				if(isDown)
				{
					Unit hero=GameC.scene.getScene().hero;
					//
					// Unit item=GameC.scene.getScene().pos.getNearestFieldItem(10f);
					//
					// if(item!=null)
					// {
					// 	hero.ai.pickUpItem(item.instanceID);
					// }

					GameC.scene.getScene().getUnitDic().forEachValue(v=>
					{
						if(v.type==UnitType.Vehicle)
						{
							CUnitGetOnVehicleRequest.create(hero.instanceID,v.instanceID,0).send();
						}
					});
				}
			}
				break;
			case KeyCode.I:
			{
				if(isDown)
				{
					Unit hero=GameC.scene.getScene().hero;

					CUnitGetOffVehicleRequest.create(hero.instanceID,hero.pos.getPos()).send();
				}
			}
				break;
			// case KeyCode.V:
			// {
			// 	if(SKeyboardControl.isCtrlDown() && isDown)
			// 	{
			// 		GameC.main.backToLogin();
			// 	}
			// }
			// 	break;
			// case KeyCode.I:
			// {
			// 	if(SKeyboardControl.isCtrlDown() && isDown)
			// 	{
			// 		GGameC.player.gbag.useItemByID(1002);
			// 	}
			// }
			// 	break;
			case KeyCode.X:
			{
				if(isDown)
				{

				}
			}
				break;
			case KeyCode.C:
			{
				if(isDown)
				{
					ClientGMRequest.create("test 26").send();
				}
			}
				break;
			case KeyCode.V:
			{
				if(isDown)
				{
					ClientGMRequest.create("test 27").send();
				}
			}
				break;
		}
	}
}