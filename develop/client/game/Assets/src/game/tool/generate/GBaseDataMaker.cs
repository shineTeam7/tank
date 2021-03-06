using ShineEngine;
using System;

/// <summary>
///     (generated by shine)
/// </summary>
public class GBaseDataMaker:DataMaker
{
	public GBaseDataMaker()
	{
		offSet=GBaseDataType.off;
		list=new Func<BaseData>[GBaseDataType.count-offSet];
		list[GBaseDataType.GCharacterIdentity-offSet]=createGCharacterIdentityData;
		list[GBaseDataType.GCharacterSave-offSet]=createGCharacterSaveData;
		list[GBaseDataType.GCharacterUse-offSet]=createGCharacterUseData;
		list[GBaseDataType.GRoleShow-offSet]=createGRoleShowData;
		list[GBaseDataType.GUnion-offSet]=createGUnionData;
		list[GBaseDataType.GUnionSimple-offSet]=createGUnionSimpleData;
		list[GBaseDataType.GUnitPos-offSet]=createGUnitPosData;
	}
	
	private BaseData createGCharacterIdentityData()
	{
		return new GCharacterIdentityData();
	}
	
	private BaseData createGRoleShowData()
	{
		return new GRoleShowData();
	}
	
	private BaseData createGCharacterSaveData()
	{
		return new GCharacterSaveData();
	}
	
	private BaseData createGCharacterUseData()
	{
		return new GCharacterUseData();
	}
	
	private BaseData createGUnionData()
	{
		return new GUnionData();
	}
	
	private BaseData createGUnionSimpleData()
	{
		return new GUnionSimpleData();
	}
	
	private BaseData createGUnitPosData()
	{
		return new GUnitPosData();
	}
	
}
