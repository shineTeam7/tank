package com.home.gameData.player.list;

import com.home.commonData.player.server.PetSPO;
import com.home.gameData.player.server.GBagSPO;
import com.home.gameData.player.server.GCharacterSPO;
import com.home.gameData.player.server.GFriendSPO;
import com.home.gameData.player.server.GFuncSPO;
import com.home.gameData.player.server.GRoleSPO;
import com.home.gameData.player.server.GSceneSPO;
import com.home.gameData.player.server.GTeamSPO;
import com.home.gameData.player.server.GUnionSPO;

/** 玩家数据主体 */
public class GPlayerLO
{
	/** 功能 */
	GFuncSPO func;
	/** 角色 */
	GRoleSPO role;
	/** 场景 */
	GSceneSPO scene;
	/** 角色 */
	GCharacterSPO character;
	/** 背包 */
	GBagSPO bag;
	/** 好友 */
	GFriendSPO friend;
	/** 工会 */
	GUnionSPO union;
	/** 组队 */
	GTeamSPO team;
}
