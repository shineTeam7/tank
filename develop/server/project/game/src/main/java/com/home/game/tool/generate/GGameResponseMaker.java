package com.home.game.tool.generate;
import com.home.game.constlist.generate.GGameResponseType;
import com.home.shine.data.BaseData;
import com.home.shine.tool.CreateDataFunc;
import com.home.shine.tool.DataMaker;

/** (generated by shine) */
public class GGameResponseMaker extends DataMaker
{
	public GGameResponseMaker()
	{
		offSet=GGameResponseType.off;
		list=new CreateDataFunc[GGameResponseType.count-offSet];
	}
	
}
