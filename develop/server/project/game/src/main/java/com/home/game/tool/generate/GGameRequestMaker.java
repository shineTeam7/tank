package com.home.game.tool.generate;
import com.home.game.constlist.generate.GGameRequestType;
import com.home.shine.data.BaseData;
import com.home.shine.tool.CreateDataFunc;
import com.home.shine.tool.DataMaker;

/** (generated by shine) */
public class GGameRequestMaker extends DataMaker
{
	public GGameRequestMaker()
	{
		offSet=GGameRequestType.off;
		list=new CreateDataFunc[GGameRequestType.count-offSet];
	}
	
}
