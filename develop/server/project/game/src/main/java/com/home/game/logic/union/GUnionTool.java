package com.home.game.logic.union;

import com.home.base.data.social.union.GUnionData;
import com.home.commonBase.data.social.roleGroup.CreateRoleGroupData;
import com.home.commonBase.data.social.roleGroup.RoleGroupData;
import com.home.commonBase.data.social.union.CreateUnionData;
import com.home.commonBase.data.social.union.UnionData;
import com.home.commonGame.logic.func.RoleGroup;
import com.home.commonGame.logic.union.Union;
import com.home.commonGame.logic.union.UnionTool;

public class GUnionTool extends UnionTool
{
	/** 创建玩家群(只创建) */
	protected Union toCreateRoleGroup()
	{
		return new GUnion();
	}
	
	/** 创建玩家群数据(只创建) */
	protected UnionData toCreateRoleGroupData()
	{
		return new GUnionData();
	}
	//
	///** 创建群创建数据 */
	//protected CreateUnionData toCreateCreateRoleGroupData()
	//{
	//	return new CreateUnionData();
	//}
}
