package com.home.scene.tool.generate;
import com.home.scene.constlist.generate.HGameSceneResponseType;
import com.home.shine.tool.CreateDataFunc;
import com.home.shine.tool.DataMaker;

/** (generated by shine) */
public class HGameSceneResponseMaker extends DataMaker
{
	public HGameSceneResponseMaker()
	{
		offSet=HGameSceneResponseType.off;
		list=new CreateDataFunc[HGameSceneResponseType.count-offSet];
	}
	
}