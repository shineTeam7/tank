using ShineEngine;

/// <summary>
/// 全局配置表(generated by shine)
/// </summary>
public class GGlobal
{
	/// <summary>
	/// 默认角色职业
	/// </summary>
	public static int defaultVocation;
	
	/// <summary>
	/// 大乱斗人数
	/// </summary>
	public static int meleePlayerNum;
	
	/// <summary>
	/// 大乱斗匹配最长等待时间(s)
	/// </summary>
	public static int meleeMatchMaxTime;
	
	/// <summary>
	/// 乱走AI半径(米)
	/// </summary>
	public static float chaosMoveRadius;
	
	/// <summary>
	/// 墙2
	/// </summary>
	public static string source_wall2;
	
	/// <summary>
	/// 墙1
	/// </summary>
	public static string source_wall1;
	
	/// <summary>
	/// 从流读取
	/// </summary>
	public static void readFromData(GGlobalReadData data)
	{
		defaultVocation=data.defaultVocation;
		meleePlayerNum=data.meleePlayerNum;
		meleeMatchMaxTime=data.meleeMatchMaxTime;
		chaosMoveRadius=data.chaosMoveRadius;
		source_wall1=data.source_wall1;
		source_wall2=data.source_wall2;
	}
	
	/// <summary>
	/// 读取数据后
	/// </summary>
	public static void afterReadConfig()
	{

	}
	
	/// <summary>
	/// 全部读取后
	/// </summary>
	public static void afterReadConfigAll()
	{
		
	}
	
}
