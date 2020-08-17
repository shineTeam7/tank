package com.home.base.part.player.data;
import com.home.base.constlist.generate.GPlayerPartDataType;
import com.home.commonBase.part.player.data.TeamPartData;
import com.home.shine.bytes.BytesReadStream;
import com.home.shine.bytes.BytesWriteStream;
import com.home.shine.data.BaseData;

/** (generated by shine) */
public class GTeamPartData extends TeamPartData
{
	/** 数据类型ID */
	public static final int dataID=GPlayerPartDataType.GTeam;
	
	public GTeamPartData()
	{
		_dataID=GPlayerPartDataType.GTeam;
	}
	
	/** 获取数据类名 */
	@Override
	public String getDataClassName()
	{
		return "GTeamPartData";
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
