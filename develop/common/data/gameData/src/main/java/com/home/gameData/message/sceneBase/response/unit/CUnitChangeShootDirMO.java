package com.home.gameData.message.sceneBase.response.unit;

import com.home.commonData.data.scene.base.DirDO;
import com.home.commonData.message.sceneBase.response.base.CUnitRMO;
import com.home.shineData.support.MaybeNull;

/** 控制单位改变设计朝向消息 */
public class CUnitChangeShootDirMO extends CUnitRMO
{
	/** 朝向 */
	@MaybeNull
	DirDO dir;
}
