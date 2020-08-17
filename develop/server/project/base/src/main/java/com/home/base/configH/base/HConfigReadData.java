package com.home.base.configH.base;
import com.home.base.config.base.GConfigReadData;
import com.home.base.constlist.generate.HConfigType;
import com.home.base.global.HGlobal;
import com.home.base.global.HGlobalReadData;
import com.home.commonBase.constlist.generate.ConfigType;
import com.home.shine.bytes.BytesReadStream;

/** (generated by shine) */
public class HConfigReadData extends GConfigReadData
{
	/** 构造常量size */
	@Override
	public void makeConstSize()
	{
		super.makeConstSize();
		
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
				HGlobal.readFromData((HGlobalReadData)global);
				HGlobal.afterReadConfig();
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
				HGlobal.afterReadConfigAll();
			}
				break;
		}
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
	
	/** 读取全局配置表 */
	@Override
	protected void readGlobal(BytesReadStream stream)
	{
		global=new HGlobalReadData();
		global.readBytesSimple(stream);
	}
	
}
