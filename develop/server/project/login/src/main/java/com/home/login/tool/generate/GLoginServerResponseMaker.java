package com.home.login.tool.generate;
import com.home.base.constlist.generate.GServerMessageType;
import com.home.shine.tool.CreateDataFunc;
import com.home.shine.tool.DataMaker;

/** (generated by shine) */
public class GLoginServerResponseMaker extends DataMaker
{
	public GLoginServerResponseMaker()
	{
		offSet=GServerMessageType.off;
		list=new CreateDataFunc[GServerMessageType.count-offSet];
	}
	
}
