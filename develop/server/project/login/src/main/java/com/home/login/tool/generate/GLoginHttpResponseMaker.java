package com.home.login.tool.generate;
import com.home.login.constlist.generate.GLoginHttpResponseType;
import com.home.shine.tool.CreateDataFunc;
import com.home.shine.tool.DataMaker;

/** (generated by shine) */
public class GLoginHttpResponseMaker extends DataMaker
{
	public GLoginHttpResponseMaker()
	{
		offSet=GLoginHttpResponseType.off;
		list=new CreateDataFunc[GLoginHttpResponseType.count-offSet];
	}
	
}
