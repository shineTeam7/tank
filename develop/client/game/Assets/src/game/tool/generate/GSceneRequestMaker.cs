using ShineEngine;
using System;

/// <summary>
/// (generated by shine)
/// </summary>
public class GSceneRequestMaker:DataMaker
{
	public GSceneRequestMaker()
	{
		offSet=GSceneRequestType.off;
		list=new Func<BaseData>[GSceneRequestType.count-offSet];
	}
	
}
