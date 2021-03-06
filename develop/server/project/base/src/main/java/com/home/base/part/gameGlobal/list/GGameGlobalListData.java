package com.home.base.part.gameGlobal.list;
import com.home.base.constlist.generate.GGameGlobalListDataType;
import com.home.base.part.gameGlobal.data.GGameFuncPartData;
import com.home.base.part.gameGlobal.data.GGameTeamPartData;
import com.home.base.part.gameGlobal.data.GGameUnionPartData;
import com.home.commonBase.part.gameGlobal.data.GameActivityPartData;
import com.home.commonBase.part.gameGlobal.data.GameFuncPartData;
import com.home.commonBase.part.gameGlobal.data.GameMailPartData;
import com.home.commonBase.part.gameGlobal.data.GameSocialPartData;
import com.home.commonBase.part.gameGlobal.data.GameSystemPartData;
import com.home.commonBase.part.gameGlobal.list.GameGlobalListData;
import com.home.shine.bytes.BytesReadStream;
import com.home.shine.bytes.BytesWriteStream;
import com.home.shine.data.BaseData;
import com.home.shine.support.DataWriter;
import com.home.shine.support.pool.DataPool;

/** (generated by shine) */
public class GGameGlobalListData extends GameGlobalListData
{
	/** 数据类型ID */
	public static final int dataID=GGameGlobalListDataType.GGameGlobal;
	
	public GGameFuncPartData gfunc;
	
	public GGameUnionPartData gunion;
	
	public GGameTeamPartData gteam;
	
	public GGameGlobalListData()
	{
		_dataID=GGameGlobalListDataType.GGameGlobal;
	}
	
	/** 读取字节流(完整版) */
	@Override
	protected void toReadBytesFull(BytesReadStream stream)
	{
		stream.startReadObj();
		
		BaseData systemT=stream.readDataFullNotNull();
		if(systemT!=null)
		{
			if(systemT instanceof GameSystemPartData)
			{
				this.system=(GameSystemPartData)systemT;
			}
			else
			{
				this.system=new GameSystemPartData();
				if(!(systemT.getClass().isAssignableFrom(GameSystemPartData.class)))
				{
					stream.throwTypeReadError(GameSystemPartData.class,systemT.getClass());
				}
				this.system.shadowCopy(systemT);
			}
		}
		else
		{
			this.system=null;
		}
		
		BaseData socialT=stream.readDataFullNotNull();
		if(socialT!=null)
		{
			if(socialT instanceof GameSocialPartData)
			{
				this.social=(GameSocialPartData)socialT;
			}
			else
			{
				this.social=new GameSocialPartData();
				if(!(socialT.getClass().isAssignableFrom(GameSocialPartData.class)))
				{
					stream.throwTypeReadError(GameSocialPartData.class,socialT.getClass());
				}
				this.social.shadowCopy(socialT);
			}
		}
		else
		{
			this.social=null;
		}
		
		BaseData gfuncT=stream.readDataFullNotNull();
		if(gfuncT!=null)
		{
			if(gfuncT instanceof GGameFuncPartData)
			{
				this.gfunc=(GGameFuncPartData)gfuncT;
			}
			else
			{
				this.gfunc=new GGameFuncPartData();
				if(!(gfuncT.getClass().isAssignableFrom(GGameFuncPartData.class)))
				{
					stream.throwTypeReadError(GGameFuncPartData.class,gfuncT.getClass());
				}
				this.gfunc.shadowCopy(gfuncT);
			}
		}
		else
		{
			this.gfunc=null;
		}
		
		BaseData activityT=stream.readDataFullNotNull();
		if(activityT!=null)
		{
			if(activityT instanceof GameActivityPartData)
			{
				this.activity=(GameActivityPartData)activityT;
			}
			else
			{
				this.activity=new GameActivityPartData();
				if(!(activityT.getClass().isAssignableFrom(GameActivityPartData.class)))
				{
					stream.throwTypeReadError(GameActivityPartData.class,activityT.getClass());
				}
				this.activity.shadowCopy(activityT);
			}
		}
		else
		{
			this.activity=null;
		}
		
		BaseData mailT=stream.readDataFullNotNull();
		if(mailT!=null)
		{
			if(mailT instanceof GameMailPartData)
			{
				this.mail=(GameMailPartData)mailT;
			}
			else
			{
				this.mail=new GameMailPartData();
				if(!(mailT.getClass().isAssignableFrom(GameMailPartData.class)))
				{
					stream.throwTypeReadError(GameMailPartData.class,mailT.getClass());
				}
				this.mail.shadowCopy(mailT);
			}
		}
		else
		{
			this.mail=null;
		}
		
		BaseData gunionT=stream.readDataFullNotNull();
		if(gunionT!=null)
		{
			if(gunionT instanceof GGameUnionPartData)
			{
				this.gunion=(GGameUnionPartData)gunionT;
			}
			else
			{
				this.gunion=new GGameUnionPartData();
				if(!(gunionT.getClass().isAssignableFrom(GGameUnionPartData.class)))
				{
					stream.throwTypeReadError(GGameUnionPartData.class,gunionT.getClass());
				}
				this.gunion.shadowCopy(gunionT);
			}
		}
		else
		{
			this.gunion=null;
		}
		
		BaseData gteamT=stream.readDataFullNotNull();
		if(gteamT!=null)
		{
			if(gteamT instanceof GGameTeamPartData)
			{
				this.gteam=(GGameTeamPartData)gteamT;
			}
			else
			{
				this.gteam=new GGameTeamPartData();
				if(!(gteamT.getClass().isAssignableFrom(GGameTeamPartData.class)))
				{
					stream.throwTypeReadError(GGameTeamPartData.class,gteamT.getClass());
				}
				this.gteam.shadowCopy(gteamT);
			}
		}
		else
		{
			this.gteam=null;
		}
		
		stream.endReadObj();
	}
	
