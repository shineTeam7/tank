package com.home.center.tool.generate;
import com.home.center.constlist.generate.HCenterResponseType;
import com.home.shine.tool.CreateDataFunc;
import com.home.shine.tool.DataMaker;

/** (generated by shine) */
public class HCenterResponseMaker extends DataMaker
{
	public HCenterResponseMaker()
	{
		offSet=HCenterResponseType.off;
		list=new CreateDataFunc[HCenterResponseType.count-offSet];
	}
	
}
