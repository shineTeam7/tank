using ShineEngine;

/// <summary>
/// (generated by shine)
/// </summary>
public class GUnionPartData:UnionPartData
{
	/// <summary>
	/// 数据类型ID
	/// </summary>
	public const int dataID=GPlayerPartDataType.GUnion;
	
	public GUnionPartData()
	{
		_dataID=GPlayerPartDataType.GUnion;
	}
	
	/// <summary>
	/// 获取数据类名
	/// </summary>
	public override string getDataClassName()
	{
		return "GUnionPartData";
	}
	
	/// <summary>
	/// 读取字节流(完整版)
	/// </summary>
	protected override void toReadBytesFull(BytesReadStream stream)
	{
		base.toReadBytesFull(stream);
		
		stream.startReadObj();
		
		stream.endReadObj();
	}
	
	/// <summary>
	/// 写入字节流(完整版)
	/// </summary>
	protected override void toWriteBytesFull(BytesWriteStream stream)
	{
		base.toWriteBytesFull(stream);
		
		stream.startWriteObj();
		
		stream.endWriteObj();
	}
	
}
