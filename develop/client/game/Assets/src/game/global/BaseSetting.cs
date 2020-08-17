using System.Collections.Generic;
using ShineEngine;
using UnityEngine;

/// <summary>
/// 
/// </summary>
public class BaseSetting
{
	public static bool needShowLogo=true;

	public static void init()
	{
		AppSetting.init();

		ShineSetting.gameName="tank";

		ShineSetting.bytesUseBitBoolean=true;
		ShineSetting.useHotFix=false;
		// ShineSetting.useReflectDll=true;

		// ShineSetting.needError=false;
		//显示消息
		// ShineSetting.needShowMessage=true;

		//正向均为x轴正向
		CommonSetting.rotationOff=0f;

		CommonSetting.hasTown=false;
		CommonSetting.useMultiLanguage=false;
		CommonSetting.areaDivideType=GameAreaDivideType.Split;

		CommonSetting.useSceneServer=true;


		//		ShineSetting.resourceKeepCheckDelay=2;
		//		ShineSetting.resourceKeepTime=5;
		//		ShineSetting.uiDisposeKeepTime=3;

		CommonSetting.needTriggerLog=true;

		CommonSetting.serverMapNeedSecondGrid=false;
		CommonSetting.serverMapNeedGrid = true;
		CommonSetting.clientMapNeedGrid = true;
		CommonSetting.serverMapNeedRecast = false;

		// ShineSetting.messageUsePool=false;
		ShineSetting.socketUseAsync=true;
		// ShineSetting.useKCP=true;


		//self
		if(ShineSetting.isRelease)
			initRelease();
		else
			initDebug();
	}

	private static void initRelease()
	{

	}

	private static void initDebug()
	{
		ShineSetting.localLoadWithOutBundle=true;

		needShowLogo=false;
	}
}