package com.home.game.logic.union;

import com.home.base.data.social.union.GUnionSimpleData;
import com.home.commonBase.data.social.roleGroup.RoleGroupSimpleData;
import com.home.commonGame.logic.union.PlayerUnion;

public class GPlayerUnion extends PlayerUnion
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
}
