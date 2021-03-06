package com.home.sceneBase.tool.generate;
import com.home.sceneBase.constlist.generate.GSceneBaseRequestType;
import com.home.sceneBase.net.sceneBaseRequest.unit.UnitChangeShootDirRequest;
import com.home.shine.data.BaseData;
import com.home.shine.tool.CreateDataFunc;
import com.home.shine.tool.DataMaker;

/** (generated by shine) */
public class GSceneBaseRequestMaker extends DataMaker
{
	public GSceneBaseRequestMaker()
	{
		offSet=GSceneBaseRequestType.off;
		list=new CreateDataFunc[GSceneBaseRequestType.count-offSet];
		list[GSceneBaseRequestType.UnitChangeShootDir-offSet]=this::createUnitChangeShootDirRequest;
	}
	
	private BaseData createUnitChangeShootDirRequest()
	{
		return new UnitChangeShootDirRequest();
	}
	
}
