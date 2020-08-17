using ShineEngine;

/// <summary>
/// trigger控制(generated by shine)
/// </summary>
public class GTriggerControl:TriggerControl
{
	/// <summary>
	/// 注册返回值
	/// </summary>
	protected override void registReturnType()
	{
		base.registReturnType();
		
		funcReturnTypeDic[GTriggerFunctionType.GTestFunc]=STriggerObjectType.Void;
		funcNameDic[GTriggerFunctionType.GTestFunc]="gTestFunc";
	}
	
}
