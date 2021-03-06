package com.home.base.tool.generate;
import com.home.base.constlist.generate.GPlayerPartClientDataType;
import com.home.base.part.player.clientData.GBagClientPartData;
import com.home.base.part.player.clientData.GCharacterClientPartData;
import com.home.base.part.player.clientData.GFriendClientPartData;
import com.home.base.part.player.clientData.GFuncClientPartData;
import com.home.base.part.player.clientData.GRoleClientPartData;
import com.home.base.part.player.clientData.GSceneClientPartData;
import com.home.base.part.player.clientData.GTeamClientPartData;
import com.home.base.part.player.clientData.GUnionClientPartData;
import com.home.shine.data.BaseData;
import com.home.shine.tool.CreateDataFunc;
import com.home.shine.tool.DataMaker;

/** (generated by shine) */
public class GPlayerPartClientDataMaker extends DataMaker
{
	public GPlayerPartClientDataMaker()
	{
		offSet=GPlayerPartClientDataType.off;
		list=new CreateDataFunc[GPlayerPartClientDataType.count-offSet];
		list[GPlayerPartClientDataType.GBag-offSet]=this::createGBagClientPartData;
		list[GPlayerPartClientDataType.GCharacter-offSet]=this::createGCharacterClientPartData;
		list[GPlayerPartClientDataType.GRole-offSet]=this::createGRoleClientPartData;
		list[GPlayerPartClientDataType.GUnion-offSet]=this::createGUnionClientPartData;
		list[GPlayerPartClientDataType.GFriend-offSet]=this::createGFriendClientPartData;
		list[GPlayerPartClientDataType.GFunc-offSet]=this::createGFuncClientPartData;
		list[GPlayerPartClientDataType.GTeam-offSet]=this::createGTeamClientPartData;
		list[GPlayerPartClientDataType.GScene-offSet]=this::createGSceneClientPartData;
	}
	
	private BaseData createGBagClientPartData()
	{
		return new GBagClientPartData();
	}
	
	private BaseData createGCharacterClientPartData()
	{
		return new GCharacterClientPartData();
	}
	
	private BaseData createGRoleClientPartData()
	{
		return new GRoleClientPartData();
	}
	
	private BaseData createGUnionClientPartData()
	{
		return new GUnionClientPartData();
	}
	
	private BaseData createGFuncClientPartData()
	{
		return new GFuncClientPartData();
	}
	
	private BaseData createGFriendClientPartData()
	{
		return new GFriendClientPartData();
	}
	
	private BaseData createGTeamClientPartData()
	{
		return new GTeamClientPartData();
	}
	
	private BaseData createGSceneClientPartData()
	{
		return new GSceneClientPartData();
	}
	
}
