package com.home.base.part.hPlayer.list;
import com.home.base.constlist.generate.HPlayerListDataType;
import com.home.base.part.player.data.GBagPartData;
import com.home.base.part.player.data.GCharacterPartData;
import com.home.base.part.player.data.GFriendPartData;
import com.home.base.part.player.data.GFuncPartData;
import com.home.base.part.player.data.GRolePartData;
import com.home.base.part.player.data.GScenePartData;
import com.home.base.part.player.data.GTeamPartData;
import com.home.base.part.player.data.GUnionPartData;
import com.home.base.part.player.list.GPlayerListData;
import com.home.commonBase.part.player.data.ActivityPartData;
import com.home.commonBase.part.player.data.FriendPartData;
import com.home.commonBase.part.player.data.GuidePartData;
import com.home.commonBase.part.player.data.MailPartData;
import com.home.commonBase.part.player.data.PetPartData;
import com.home.commonBase.part.player.data.QuestPartData;
import com.home.commonBase.part.player.data.ScenePartData;
import com.home.commonBase.part.player.data.SocialPartData;
import com.home.commonBase.part.player.data.SystemPartData;
import com.home.shine.bytes.BytesReadStream;
import com.home.shine.bytes.BytesWriteStream;
import com.home.shine.data.BaseData;
import com.home.shine.support.DataWriter;
import com.home.shine.support.pool.DataPool;

/** 热更角色数据(generated by shine) */
public class HPlayerListData extends GPlayerListData
{
	/** 数据类型ID */
	public static final int dataID=HPlayerListDataType.HPlayer;
	
	public HPlayerListData()
	{
		_dataID=HPlayerListDataType.HPlayer;
	}
	
	/** 获取数据类名 */
	@Override
	public String getDataClassName()
	{
		return "HPlayerListData";
	}
	
