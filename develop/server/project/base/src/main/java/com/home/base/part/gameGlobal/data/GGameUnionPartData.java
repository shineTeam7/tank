package com.home.base.part.gameGlobal.data;
import com.home.base.constlist.generate.GGameGlobalPartDataType;
import com.home.commonBase.part.gameGlobal.data.GameUnionPartData;
import com.home.shine.bytes.BytesReadStream;
import com.home.shine.bytes.BytesWriteStream;
import com.home.shine.data.BaseData;

/** (generated by shine) */
public class GGameUnionPartData extends GameUnionPartData
{
	/** 数据类型ID */
	public static final int dataID=GGameGlobalPartDataType.GGameUnion;
	
	public GGameUnionPartData()
	{
		_dataID=GGameGlobalPartDataType.GGameUnion;
	}
	
	/** 获取数据类名 */
	@Override
	public String getDataClassName()
	{
		return "GGameUnionPartData";
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