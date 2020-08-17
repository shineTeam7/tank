package com.home.game.logic.union;

import com.home.base.constlist.generate.GFunctionType;
import com.home.base.constlist.generate.GRoleGroupChangeType;
import com.home.base.data.social.union.GUnionData;
import com.home.base.data.social.union.GUnionSimpleData;
import com.home.commonBase.constlist.generate.FunctionType;
import com.home.commonBase.data.social.roleGroup.RoleGroupChangeData;
import com.home.commonBase.data.social.roleGroup.RoleGroupSimpleData;
import com.home.commonBase.data.social.union.UnionSimpleData;
import com.home.commonGame.global.GameC;
import com.home.commonGame.logic.union.Union;
import com.home.commonGame.tool.func.IGameRankTool;
import com.home.commonGame.tool.func.RoleGroupRankTool;

/** g层工会 */
public class GUnion extends Union
{
	@Override
	public void construct()
	{
		super.construct();
		
	}
	
	/** 创建公会简版数据 */
	@Override
	protected RoleGroupSimpleData toCreateRoleGroupSimpleData()
	{
		return new GUnionSimpleData();
	}
	
	@Override
	protected void onChangeData(RoleGroupChangeData data)
	{
		super.onChangeData(data);
		
		
	}
	
	
}
