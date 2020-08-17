package com.home.gameData.data.scene.unit;

import com.home.commonData.data.scene.base.DirDO;
import com.home.commonData.data.scene.unit.UnitPosDO;
import com.home.shineData.support.MaybeNull;

/** g单位位置数据 */
public class GUnitPosDO extends UnitPosDO
{
	/** 射击朝向 */
	@MaybeNull
	DirDO shootDir;
}
