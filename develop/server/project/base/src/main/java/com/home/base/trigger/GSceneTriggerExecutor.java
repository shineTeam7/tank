package com.home.base.trigger;

import com.home.base.constlist.generate.GTriggerFunctionType;
import com.home.commonBase.trigger.SceneTriggerExecutor;
import com.home.commonBase.trigger.TriggerActionRunner;
import com.home.commonBase.trigger.TriggerArg;
import com.home.shine.data.trigger.TriggerFuncData;

/** g层场景出发 */
public class GSceneTriggerExecutor extends SceneTriggerExecutor
{
	@Override
	protected void toDoActionFunc(TriggerFuncData func,TriggerArg arg)
	{
		switch(func.id)
		{
			case GTriggerFunctionType.GTestFunc:
			{
				//执行
				print("测试执行");
			}
				break;
			default:
			{
				super.toDoActionFunc(func,arg);
			}
		}
	}
}