	/** 写入字节流(完整版) */
	@Override
	protected void toWriteBytesFull(BytesWriteStream stream)
	{
		stream.startWriteObj();
		
		if(this.system!=null)
		{
			stream.writeDataFullNotNull(this.system);
		}
		else
		{
			nullObjError("system");
		}
		
		if(this.social!=null)
		{
			stream.writeDataFullNotNull(this.social);
		}
		else
		{
			nullObjError("social");
		}
		
		if(this.gfunc!=null)
		{
			stream.writeDataFullNotNull(this.gfunc);
		}
		else
		{
			nullObjError("gfunc");
		}
		
		if(this.activity!=null)
		{
			stream.writeDataFullNotNull(this.activity);
		}
		else
		{
			nullObjError("activity");
		}
		
		if(this.mail!=null)
		{
			stream.writeDataFullNotNull(this.mail);
		}
		else
		{
			nullObjError("mail");
		}
		
		if(this.gunion!=null)
		{
			stream.writeDataFullNotNull(this.gunion);
		}
		else
		{
			nullObjError("gunion");
		}
		
		if(this.gteam!=null)
		{
			stream.writeDataFullNotNull(this.gteam);
		}
		else
		{
			nullObjError("gteam");
		}
		
		stream.endWriteObj();
	}
	
	/** 读取字节流(简版) */
	@Override
	protected void toReadBytesSimple(BytesReadStream stream)
	{
		this.system=(GameSystemPartData)stream.readDataSimpleNotNull();
		
		this.social=(GameSocialPartData)stream.readDataSimpleNotNull();
		
		this.gfunc=(GGameFuncPartData)stream.readDataSimpleNotNull();
		
		this.activity=(GameActivityPartData)stream.readDataSimpleNotNull();
		
		this.mail=(GameMailPartData)stream.readDataSimpleNotNull();
		
		this.gunion=(GGameUnionPartData)stream.readDataSimpleNotNull();
		
		this.gteam=(GGameTeamPartData)stream.readDataSimpleNotNull();
		
	}
	
