package com.home.sceneBase.tool.generate;
import com.home.sceneBase.constlist.generate.HSceneBaseRequestType;
import com.home.shine.tool.CreateDataFunc;
import com.home.shine.tool.DataMaker;

/** (generated by shine) */
public class HSceneBaseRequestMaker extends DataMaker
{
	public HSceneBaseRequestMaker()
	{
		offSet=HSceneBaseRequestType.off;
		list=new CreateDataFunc[HSceneBaseRequestType.count-offSet];
	}
	
}