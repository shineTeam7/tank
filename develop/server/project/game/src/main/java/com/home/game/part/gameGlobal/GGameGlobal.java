package com.home.game.part.gameGlobal;
import com.home.base.part.gameGlobal.data.GGameFuncPartData;
import com.home.base.part.gameGlobal.data.GGameTeamPartData;
import com.home.base.part.gameGlobal.data.GGameUnionPartData;
import com.home.base.part.gameGlobal.list.GGameGlobalListData;
import com.home.commonBase.part.gameGlobal.data.GameActivityPartData;
import com.home.commonBase.part.gameGlobal.data.GameFuncPartData;
import com.home.commonBase.part.gameGlobal.data.GameMailPartData;
import com.home.commonBase.part.gameGlobal.data.GameSocialPartData;
import com.home.commonBase.part.gameGlobal.data.GameSystemPartData;
import com.home.commonBase.part.gameGlobal.list.GameGlobalListData;
import com.home.commonGame.part.gameGlobal.GameGlobal;
import com.home.commonGame.part.gameGlobal.base.GameGlobalBasePart;
import com.home.commonGame.part.gameGlobal.part.GameActivityPart;
import com.home.commonGame.part.gameGlobal.part.GameFuncPart;
import com.home.commonGame.part.gameGlobal.part.GameMailPart;
import com.home.commonGame.part.gameGlobal.part.GameSocialPart;
import com.home.commonGame.part.gameGlobal.part.GameSystemPart;
import com.home.game.part.gameGlobal.part.GGameFuncPart;
import com.home.game.part.gameGlobal.part.GGameTeamPart;
import com.home.game.part.gameGlobal.part.GGameUnionPart;

/** (generated by shine) */
public class GGameGlobal extends GameGlobal
{
	public GGameFuncPart gfunc;
	
	public GGameUnionPart gunion;
	
	public GGameTeamPart gteam;
	
	/** 注册部件 */
	@Override
	protected void registParts()
	{
		_list=new GameGlobalBasePart[7];
		int i=0;
		
		system=new GameSystemPart();
		system.setMe(this);
		_list[i++]=system;
		
		social=new GameSocialPart();
		social.setMe(this);
		_list[i++]=social;
		
		gfunc=new GGameFuncPart();
		func=gfunc;
		gfunc.setMe(this);
		_list[i++]=gfunc;
		
		activity=new GameActivityPart();
		activity.setMe(this);
		_list[i++]=activity;
		
		mail=new GameMailPart();
		mail.setMe(this);
		_list[i++]=mail;
		
		gunion=new GGameUnionPart();
		union=gunion;
		gunion.setMe(this);
		_list[i++]=gunion;
		
		gteam=new GGameTeamPart();
		team=gteam;
		gteam.setMe(this);
		_list[i++]=gteam;
		
	}
	
	/** 创建列表数据 */
	@Override
	public GameGlobalListData createListData()
	{
		return new GGameGlobalListData();
	}
	
	/** 从列表数据读取 */
	@Override
	public void readListData(GameGlobalListData listData)
	{
		GGameGlobalListData mData=(GGameGlobalListData)listData;
		
		this.system.setData(mData.system);
		this.social.setData(mData.social);
		this.gfunc.setData(mData.gfunc);
		this.activity.setData(mData.activity);
		this.mail.setData(mData.mail);
		this.gunion.setData(mData.gunion);
		this.gteam.setData(mData.gteam);
	}
	
	/** 写列表数据(深拷) */
	@Override
	public void writeListData(GameGlobalListData listData)
	{
		GGameGlobalListData mData=(GGameGlobalListData)listData;
		
		mData.system=(GameSystemPartData)this.system.makePartData();
		mData.social=(GameSocialPartData)this.social.makePartData();
		mData.gfunc=(GGameFuncPartData)this.gfunc.makePartData();
		mData.activity=(GameActivityPartData)this.activity.makePartData();
		mData.mail=(GameMailPartData)this.mail.makePartData();
		mData.gunion=(GGameUnionPartData)this.gunion.makePartData();
		mData.gteam=(GGameTeamPartData)this.gteam.makePartData();
	}
	
	/** 写列表数据(潜拷) */
	@Override
	public void writeShadowListData(GameGlobalListData listData)
	{
		GGameGlobalListData mData=(GGameGlobalListData)listData;
		
		mData.system=(GameSystemPartData)this.system.makeShadowPartData();
		mData.social=(GameSocialPartData)this.social.makeShadowPartData();
		mData.gfunc=(GGameFuncPartData)this.gfunc.makeShadowPartData();
		mData.activity=(GameActivityPartData)this.activity.makeShadowPartData();
		mData.mail=(GameMailPartData)this.mail.makeShadowPartData();
		mData.gunion=(GGameUnionPartData)this.gunion.makeShadowPartData();
		mData.gteam=(GGameTeamPartData)this.gteam.makeShadowPartData();
	}
	
}
