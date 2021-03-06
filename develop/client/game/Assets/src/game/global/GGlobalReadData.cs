using ShineEngine;

/// <summary>
/// 全局配置表(generated by shine)
/// </summary>
[Hotfix]
public class GGlobalReadData:GlobalReadData
{
	/// <summary>
	/// 默认角色职业
	/// </summary>
	public int defaultVocation;
	
	/// <summary>
	/// 大乱斗人数
	/// </summary>
	public int meleePlayerNum;
	
	/// <summary>
	/// 大乱斗匹配最长等待时间(s)
	/// </summary>
	public int meleeMatchMaxTime;
	
	/// <summary>
	/// 乱走AI半径(米)
	/// </summary>
	public float chaosMoveRadius;
	
	/// <summary>
	/// 墙2
	/// </summary>
	public string source_wall2;
	
	/// <summary>
	/// 墙1
	/// </summary>
	public string source_wall1;
	
	/// <summary>
	/// 读取字节流(简版)
	/// </summary>
	protected override void toReadBytesSimple(BytesReadStream stream)
	{
		base.toReadBytesSimple(stream);
		
		this.defaultVocation=stream.readInt();
		
		this.meleePlayerNum=stream.readInt();
		
		this.meleeMatchMaxTime=stream.readInt();
		
		this.chaosMoveRadius=stream.readFloat();
		
		this.source_wall1=stream.readUTF();
		
		this.source_wall2=stream.readUTF();
		
	}
	
}
