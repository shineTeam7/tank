package com.home.sceneBase.tool.generate;
import com.home.sceneBase.constlist.generate.GSceneBaseResponseType;
import com.home.sceneBase.net.sceneBaseResponse.unit.CUnitChangeShootDirResponse;
import com.home.shine.data.BaseData;
import com.home.shine.tool.CreateDataFunc;
import com.home.shine.tool.DataMaker;

/** (generated by shine) */
public class GSceneBaseResponseMaker extends DataMaker
{
	public GSceneBaseResponseMaker()
	{
		offSet=GSceneBaseResponseType.off;
		list=new CreateDataFunc[GSceneBaseResponseType.count-offSet];
		list[GSceneBaseResponseType.CUnitChangeShootDir-offSet]=this::createCUnitChangeShootDirResponse;
	}
	
	private BaseData createCUnitChangeShootDirResponse()
	{
		return new CUnitChangeShootDirResponse();
	}
	
}