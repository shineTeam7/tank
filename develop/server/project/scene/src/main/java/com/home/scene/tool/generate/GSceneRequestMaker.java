package com.home.scene.tool.generate;
import com.home.scene.constlist.generate.GSceneRequestType;
import com.home.shine.tool.CreateDataFunc;
import com.home.shine.tool.DataMaker;

/** (generated by shine) */
public class GSceneRequestMaker extends DataMaker
{
	public GSceneRequestMaker()
	{
		offSet=GSceneRequestType.off;
		list=new CreateDataFunc[GSceneRequestType.count-offSet];
	}
	
}