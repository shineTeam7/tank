package com.home.gameData.message.sceneBase.request.unit;

import com.home.commonData.data.scene.base.DirDO;
import com.home.commonData.message.sceneBase.request.base.UnitSMO;
import com.home.shineData.support.MaybeNull;

public class UnitChangeShootDirMO extends UnitSMO
{
	/** 朝向 */
	@MaybeNull
	DirDO dir;
}
