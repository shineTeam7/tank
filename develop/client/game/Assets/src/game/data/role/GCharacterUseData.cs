using ShineEngine;

/// <summary>
/// 游戏角色使用数据(generated by shine)
/// </summary>
public class GCharacterUseData:CharacterUseData
{
	/// <summary>
	/// 数据类型ID
	/// </summary>
	public const int dataID=GBaseDataType.GCharacterUse;
	
	public GCharacterUseData()
	{
		_dataID=GBaseDataType.GCharacterUse;
	}
	
	/// <summary>
	/// 获取数据类名
	/// </summary>
	public override string getDataClassName()
	{
		return "GCharacterUseData";
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