	/** 写入字节流(简版) */
	@Override
	protected void toWriteBytesSimple(BytesWriteStream stream)
	{
		if(this.system!=null)
		{
			stream.writeDataSimpleNotNull(this.system);
		}
		else
		{
			nullObjError("system");
		}
		
		if(this.social!=null)
		{
			stream.writeDataSimpleNotNull(this.social);
		}
		else
		{
			nullObjError("social");
		}
		
		if(this.gfunc!=null)
		{
			stream.writeDataSimpleNotNull(this.gfunc);
		}
		else
		{
			nullObjError("gfunc");
		}
		
		if(this.activity!=null)
		{
			stream.writeDataSimpleNotNull(this.activity);
		}
		else
		{
			nullObjError("activity");
		}
		
		if(this.mail!=null)
		{
			stream.writeDataSimpleNotNull(this.mail);
		}
		else
		{
			nullObjError("mail");
		}
		
		if(this.gunion!=null)
		{
			stream.writeDataSimpleNotNull(this.gunion);
		}
		else
		{
			nullObjError("gunion");
		}
		
		if(this.gteam!=null)
		{
			stream.writeDataSimpleNotNull(this.gteam);
		}
		else
		{
			nullObjError("gteam");
		}
		
	}
	
	/** 复制(潜拷贝) */
	@Override
	protected void toShadowCopy(BaseData data)
	{
		if(!(data instanceof GGameGlobalListData))
			return;
		
		GGameGlobalListData mData=(GGameGlobalListData)data;
		
		this.system=mData.system;
		this.social=mData.social;
		this.gfunc=mData.gfunc;
		this.activity=mData.activity;
		this.mail=mData.mail;
		this.gunion=mData.gunion;
		this.gteam=mData.gteam;
	}
	
	/** 复制(深拷贝) */
	@Override
	protected void toCopy(BaseData data)
	{
		if(!(data instanceof GGameGlobalListData))
			return;
		
		GGameGlobalListData mData=(GGameGlobalListData)data;
		
		if(mData.system!=null)
		{
			this.system=(GameSystemPartData)mData.system.clone();
		}
		else
		{
			this.system=null;
			nullObjError("system");
		}
		
		if(mData.social!=null)
		{
			this.social=(GameSocialPartData)mData.social.clone();
		}
		else
		{
			this.social=null;
			nullObjError("social");
		}
		
		if(mData.gfunc!=null)
		{
			this.gfunc=(GGameFuncPartData)mData.gfunc.clone();
		}
		else
		{
			this.gfunc=null;
			nullObjError("gfunc");
		}
		
		if(mData.activity!=null)
		{
			this.activity=(GameActivityPartData)mData.activity.clone();
		}
		else
		{
			this.activity=null;
			nullObjError("activity");
		}
		
		if(mData.mail!=null)
		{
			this.mail=(GameMailPartData)mData.mail.clone();
		}
		else
		{
			this.mail=null;
			nullObjError("mail");
		}
		
		if(mData.gunion!=null)
		{
			this.gunion=(GGameUnionPartData)mData.gunion.clone();
		}
		else
		{
			this.gunion=null;
			nullObjError("gunion");
		}
		
		if(mData.gteam!=null)
		{
			this.gteam=(GGameTeamPartData)mData.gteam.clone();
		}
		else
		{
			this.gteam=null;
			nullObjError("gteam");
		}
		
	}
	
	/** 获取数据类名 */
	@Override
	public String getDataClassName()
	{
		return "GGameGlobalListData";
	}
	
