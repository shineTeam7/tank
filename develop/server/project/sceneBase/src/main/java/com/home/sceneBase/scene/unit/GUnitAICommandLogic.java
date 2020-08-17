package com.home.sceneBase.scene.unit;

import com.home.base.constlist.generate.GUnitAICommandType;
import com.home.base.global.GGlobal;
import com.home.commonBase.constlist.generate.MapMoveType;
import com.home.commonBase.constlist.generate.UnitAIFightStateType;
import com.home.commonBase.data.scene.base.PosData;
import com.home.commonBase.scene.unit.UnitAICommandLogic;
import com.home.shine.utils.MathUtils;

/** 单位ai指令逻辑 */
public class GUnitAICommandLogic extends UnitAICommandLogic
{
	private PosData _tempPos=new PosData();
	
	@Override
	protected void doRunCommand()
	{
		super.doRunCommand();
		
		switch(_commandType)
		{
			case GUnitAICommandType.Chaos:
			{
				//先停止移动
				if(_unit.move.canMoveNow())
				{
					_unit.move.stopMove();
				}
				
				//开启射击
				((GUnitFightLogic)_unit.fight).setShooting(true);
				
				_aiLogic.setFightState(UnitAIFightStateType.Move);
			}
				break;
		}
	}
	
	@Override
	public void updateCommand(int delay)
	{
		super.updateCommand(delay);
		
		switch(_commandType)
		{
			case GUnitAICommandType.Chaos:
			{
				//没有移动中
				if(!_unit.move.isMoving())
				{
					if(_unit.move.canMoveNow())
					{
						chaosMoveOnce();
					}
				}
			}
				break;
		}
	}
	
	@Override
	public void onCommandMoveToOver(boolean isSuccess)
	{
		super.onCommandMoveToOver(isSuccess);
		
		switch(_commandType)
		{
			case GUnitAICommandType.Chaos:
			{
				if(isSuccess)
				{
					chaosMoveOnce();
				}
			}
				break;
		}
	}
	
	private void chaosMoveOnce()
	{
		getWalkPos(_tempPos,_unit.pos.getPos());
		
		_unit.move.moveTo(_tempPos);
	}
	
	/** 获取一个移动点 */
	private void getWalkPos(PosData pos,PosData origin)
	{
		//随机一个点
		while(true)
		{
			pos.x=origin.x+MathUtils.randomFloatBetweenOne()* GGlobal.chaosMoveRadius;
			pos.y=_scene.originPos.y;
			pos.z=origin.z+MathUtils.randomFloatBetweenOne()* GGlobal.chaosMoveRadius;
			
			if(_scene.pos.isPosEnabled(MapMoveType.Land,pos))
			{
				break;
			}
		}
	}
}
