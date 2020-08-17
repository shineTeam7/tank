package com.home.base.constlist.generate;
import com.home.commonBase.config.game.TextConfig;

/** 程序文本枚举(generated by shine) */
public class GTextEnum
{
	/** 通用文本 */
	public static String Ok;
	
	/** 通用文本 */
	public static String Cancel;
	
	/** 从配置读取 */
	public static void readConfig()
	{
		Ok=TextConfig.getText("ok");
		Cancel=TextConfig.getText("cancel");
	}
	
}
