package com.home.client.tool.generate;
import com.home.client.constlist.generate.HGameRequestType;
import com.home.shine.tool.CreateDataFunc;
import com.home.shine.tool.DataMaker;

/** (generated by shine) */
public class HGameRequestMaker extends DataMaker
{
	public HGameRequestMaker()
	{
		offSet=HGameRequestType.off;
		list=new CreateDataFunc[HGameRequestType.count-offSet];
	}
	
}
