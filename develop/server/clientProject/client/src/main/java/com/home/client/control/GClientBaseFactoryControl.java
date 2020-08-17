package com.home.client.control;

import com.home.base.control.GBaseFactoryControl;
import com.home.client.scene.unit.GUnit;
import com.home.commonBase.scene.base.Unit;
import com.home.commonClient.scene.base.GameUnit;

public class GClientBaseFactoryControl extends GBaseFactoryControl
{
	/** 单位 */
	public Unit createUnit()
	{
		return new GUnit();
	}
}