	/** 读取字节流(完整版) */
	@Override
	protected void toReadBytesFull(BytesReadStream stream)
	{
		stream.startReadObj();
		
		BaseData systemT=stream.readDataFullNotNull();
		if(systemT!=null)
		{
			if(systemT instanceof SystemPartData)
			{
				this.system=(SystemPartData)systemT;
			}
			else
			{
				this.system=new SystemPartData();
				if(!(systemT.getClass().isAssignableFrom(SystemPartData.class)))
				{
					stream.throwTypeReadError(SystemPartData.class,systemT.getClass());
				}
				this.system.shadowCopy(systemT);
			}
		}
		else
		{
			this.system=null;
		}
		
		BaseData gfuncT=stream.readDataFullNotNull();
		if(gfuncT!=null)
		{
			if(gfuncT instanceof GFuncPartData)
			{
				this.gfunc=(GFuncPartData)gfuncT;
			}
			else
			{
				this.gfunc=new GFuncPartData();
				if(!(gfuncT.getClass().isAssignableFrom(GFuncPartData.class)))
				{
					stream.throwTypeReadError(GFuncPartData.class,gfuncT.getClass());
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
			if(activityT instanceof ActivityPartData)
			{
				this.activity=(ActivityPartData)activityT;
			}
			else
			{
				this.activity=new ActivityPartData();
				if(!(activityT.getClass().isAssignableFrom(ActivityPartData.class)))
				{
					stream.throwTypeReadError(ActivityPartData.class,activityT.getClass());
				}
				this.activity.shadowCopy(activityT);
			}
		}
		else
		{
			this.activity=null;
		}
		
		BaseData groleT=stream.readDataFullNotNull();
		if(groleT!=null)
		{
			if(groleT instanceof GRolePartData)
			{
				this.grole=(GRolePartData)groleT;
			}
			else
			{
				this.grole=new GRolePartData();
				if(!(groleT.getClass().isAssignableFrom(GRolePartData.class)))
				{
					stream.throwTypeReadError(GRolePartData.class,groleT.getClass());
				}
				this.grole.shadowCopy(groleT);
			}
		}
		else
		{
			this.grole=null;
		}
		
		BaseData gsceneT=stream.readDataFullNotNull();
		if(gsceneT!=null)
		{
			if(gsceneT instanceof GScenePartData)
			{
				this.gscene=(GScenePartData)gsceneT;
			}
			else
			{
				this.gscene=new GScenePartData();
				if(!(gsceneT.getClass().isAssignableFrom(GScenePartData.class)))
				{
					stream.throwTypeReadError(GScenePartData.class,gsceneT.getClass());
				}
				this.gscene.shadowCopy(gsceneT);
			}
		}
		else
		{
			this.gscene=null;
		}
		
		BaseData gcharacterT=stream.readDataFullNotNull();
		if(gcharacterT!=null)
		{
			if(gcharacterT instanceof GCharacterPartData)
			{
				this.gcharacter=(GCharacterPartData)gcharacterT;
			}
			else
			{
				this.gcharacter=new GCharacterPartData();
				if(!(gcharacterT.getClass().isAssignableFrom(GCharacterPartData.class)))
				{
					stream.throwTypeReadError(GCharacterPartData.class,gcharacterT.getClass());
				}
				this.gcharacter.shadowCopy(gcharacterT);
			}
		}
		else
		{
			this.gcharacter=null;
		}
		
		BaseData socialT=stream.readDataFullNotNull();
		if(socialT!=null)
		{
			if(socialT instanceof SocialPartData)
			{
				this.social=(SocialPartData)socialT;
			}
			else
			{
				this.social=new SocialPartData();
				if(!(socialT.getClass().isAssignableFrom(SocialPartData.class)))
				{
					stream.throwTypeReadError(SocialPartData.class,socialT.getClass());
				}
				this.social.shadowCopy(socialT);
			}
		}
		else
		{
			this.social=null;
		}
		
		BaseData gbagT=stream.readDataFullNotNull();
		if(gbagT!=null)
		{
			if(gbagT instanceof GBagPartData)
			{
				this.gbag=(GBagPartData)gbagT;
			}
			else
			{
				this.gbag=new GBagPartData();
				if(!(gbagT.getClass().isAssignableFrom(GBagPartData.class)))
				{
					stream.throwTypeReadError(GBagPartData.class,gbagT.getClass());
				}
				this.gbag.shadowCopy(gbagT);
			}
		}
		else
		{
			this.gbag=null;
		}
		
		BaseData mailT=stream.readDataFullNotNull();
		if(mailT!=null)
		{
			if(mailT instanceof MailPartData)
			{
				this.mail=(MailPartData)mailT;
			}
			else
			{
				this.mail=new MailPartData();
				if(!(mailT.getClass().isAssignableFrom(MailPartData.class)))
				{
					stream.throwTypeReadError(MailPartData.class,mailT.getClass());
				}
				this.mail.shadowCopy(mailT);
			}
		}
		else
		{
			this.mail=null;
		}
		
		BaseData questT=stream.readDataFullNotNull();
		if(questT!=null)
		{
			if(questT instanceof QuestPartData)
			{
				this.quest=(QuestPartData)questT;
			}
			else
			{
				this.quest=new QuestPartData();
				if(!(questT.getClass().isAssignableFrom(QuestPartData.class)))
				{
					stream.throwTypeReadError(QuestPartData.class,questT.getClass());
				}
				this.quest.shadowCopy(questT);
			}
		}
		else
		{
			this.quest=null;
		}
		
		BaseData guideT=stream.readDataFullNotNull();
		if(guideT!=null)
		{
			if(guideT instanceof GuidePartData)
			{
				this.guide=(GuidePartData)guideT;
			}
			else
			{
				this.guide=new GuidePartData();
				if(!(guideT.getClass().isAssignableFrom(GuidePartData.class)))
				{
					stream.throwTypeReadError(GuidePartData.class,guideT.getClass());
				}
				this.guide.shadowCopy(guideT);
			}
		}
		else
		{
			this.guide=null;
		}
		
		BaseData gfriendT=stream.readDataFullNotNull();
		if(gfriendT!=null)
		{
			if(gfriendT instanceof GFriendPartData)
			{
				this.gfriend=(GFriendPartData)gfriendT;
			}
			else
			{
				this.gfriend=new GFriendPartData();
				if(!(gfriendT.getClass().isAssignableFrom(GFriendPartData.class)))
				{
					stream.throwTypeReadError(GFriendPartData.class,gfriendT.getClass());
				}
				this.gfriend.shadowCopy(gfriendT);
			}
		}
		else
		{
			this.gfriend=null;
		}
		
		BaseData gunionT=stream.readDataFullNotNull();
		if(gunionT!=null)
		{
			if(gunionT instanceof GUnionPartData)
			{
				this.gunion=(GUnionPartData)gunionT;
			}
			else
			{
				this.gunion=new GUnionPartData();
				if(!(gunionT.getClass().isAssignableFrom(GUnionPartData.class)))
				{
					stream.throwTypeReadError(GUnionPartData.class,gunionT.getClass());
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
			if(gteamT instanceof GTeamPartData)
			{
				this.gteam=(GTeamPartData)gteamT;
			}
			else
			{
				this.gteam=new GTeamPartData();
				if(!(gteamT.getClass().isAssignableFrom(GTeamPartData.class)))
				{
					stream.throwTypeReadError(GTeamPartData.class,gteamT.getClass());
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
		
		if(this.grole!=null)
		{
			stream.writeDataFullNotNull(this.grole);
		}
		else
		{
			nullObjError("grole");
		}
		
		if(this.gscene!=null)
		{
			stream.writeDataFullNotNull(this.gscene);
		}
		else
		{
			nullObjError("gscene");
		}
		
		if(this.gcharacter!=null)
		{
			stream.writeDataFullNotNull(this.gcharacter);
		}
		else
		{
			nullObjError("gcharacter");
		}
		
		if(this.social!=null)
		{
			stream.writeDataFullNotNull(this.social);
		}
		else
		{
			nullObjError("social");
		}
		
		if(this.gbag!=null)
		{
			stream.writeDataFullNotNull(this.gbag);
		}
		else
		{
			nullObjError("gbag");
		}
		
		if(this.mail!=null)
		{
			stream.writeDataFullNotNull(this.mail);
		}
		else
		{
			nullObjError("mail");
		}
		
		if(this.quest!=null)
		{
			stream.writeDataFullNotNull(this.quest);
		}
		else
		{
			nullObjError("quest");
		}
		
		if(this.guide!=null)
		{
			stream.writeDataFullNotNull(this.guide);
		}
		else
		{
			nullObjError("guide");
		}
		
		if(this.gfriend!=null)
		{
			stream.writeDataFullNotNull(this.gfriend);
		}
		else
		{
			nullObjError("gfriend");
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
		this.system=(SystemPartData)stream.readDataSimpleNotNull();
		
		this.gfunc=(GFuncPartData)stream.readDataSimpleNotNull();
		
		this.activity=(ActivityPartData)stream.readDataSimpleNotNull();
		
		this.grole=(GRolePartData)stream.readDataSimpleNotNull();
		
		this.gscene=(GScenePartData)stream.readDataSimpleNotNull();
		
		this.gcharacter=(GCharacterPartData)stream.readDataSimpleNotNull();
		
		this.social=(SocialPartData)stream.readDataSimpleNotNull();
		
		this.gbag=(GBagPartData)stream.readDataSimpleNotNull();
		
		this.mail=(MailPartData)stream.readDataSimpleNotNull();
		
		this.quest=(QuestPartData)stream.readDataSimpleNotNull();
		
		this.guide=(GuidePartData)stream.readDataSimpleNotNull();
		
		this.gfriend=(GFriendPartData)stream.readDataSimpleNotNull();
		
		this.gunion=(GUnionPartData)stream.readDataSimpleNotNull();
		
		this.gteam=(GTeamPartData)stream.readDataSimpleNotNull();
		
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
		
		if(this.grole!=null)
		{
			stream.writeDataSimpleNotNull(this.grole);
		}
		else
		{
			nullObjError("grole");
		}
		
		if(this.gscene!=null)
		{
			stream.writeDataSimpleNotNull(this.gscene);
		}
		else
		{
			nullObjError("gscene");
		}
		
		if(this.gcharacter!=null)
		{
			stream.writeDataSimpleNotNull(this.gcharacter);
		}
		else
		{
			nullObjError("gcharacter");
		}
		
		if(this.social!=null)
		{
			stream.writeDataSimpleNotNull(this.social);
		}
		else
		{
			nullObjError("social");
		}
		
		if(this.gbag!=null)
		{
			stream.writeDataSimpleNotNull(this.gbag);
		}
		else
		{
			nullObjError("gbag");
		}
		
		if(this.mail!=null)
		{
			stream.writeDataSimpleNotNull(this.mail);
		}
		else
		{
			nullObjError("mail");
		}
		
		if(this.quest!=null)
		{
			stream.writeDataSimpleNotNull(this.quest);
		}
		else
		{
			nullObjError("quest");
		}
		
		if(this.guide!=null)
		{
			stream.writeDataSimpleNotNull(this.guide);
		}
		else
		{
			nullObjError("guide");
		}
		
		if(this.gfriend!=null)
		{
			stream.writeDataSimpleNotNull(this.gfriend);
		}
		else
		{
			nullObjError("gfriend");
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
		if(!(data instanceof HPlayerListData))
			return;
		
		HPlayerListData mData=(HPlayerListData)data;
		
		this.system=mData.system;
		this.gfunc=mData.gfunc;
		this.activity=mData.activity;
		this.grole=mData.grole;
		this.gscene=mData.gscene;
		this.gcharacter=mData.gcharacter;
		this.social=mData.social;
		this.gbag=mData.gbag;
		this.mail=mData.mail;
		this.quest=mData.quest;
		this.guide=mData.guide;
		this.gfriend=mData.gfriend;
		this.gunion=mData.gunion;
		this.gteam=mData.gteam;
	}
	
	/** 复制(深拷贝) */
	@Override
	protected void toCopy(BaseData data)
	{
		if(!(data instanceof HPlayerListData))
			return;
		
		HPlayerListData mData=(HPlayerListData)data;
		
		if(mData.system!=null)
		{
			this.system=(SystemPartData)mData.system.clone();
		}
		else
		{
			this.system=null;
			nullObjError("system");
		}
		
		if(mData.gfunc!=null)
		{
			this.gfunc=(GFuncPartData)mData.gfunc.clone();
		}
		else
		{
			this.gfunc=null;
			nullObjError("gfunc");
		}
		
		if(mData.activity!=null)
		{
			this.activity=(ActivityPartData)mData.activity.clone();
		}
		else
		{
			this.activity=null;
			nullObjError("activity");
		}
		
		if(mData.grole!=null)
		{
			this.grole=(GRolePartData)mData.grole.clone();
		}
		else
		{
			this.grole=null;
			nullObjError("grole");
		}
		
		if(mData.gscene!=null)
		{
			this.gscene=(GScenePartData)mData.gscene.clone();
		}
		else
		{
			this.gscene=null;
			nullObjError("gscene");
		}
		
		if(mData.gcharacter!=null)
		{
			this.gcharacter=(GCharacterPartData)mData.gcharacter.clone();
		}
		else
		{
			this.gcharacter=null;
			nullObjError("gcharacter");
		}
		
		if(mData.social!=null)
		{
			this.social=(SocialPartData)mData.social.clone();
		}
		else
		{
			this.social=null;
			nullObjError("social");
		}
		
		if(mData.gbag!=null)
		{
			this.gbag=(GBagPartData)mData.gbag.clone();
		}
		else
		{
			this.gbag=null;
			nullObjError("gbag");
		}
		
		if(mData.mail!=null)
		{
			this.mail=(MailPartData)mData.mail.clone();
		}
		else
		{
			this.mail=null;
			nullObjError("mail");
		}
		
		if(mData.quest!=null)
		{
			this.quest=(QuestPartData)mData.quest.clone();
		}
		else
		{
			this.quest=null;
			nullObjError("quest");
		}
		
		if(mData.guide!=null)
		{
			this.guide=(GuidePartData)mData.guide.clone();
		}
		else
		{
			this.guide=null;
			nullObjError("guide");
		}
		
		if(mData.gfriend!=null)
		{
			this.gfriend=(GFriendPartData)mData.gfriend.clone();
		}
		else
		{
			this.gfriend=null;
			nullObjError("gfriend");
		}
		
		if(mData.gunion!=null)
		{
			this.gunion=(GUnionPartData)mData.gunion.clone();
		}
		else
		{
			this.gunion=null;
			nullObjError("gunion");
		}
		
		if(mData.gteam!=null)
		{
			this.gteam=(GTeamPartData)mData.gteam.clone();
		}
		else
		{
			this.gteam=null;
			nullObjError("gteam");
		}
		
	}
	
	/** 是否数据一致 */
	@Override
	protected boolean toDataEquals(BaseData data)
	{
		HPlayerListData mData=(HPlayerListData)data;
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
		
		if(mData.grole!=null)
		{
			if(this.grole==null)
				return false;
			if(!this.grole.dataEquals(mData.grole))
				return false;
		}
		else
		{
			if(this.grole!=null)
				return false;
		}
		
		if(mData.gscene!=null)
		{
			if(this.gscene==null)
				return false;
			if(!this.gscene.dataEquals(mData.gscene))
				return false;
		}
		else
		{
			if(this.gscene!=null)
				return false;
		}
		
		if(mData.gcharacter!=null)
		{
			if(this.gcharacter==null)
				return false;
			if(!this.gcharacter.dataEquals(mData.gcharacter))
				return false;
		}
		else
		{
			if(this.gcharacter!=null)
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
		
		if(mData.gbag!=null)
		{
			if(this.gbag==null)
				return false;
			if(!this.gbag.dataEquals(mData.gbag))
				return false;
		}
		else
		{
			if(this.gbag!=null)
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
		
		if(mData.quest!=null)
		{
			if(this.quest==null)
				return false;
			if(!this.quest.dataEquals(mData.quest))
				return false;
		}
		else
		{
			if(this.quest!=null)
				return false;
		}
		
		if(mData.guide!=null)
		{
			if(this.guide==null)
				return false;
			if(!this.guide.dataEquals(mData.guide))
				return false;
		}
		else
		{
			if(this.guide!=null)
				return false;
		}
		
		if(mData.gfriend!=null)
		{
			if(this.gfriend==null)
				return false;
			if(!this.gfriend.dataEquals(mData.gfriend))
				return false;
		}
		else
		{
			if(this.gfriend!=null)
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
			writer.sb.append("SystemPartData=null");
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
			writer.sb.append("GFuncPartData=null");
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
			writer.sb.append("ActivityPartData=null");
		}
		
		writer.writeEnter();
		writer.writeTabs();
		writer.sb.append("grole");
		writer.sb.append(':');
		if(this.grole!=null)
		{
			this.grole.writeDataString(writer);
		}
		else
		{
			writer.sb.append("GRolePartData=null");
		}
		
		writer.writeEnter();
		writer.writeTabs();
		writer.sb.append("gscene");
		writer.sb.append(':');
		if(this.gscene!=null)
		{
			this.gscene.writeDataString(writer);
		}
		else
		{
			writer.sb.append("GScenePartData=null");
		}
		
		writer.writeEnter();
		writer.writeTabs();
		writer.sb.append("gcharacter");
		writer.sb.append(':');
		if(this.gcharacter!=null)
		{
			this.gcharacter.writeDataString(writer);
		}
		else
		{
			writer.sb.append("GCharacterPartData=null");
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
			writer.sb.append("SocialPartData=null");
		}
		
		writer.writeEnter();
		writer.writeTabs();
		writer.sb.append("gbag");
		writer.sb.append(':');
		if(this.gbag!=null)
		{
			this.gbag.writeDataString(writer);
		}
		else
		{
			writer.sb.append("GBagPartData=null");
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
			writer.sb.append("MailPartData=null");
		}
		
		writer.writeEnter();
		writer.writeTabs();
		writer.sb.append("quest");
		writer.sb.append(':');
		if(this.quest!=null)
		{
			this.quest.writeDataString(writer);
		}
		else
		{
			writer.sb.append("QuestPartData=null");
		}
		
		writer.writeEnter();
		writer.writeTabs();
		writer.sb.append("guide");
		writer.sb.append(':');
		if(this.guide!=null)
		{
			this.guide.writeDataString(writer);
		}
		else
		{
			writer.sb.append("GuidePartData=null");
		}
		
		writer.writeEnter();
		writer.writeTabs();
		writer.sb.append("gfriend");
		writer.sb.append(':');
		if(this.gfriend!=null)
		{
			this.gfriend.writeDataString(writer);
		}
		else
		{
			writer.sb.append("GFriendPartData=null");
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
			writer.sb.append("GUnionPartData=null");
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
			writer.sb.append("GTeamPartData=null");
		}
		
		writer.writeEnter();
	}
	
	/** 初始化列表数据 */
	@Override
	public void initListData()
	{
		system=new SystemPartData();
		gfunc=new GFuncPartData();
		func=gfunc;
		activity=new ActivityPartData();
		grole=new GRolePartData();
		role=grole;
		gscene=new GScenePartData();
		scene=gscene;
		gcharacter=new GCharacterPartData();
		character=gcharacter;
		social=new SocialPartData();
		gbag=new GBagPartData();
		bag=gbag;
		mail=new MailPartData();
		quest=new QuestPartData();
		guide=new GuidePartData();
		gfriend=new GFriendPartData();
		friend=gfriend;
		gunion=new GUnionPartData();
		union=gunion;
		gteam=new GTeamPartData();
		team=gteam;
	}
	
	/** 回池 */
	@Override
	protected void toRelease(DataPool pool)
	{
		this.system=null;
		this.gfunc=null;
		this.activity=null;
		this.grole=null;
		this.gscene=null;
		this.gcharacter=null;
		this.social=null;
		this.gbag=null;
		this.mail=null;
		this.quest=null;
		this.guide=null;
		this.gfriend=null;
		this.gunion=null;
		this.gteam=null;
	}
	
}
