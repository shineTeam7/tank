package com.home.client.tool.generate;
import com.home.client.constlist.generate.GCenterRequestType;
import com.home.shine.tool.CreateDataFunc;
import com.home.shine.tool.DataMaker;

/** (generated by shine) */
public class GCenterRequestMaker extends DataMaker
{
	public GCenterRequestMaker()
	{
		offSet=GCenterRequestType.off;
		list=new CreateDataFunc[GCenterRequestType.count-offSet];
	}
	
}
