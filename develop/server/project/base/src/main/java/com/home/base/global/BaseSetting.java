package com.home.base.global;

import com.home.base.constlist.GVersionEnum;
import com.home.commonBase.constlist.scene.PathFindingType;
import com.home.commonBase.constlist.system.GameAreaDivideType;
import com.home.commonBase.global.AppSetting;
import com.home.commonBase.global.CommonSetting;
import com.home.shine.global.ShineSetting;

/** 本游戏自定义设置 */
public class BaseSetting
{
	/** 开启机器人大乱斗 */
	public static boolean openFreeMelee=true;
	
	/** 初始化 */
	public static void init(boolean isRelease)
	{
		ShineSetting.isRelease=isRelease;
		AppSetting.init();
		
		ShineSetting.bytesUseBitBoolean=true;
		CommonSetting.gVersion=GVersionEnum.Version1;
		CommonSetting.areaDivideType=GameAreaDivideType.Split;
		CommonSetting.clientOpenReconnect=true;
		CommonSetting.hasTown=false;//无主城项目
		CommonSetting.useMultiLanguage=false;
		CommonSetting.pathFindingType=PathFindingType.JPS;
		//CommonSetting.pathFindingType=PathFindingType.Recast;
		
		//CommonSetting.needExternLib=true;
		CommonSetting.monsterNeedCrowedGrid=true;
		
		CommonSetting.serverMapNeedSecondGrid=false;
		CommonSetting.serverMapNeedGrid=true;
		CommonSetting.serverMapNeedRecast=false;
		
		CommonSetting.useSceneServer=true;
		
		
		//CommonSetting.needMonsterAIActive=false;
		
		//CommonSetting.clientSocketUseWebSocket=true;
		//ShineSetting.clientHttpUseBase64=true;
		//ShineSetting.clientHttpUseHttps=true;
		//ShineSetting.clientWebSocketUseWSS=true;
		
		//ShineSetting.useKCP=true;
		
		if(isRelease)
			initRelease();
		else
			initDebug();
	}
	
	/** 初始化release */
	private static void initRelease()
	{
	
	}
	
	/** 初始化debug */
	private static void initDebug()
	{
		//ShineSetting.socketReConnectKeepTime=2;//2秒的重连时间
		//ShineSetting.needPingCut=true;
		
		
		//ShineSetting.needThreadWatch=true;
		//ShineSetting.needDetailLog=true;
		
		//CommonSetting.isAreaDivideAverage=true;
		//CommonSetting.isTest=true;
		//CommonSetting.isTestCenterTown=true;
		CommonSetting.openAOICheck=true;//aoi检测
		
		CommonSetting.needTriggerLog=true;
		
		ShineSetting.needDebugLog=false;
		
		ShineSetting.needShowMessage=false;
		ShineSetting.needShowClientMessage=false;
		ShineSetting.needShowMessageDetail=false;
		ShineSetting.needDataStringOneLine=true;
		
		//ShineSetting.timeZone="GMT-8:00";
		
	}
}
