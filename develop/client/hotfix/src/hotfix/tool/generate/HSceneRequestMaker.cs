using ShineEngine;
using System;

/// <summary>
/// (generated by shine)
/// </summary>
public class HSceneRequestMaker:DataMaker
{
	public HSceneRequestMaker()
	{
		offSet=HSceneRequestType.off;
		list=new Func<BaseData>[HSceneRequestType.count-offSet];
	}
	
}
