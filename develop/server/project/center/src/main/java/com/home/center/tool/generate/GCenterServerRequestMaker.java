package com.home.center.tool.generate;
import com.home.base.constlist.generate.GServerMessageType;
import com.home.shine.tool.CreateDataFunc;
import com.home.shine.tool.DataMaker;

/** (generated by shine) */
public class GCenterServerRequestMaker extends DataMaker
{
	public GCenterServerRequestMaker()
	{
		offSet=GServerMessageType.off;
		list=new CreateDataFunc[GServerMessageType.count-offSet];
	}
	
}