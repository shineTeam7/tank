package com.home.client.control;

import com.home.base.constlist.generate.GFunctionType;
import com.home.base.constlist.generate.GRobotTestModeType;
import com.home.client.part.player.GPlayer;
import com.home.commonClient.control.ClientBehaviourControl;
import com.home.commonClient.global.ClientGlobal;
import com.home.commonClient.net.request.func.match.FuncApplyMatchRequest;
import com.home.commonClient.part.player.Player;

/** 行为控制 */
public class GClientBehaviourControl extends ClientBehaviourControl
{
	@Override
	public void onStart(Player player)
	{
		super.onStart(player);
		
		GPlayer gme=(GPlayer)player;
		
		switch(ClientGlobal.mode)
		{
			case GRobotTestModeType.TestGM:
			{
				//player.sendGM("test 1");
				//
				//player.getExecutor().getTimeDriver().setTimeOut(()->
				//{
				//	player.sendGM("test 2");
				//
				//	player.getExecutor().getTimeDriver().setTimeOut(()->
				//	{
				//		player.send(FuncGetPageShowRequest.create(GFunctionType.UnionScore,0));
				//
				//	},1000);
				//
				//},1000);
			}
				break;
			case GRobotTestModeType.TestMelee:
			{
				//player.sendGM("asp 100");
				//
				//不在场景中
				if(player.scene.getScene()==null)
				{
					player.send(FuncApplyMatchRequest.create(GFunctionType.Melee));
				}
			}
				break;
		}
	}
}