	/** 是否数据一致 */
	@Override
	protected boolean toDataEquals(BaseData data)
	{
		GGameGlobalListData mData=(GGameGlobalListData)data;
		if(mData.system!=null)
		{
			if(this.system==null)
				return false;
			if(!this.system.dataEquals(mData.system))
				return false;
		}
		else
		{
			if(this.system!=null)
				return false;
		}
		
		if(mData.social!=null)
		{
			if(this.social==null)
				return false;
			if(!this.social.dataEquals(mData.social))
				return false;
		}
		else
		{
			if(this.social!=null)
				return false;
		}
		
		if(mData.gfunc!=null)
		{
			if(this.gfunc==null)
				return false;
			if(!this.gfunc.dataEquals(mData.gfunc))
				return false;
		}
		else
		{
			if(this.gfunc!=null)
				return false;
		}
		
		if(mData.activity!=null)
		{
			if(this.activity==null)
				return false;
			if(!this.activity.dataEquals(mData.activity))
				return false;
		}
		else
		{
			if(this.activity!=null)
				return false;
		}
		
		if(mData.mail!=null)
		{
			if(this.mail==null)
				return false;
			if(!this.mail.dataEquals(mData.mail))
				return false;
		}
		else
		{
			if(this.mail!=null)
				return false;
		}
		
		if(mData.gunion!=null)
		{
			if(this.gunion==null)
				return false;
			if(!this.gunion.dataEquals(mData.gunion))
				return false;
		}
		else
		{
			if(this.gunion!=null)
				return false;
		}
		
		if(mData.gteam!=null)
		{
			if(this.gteam==null)
				return false;
			if(!this.gteam.dataEquals(mData.gteam))
				return false;
		}
		else
		{
			if(this.gteam!=null)
				return false;
		}
		
		return true;
	}
	
	/** 转文本输出 */
	@Override
	protected void toWriteDataString(DataWriter writer)
	{
		writer.writeTabs();
		writer.sb.append("system");
		writer.sb.append(':');
		if(this.system!=null)
		{
			this.system.writeDataString(writer);
		}
		else
		{
			writer.sb.append("GameSystemPartData=null");
		}
		
		writer.writeEnter();
		writer.writeTabs();
		writer.sb.append("social");
		writer.sb.append(':');
		if(this.social!=null)
		{
			this.social.writeDataString(writer);
		}
		else
		{
			writer.sb.append("GameSocialPartData=null");
		}
		
		writer.writeEnter();
		writer.writeTabs();
		writer.sb.append("gfunc");
		writer.sb.append(':');
		if(this.gfunc!=null)
		{
			this.gfunc.writeDataString(writer);
		}
		else
		{
			writer.sb.append("GGameFuncPartData=null");
		}
		
		writer.writeEnter();
		writer.writeTabs();
		writer.sb.append("activity");
		writer.sb.append(':');
		if(this.activity!=null)
		{
			this.activity.writeDataString(writer);
		}
		else
		{
			writer.sb.append("GameActivityPartData=null");
		}
		
		writer.writeEnter();
		writer.writeTabs();
		writer.sb.append("mail");
		writer.sb.append(':');
		if(this.mail!=null)
		{
			this.mail.writeDataString(writer);
		}
		else
		{
			writer.sb.append("GameMailPartData=null");
		}
		
		writer.writeEnter();
		writer.writeTabs();
		writer.sb.append("gunion");
		writer.sb.append(':');
		if(this.gunion!=null)
		{
			this.gunion.writeDataString(writer);
		}
		else
		{
			writer.sb.append("GGameUnionPartData=null");
		}
		
		writer.writeEnter();
		writer.writeTabs();
		writer.sb.append("gteam");
		writer.sb.append(':');
		if(this.gteam!=null)
		{
			this.gteam.writeDataString(writer);
		}
		else
		{
			writer.sb.append("GGameTeamPartData=null");
		}
		
		writer.writeEnter();
	}
	
	/** 初始化列表数据 */
	@Override
	public void initListData()
	{
		system=new GameSystemPartData();
		social=new GameSocialPartData();
		gfunc=new GGameFuncPartData();
		func=gfunc;
		activity=new GameActivityPartData();
		mail=new GameMailPartData();
		gunion=new GGameUnionPartData();
		union=gunion;
		gteam=new GGameTeamPartData();
		team=gteam;
	}
	
	/** 回池 */
	@Override
	protected void toRelease(DataPool pool)
	{
		this.system=null;
		this.social=null;
		this.gfunc=null;
		this.activity=null;
		this.mail=null;
		this.gunion=null;
		this.gteam=null;
	}
	
}
