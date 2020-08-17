package com.home.base.tool.generate;
import com.home.base.constlist.generate.GCenterGlobalPartDataType;
import com.home.base.part.centerGlobal.data.GCenterFuncPartData;
import com.home.base.part.centerGlobal.data.GCenterUnionPartData;
import com.home.shine.data.BaseData;
import com.home.shine.tool.CreateDataFunc;
import com.home.shine.tool.DataMaker;

/** (generated by shine) */
public class GCenterGlobalPartDataMaker extends DataMaker
{
	public GCenterGlobalPartDataMaker()
	{
		offSet=GCenterGlobalPartDataType.off;
		list=new CreateDataFunc[GCenterGlobalPartDataType.count-offSet];
		list[GCenterGlobalPartDataType.GCenterUnion-offSet]=this::createGCenterUnionPartData;
		list[GCenterGlobalPartDataType.GCenterFunc-offSet]=this::createGCenterFuncPartData;
	}
	
	private BaseData createGCenterUnionPartData()
	{
		return new GCenterUnionPartData();
	}
	
	private BaseData createGCenterFuncPartData()
	{
		return new GCenterFuncPartData();
	}
	
}