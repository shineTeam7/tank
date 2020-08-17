using ShineEngine;

/// <summary>
/// 角色存库信息(跟CharacterCacheDO没有关系)(generated by shine)
/// </summary>
public class GCharacterSaveData:CharacterSaveData
{
	/// <summary>
	/// 数据类型ID
	/// </summary>
	public const int dataID=GBaseDataType.GCharacterSave;
	
	public GCharacterSaveData()
	{
		_dataID=GBaseDataType.GCharacterSave;
	}
	
	/// <summary>
	/// 获取数据类名
	/// </summary>
	public override string getDataClassName()
	{
		return "GCharacterSaveData";
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
