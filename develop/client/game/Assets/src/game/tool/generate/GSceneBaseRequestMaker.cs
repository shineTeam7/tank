using ShineEngine;
using System;

/// <summary>
/// (generated by shine)
/// </summary>
public class GSceneBaseRequestMaker:DataMaker
{
	public GSceneBaseRequestMaker()
	{
		offSet=GSceneBaseRequestType.off;
		list=new Func<BaseData>[GSceneBaseRequestType.count-offSet];
		list[GSceneBaseRequestType.CUnitChangeShootDir-offSet]=createCUnitChangeShootDirRequest;
	}
	
	private BaseData createCUnitChangeShootDirRequest()
	{
		return new CUnitChangeShootDirRequest();
	}
	
}
