package com.home.base.part.centerGlobal.data;
import com.home.base.constlist.generate.GCenterGlobalPartDataType;
import com.home.commonBase.part.centerGlobal.data.CenterFuncPartData;
import com.home.shine.bytes.BytesReadStream;
import com.home.shine.bytes.BytesWriteStream;
import com.home.shine.data.BaseData;

/** (generated by shine) */
public class GCenterFuncPartData extends CenterFuncPartData
{
	/** 数据类型ID */
	public static final int dataID=GCenterGlobalPartDataType.GCenterFunc;
	
	public GCenterFuncPartData()
	{
		_dataID=GCenterGlobalPartDataType.GCenterFunc;
	}
	
	/** 获取数据类名 */
	@Override
	public String getDataClassName()
	{
		return "GCenterFuncPartData";
	}
	
	/** 读取字节流(完整版) */
	@Override
	protected void toReadBytesFull(BytesReadStream stream)
	{
		super.toReadBytesFull(stream);
		
		stream.startReadObj();
		
		stream.endReadObj();
	}
	
	/** 写入字节流(完整版) */
	@Override
	protected void toWriteBytesFull(BytesWriteStream stream)
	{
		super.toWriteBytesFull(stream);
		
		stream.startWriteObj();
		
		stream.endWriteObj();
	}
	
}
