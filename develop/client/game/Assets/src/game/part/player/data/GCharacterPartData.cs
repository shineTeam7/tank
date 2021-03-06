using ShineEngine;

/// <summary>
/// 角色模块(generated by shine)
/// </summary>
public class GCharacterPartData:SingleCharacterPartData
{
	/// <summary>
	/// 数据类型ID
	/// </summary>
	public const int dataID=GPlayerPartDataType.GCharacter;
	
	public GCharacterPartData()
	{
		_dataID=GPlayerPartDataType.GCharacter;
	}
	
	/// <summary>
	/// 获取数据类名
	/// </summary>
	public override string getDataClassName()
	{
		return "GCharacterPartData";
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
