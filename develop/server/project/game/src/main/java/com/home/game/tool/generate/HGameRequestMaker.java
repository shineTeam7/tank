package com.home.game.tool.generate;
import com.home.game.constlist.generate.HGameRequestType;
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
