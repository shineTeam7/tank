package com.home.scene.tool.generate;
import com.home.base.constlist.generate.GServerMessageType;
import com.home.shine.tool.CreateDataFunc;
import com.home.shine.tool.DataMaker;

/** (generated by shine) */
public class GSceneServerResponseMaker extends DataMaker
{
	public GSceneServerResponseMaker()
	{
		offSet=GServerMessageType.off;
		list=new CreateDataFunc[GServerMessageType.count-offSet];
	}
	
}
