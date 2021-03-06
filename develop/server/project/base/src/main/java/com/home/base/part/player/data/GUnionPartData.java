package com.home.base.part.player.data;
import com.home.base.constlist.generate.GPlayerPartDataType;
import com.home.commonBase.part.player.data.UnionPartData;
import com.home.shine.bytes.BytesReadStream;
import com.home.shine.bytes.BytesWriteStream;
import com.home.shine.data.BaseData;

/** (generated by shine) */
public class GUnionPartData extends UnionPartData
{
	/** 数据类型ID */
	public static final int dataID=GPlayerPartDataType.GUnion;
	
	public GUnionPartData()
	{
		_dataID=GPlayerPartDataType.GUnion;
	}
	
	/** 获取数据类名 */
	@Override
	public String getDataClassName()
	{
		return "GUnionPartData";
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
