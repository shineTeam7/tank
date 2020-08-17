package com.home.game.control;

import com.home.base.constlist.generate.GEquipSlotType;
import com.home.base.constlist.generate.GFunctionType;
import com.home.commonBase.constlist.generate.AuctionQueryConditionType;
import com.home.commonBase.constlist.generate.CallWayType;
import com.home.commonBase.constlist.generate.ClientPlatformType;
import com.home.commonBase.constlist.generate.CurrencyType;
import com.home.commonBase.constlist.generate.EquipSlotType;
import com.home.commonBase.constlist.generate.FunctionType;
import com.home.commonBase.constlist.generate.MapMoveType;
import com.home.commonBase.constlist.generate.PlatformType;
import com.home.commonBase.constlist.generate.RoleGroupHandleResultType;
import com.home.commonBase.constlist.generate.SkillInfluenceType;
import com.home.commonBase.data.item.ItemData;
import com.home.commonBase.data.item.auction.AuctionBuyItemData;
import com.home.commonBase.data.item.auction.AuctionQueryConditionData;
import com.home.commonBase.data.item.auction.IntAuctionQueryConditionData;
import com.home.commonBase.data.scene.base.PosData;
import com.home.commonBase.data.scene.base.SkillData;
import com.home.commonBase.data.scene.fight.SkillTargetData;
import com.home.commonBase.data.social.team.CreateTeamData;
import com.home.commonBase.data.social.union.CreateUnionData;
import com.home.commonBase.global.BaseC;
import com.home.commonBase.scene.base.Unit;
import com.home.commonBase.tool.func.BaseItemContainerTool;
import com.home.commonBase.tool.func.ItemContainerTool;
import com.home.commonBase.utils.BaseGameUtils;
import com.home.commonGame.control.ClientGMControl;
import com.home.commonGame.global.GameC;
import com.home.commonGame.scene.base.GameScene;
import com.home.game.logic.union.GPlayerUnion;
import com.home.game.logic.union.GUnion;
import com.home.game.part.player.GPlayer;
import com.home.shine.control.DateControl;
import com.home.shine.ctrl.Ctrl;
import com.home.shine.support.collection.IntIntMap;
import com.home.shine.support.collection.inter.IIntIntConsumer;
import com.home.shine.utils.MathUtils;
import com.home.shine.utils.StringUtils;
import com.home.shine.utils.TimeUtils;

/** 游戏GM控制 */
public class GClientGMControl extends ClientGMControl
{
	@Override
	public void init()
	{
		super.init();
		
		registOne(this::test,"测试代码","test","ts","z");
	}
	
	private interface GFuncCall
	{
		void call(GPlayer me,int[] ints,String[] strs);
	}
	
	private interface GFuncCall2
	{
		void call(GPlayer me,int[] ints);
	}
	
	/** 注册一个 */
	private void registOne(GFuncCall func,String describe,String... cmds)
	{
		super.registOne((a,b,c)->{func.call((GPlayer)a,b,c);},describe,cmds);
	}
	
	/** 注册一个 */
	private void registOne(GFuncCall2 func,String describe,String... cmds)
	{
		super.registOne((a,b)->{func.call((GPlayer)a,b);},describe,cmds);
	}
	
	
	//--方法组--//
	
	/** 测试代码 */
	private void test(GPlayer me,int[] ints)
	{
		switch(ints[0])
		{
			case 1:
			{
				me.scene.applyEnterScene(901);
			}
				break;
			case 2:
			{
				PosData pos=new PosData();
				pos.x=100;
				pos.y=0;
				pos.z=100;
				boolean re=me.scene.getScene().pos.isPosEnabled(MapMoveType.Land,pos);
				
				Ctrl.print(re);
			}
				break;
			case 3:
			{
				me.scene.applyLeaveScene();
			}
				break;
		}
	}
}
