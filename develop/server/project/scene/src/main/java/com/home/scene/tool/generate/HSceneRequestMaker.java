package com.home.scene.tool.generate;
import com.home.scene.constlist.generate.HSceneRequestType;
import com.home.shine.tool.CreateDataFunc;
import com.home.shine.tool.DataMaker;

/** (generated by shine) */
public class HSceneRequestMaker extends DataMaker
{
	public HSceneRequestMaker()
	{
		offSet=HSceneRequestType.off;
		list=new CreateDataFunc[HSceneRequestType.count-offSet];
	}
	
}
