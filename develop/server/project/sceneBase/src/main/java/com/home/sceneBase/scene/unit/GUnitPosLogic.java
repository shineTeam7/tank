package com.home.sceneBase.scene.unit;

import com.home.base.data.scene.unit.GUnitPosData;
import com.home.commonBase.data.scene.base.DirData;
import com.home.commonSceneBase.scene.unit.BUnitPosLogic;
import com.home.sceneBase.net.sceneBaseRequest.unit.UnitChangeShootDirRequest;

public class GUnitPosLogic extends BUnitPosLogic
{
	private GUnitPosData _gd;
	
	@Override
	public void init()
	{
		super.init();
		
		_gd=(GUnitPosData)_d;
	}
	
	@Override
	public void dispose()
	{
		super.dispose();
		
		_gd=null;
	}
	
	public void onChangeShootDir(DirData data)
	{
		if(data!=null)
		{
			if(_gd.shootDir==null)
				_gd.shootDir=data;
			else
				_gd.shootDir.copyDir(data);
		}
		else
		{
			_gd.shootDir=null;
		}
		
		_unit.radioMessage(UnitChangeShootDirRequest.create(_unit.instanceID,data),false);
	}
}
