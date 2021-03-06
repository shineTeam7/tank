using ShineEngine;
using System;

/// <summary>
/// (generated by shine)
/// </summary>
public class HPlayerListDataMaker:DataMaker
{
	public HPlayerListDataMaker()
	{
		offSet=HPlayerListDataType.off;
		list=new Func<BaseData>[HPlayerListDataType.count-offSet];
		list[HPlayerListDataType.HPlayer-offSet]=createHPlayerListData;
	}
	
	private BaseData createHPlayerListData()
	{
		return new HPlayerListData();
	}
	
}
