package com.home.sceneBase.scene.scene;

import com.home.base.data.scene.unit.GUnitPosData;
import com.home.commonBase.data.scene.unit.UnitData;
import com.home.commonBase.data.scene.unit.UnitNormalData;
import com.home.commonBase.scene.scene.SceneUnitFactoryLogic;

public class GSceneUnitFactoryLogic extends SceneUnitFactoryLogic
{
	@Override
	public void initBaseUnitData(UnitData data)
	{
		(data.pos=new GUnitPosData()).initDefault();
		(data.normal=new UnitNormalData()).initDefault();
	}
}
