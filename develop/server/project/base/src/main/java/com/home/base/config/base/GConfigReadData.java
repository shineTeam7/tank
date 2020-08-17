package com.home.base.config.base;
import com.home.base.config.game.GFunctionConfig;
import com.home.base.config.game.GSceneConfig;
import com.home.base.constlist.generate.GActivityType;
import com.home.base.constlist.generate.GAttributeType;
import com.home.base.constlist.generate.GConfigType;
import com.home.base.constlist.generate.GEquipSlotType;
import com.home.base.constlist.generate.GFunctionType;
import com.home.base.constlist.generate.GItemEquipType;
import com.home.base.constlist.generate.GMapBlockType;
import com.home.base.constlist.generate.GRobotTestModeType;
import com.home.base.constlist.generate.GRoleGroupChangeType;
import com.home.base.constlist.generate.GRoleGroupTitleType;
import com.home.base.constlist.generate.GSceneType;
import com.home.base.constlist.generate.GTeamTargetType;
import com.home.base.constlist.generate.GUnitAICommandType;
import com.home.base.constlist.generate.GVocationType;
import com.home.base.global.GGlobal;
import com.home.base.global.GGlobalReadData;
import com.home.commonBase.config.base.ConfigReadData;
import com.home.commonBase.config.game.AttackLevelConfig;
import com.home.commonBase.config.game.FunctionConfig;
import com.home.commonBase.config.game.SceneConfig;
import com.home.commonBase.constlist.generate.ActivityType;
import com.home.commonBase.constlist.generate.AttributeType;
import com.home.commonBase.constlist.generate.ConfigType;
import com.home.commonBase.constlist.generate.EquipSlotType;
import com.home.commonBase.constlist.generate.FunctionType;
import com.home.commonBase.constlist.generate.ItemEquipType;
import com.home.commonBase.constlist.generate.MapBlockType;
import com.home.commonBase.constlist.generate.RobotTestModeType;
import com.home.commonBase.constlist.generate.RoleGroupChangeType;
import com.home.commonBase.constlist.generate.RoleGroupTitleType;
import com.home.commonBase.constlist.generate.SceneType;
import com.home.commonBase.constlist.generate.TeamTargetType;
import com.home.commonBase.constlist.generate.UnitAICommandType;
import com.home.commonBase.constlist.generate.VocationType;
import com.home.shine.bytes.BytesReadStream;
import com.home.shine.support.collection.IntObjectMap;
import com.home.shine.support.collection.LongObjectMap;

/** (generated by shine) */
public class GConfigReadData extends ConfigReadData
{
	/** 场景表字典 */
	public IntObjectMap<GSceneConfig> gsceneDic;
	
	/** 功能表字典 */
	public IntObjectMap<GFunctionConfig> gfunctionDic;
	
	/** 读取全局配置表 */
	@Override
	protected void readGlobal(BytesReadStream stream)
	{
		global=new GGlobalReadData();
		global.readBytesSimple(stream);
	}
	
	/** 设置值到Config上 */
	@Override
	public void setToConfigOne(int type)
	{
		super.setToConfigOne(type);
		
		switch(type)
		{
			case ConfigType.Global:
			{
				GGlobal.readFromData((GGlobalReadData)global);
				GGlobal.afterReadConfig();
			}
				break;
			case ConfigType.Function:
			{
				GFunctionConfig.setGDic(gfunctionDic);
			}
				break;
			case ConfigType.Scene:
			{
				GSceneConfig.setGDic(gsceneDic);
			}
				break;
		}
	}
	
	/** 读完所有配置 */
	@Override
	public void afterReadConfigAllOne(int type)
	{
		super.afterReadConfigAllOne(type);
		
		switch(type)
		{
			case ConfigType.Global:
			{
				GGlobal.afterReadConfigAll();
			}
				break;
			case ConfigType.Function:
			{
				GFunctionConfig.afterReadConfigAll();
			}
				break;
			case ConfigType.Scene:
			{
				GSceneConfig.afterReadConfigAll();
			}
				break;
		}
	}
	
	/** 构造常量size */
	@Override
	public void makeConstSize()
	{
		super.makeConstSize();
		
		ActivityType.size=GActivityType.size;
		AttributeType.size=GAttributeType.size;
		EquipSlotType.size=GEquipSlotType.size;
		FunctionType.size=GFunctionType.size;
		ItemEquipType.size=GItemEquipType.size;
		MapBlockType.size=GMapBlockType.size;
		RobotTestModeType.size=GRobotTestModeType.size;
		RoleGroupChangeType.size=GRoleGroupChangeType.size;
		RoleGroupTitleType.size=GRoleGroupTitleType.size;
		SceneType.size=GSceneType.size;
		TeamTargetType.size=GTeamTargetType.size;
		UnitAICommandType.size=GUnitAICommandType.size;
		VocationType.size=GVocationType.size;
	}
	
	/** 从流读取单个 */
	@Override
	protected void readBytesOne(int type,BytesReadStream stream)
	{
		super.readBytesOne(type,stream);
		
	}
	
	/** 刷新数据 */
	@Override
	public void refreshDataOne(int type)
	{
		super.refreshDataOne(type);
		
	}
	
	/** 读取场景表 */
	@Override
	protected void readScene(BytesReadStream stream)
	{
		GSceneConfig config;
		int len=stream.readLen();
		gsceneDic=new IntObjectMap<GSceneConfig>(GSceneConfig[]::new,len);
		sceneDic=new IntObjectMap<SceneConfig>(SceneConfig[]::new,len);
		for(int i=0;i<len;++i)
		{
			config=new GSceneConfig();
			config.readBytesSimple(stream);
			gsceneDic.put(config.id,config);
			sceneDic.put(config.id,config);
		}
	}
	
	/** 读取功能表 */
	@Override
	protected void readFunction(BytesReadStream stream)
	{
		GFunctionConfig config;
		int len=stream.readLen();
		gfunctionDic=new IntObjectMap<GFunctionConfig>(GFunctionConfig[]::new,len);
		functionDic=new IntObjectMap<FunctionConfig>(FunctionConfig[]::new,len);
		for(int i=0;i<len;++i)
		{
			config=new GFunctionConfig();
			config.readBytesSimple(stream);
			gfunctionDic.put(config.id,config);
			functionDic.put(config.id,config);
		}
	}
	
}
