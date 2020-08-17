package com.home.game.logic.union;

import com.home.commonGame.logic.union.PlayerUnion;
import com.home.commonGame.logic.union.PlayerUnionTool;

public class GPlayerUnionTool extends PlayerUnionTool
{
	@Override
	protected PlayerUnion toCreatePlayerRoleGroup()
	{
		return new GPlayerUnion();
	}
}
