package com.home.base.part.player.data;
import com.home.base.constlist.generate.GPlayerPartDataType;
import com.home.commonBase.part.player.data.RolePartData;
import com.home.shine.bytes.BytesReadStream;
import com.home.shine.bytes.BytesWriteStream;
import com.home.shine.data.BaseData;

/** (generated by shine) */
public class GRolePartData extends RolePartData
{
	/** 数据类型ID */
	public static final int dataID=GPlayerPartDataType.GRole;
	
	public GRolePartData()
	{
		_dataID=GPlayerPartDataType.GRole;
	}
	
	/** 获取数据类名 */
	@Override
	public String getDataClassName()
	{
		return "GRolePartData";
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