package com.home.base.tool.generate;
import com.home.base.constlist.generate.GGameGlobalPartDataType;
import com.home.base.part.gameGlobal.data.GGameFuncPartData;
import com.home.base.part.gameGlobal.data.GGameTeamPartData;
import com.home.base.part.gameGlobal.data.GGameUnionPartData;
import com.home.shine.data.BaseData;
import com.home.shine.tool.CreateDataFunc;
import com.home.shine.tool.DataMaker;

/** (generated by shine) */
public class GGameGlobalPartDataMaker extends DataMaker
{
	public GGameGlobalPartDataMaker()
	{
		offSet=GGameGlobalPartDataType.off;
		list=new CreateDataFunc[GGameGlobalPartDataType.count-offSet];
		list[GGameGlobalPartDataType.GGameFunc-offSet]=this::createGGameFuncPartData;
		list[GGameGlobalPartDataType.GGameUnion-offSet]=this::createGGameUnionPartData;
		list[GGameGlobalPartDataType.GGameTeam-offSet]=this::createGGameTeamPartData;
	}
	
	private BaseData createGGameFuncPartData()
	{
		return new GGameFuncPartData();
	}
	
	private BaseData createGGameUnionPartData()
	{
		return new GGameUnionPartData();
	}
	
	private BaseData createGGameTeamPartData()
	{
		return new GGameTeamPartData();
	}
	
}
