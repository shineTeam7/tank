package com.home.base.part.player.data;
import com.home.base.constlist.generate.GPlayerPartDataType;
import com.home.commonBase.part.player.data.SingleCharacterPartData;
import com.home.shine.bytes.BytesReadStream;
import com.home.shine.bytes.BytesWriteStream;
import com.home.shine.data.BaseData;

/** 角色模块(generated by shine) */
public class GCharacterPartData extends SingleCharacterPartData
{
	/** 数据类型ID */
	public static final int dataID=GPlayerPartDataType.GCharacter;
	
	public GCharacterPartData()
	{
		_dataID=GPlayerPartDataType.GCharacter;
	}
	
	/** 获取数据类名 */
	@Override
	public String getDataClassName()
	{
		return "GCharacterPartData";
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