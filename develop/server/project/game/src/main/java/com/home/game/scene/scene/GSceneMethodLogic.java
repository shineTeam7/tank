package com.home.game.scene.scene;

import com.home.commonBase.constlist.generate.MapMoveType;
import com.home.commonBase.data.scene.base.PosData;
import com.home.commonBase.data.scene.unit.UnitData;
import com.home.commonBase.scene.base.Unit;
import com.home.commonGame.scene.scene.GameSceneMethodLogic;
import com.home.commonSceneBase.scene.scene.BSceneMethodLogic;
import com.home.shine.utils.MathUtils;

public class GSceneMethodLogic extends GameSceneMethodLogic
{
	@Override
	public void makeScenePosData(UnitData data,int posID)
	{
		getEnablePos(data.pos.pos);
		
		//0值
		data.pos.dir.direction=MathUtils.fPI_half;//90
	}
	
	/** 获取一个可用的点 */
	public void getEnablePos(PosData pos)
	{
		//随机一个点
		while(true)
		{
			pos.x=MathUtils.randomFloat()*_scene.sizePos.x+_scene.originPos.x;
			pos.y=_scene.originPos.y;
			pos.z=MathUtils.randomFloat()*_scene.sizePos.z+_scene.originPos.z;
			
			if(_scene.pos.isPosEnabled(MapMoveType.Land,pos))
			{
				boolean has=false;
				
				Unit[] values;
				Unit v;
				
				for(int i=(values=_scene.getCharacterDic().getValues()).length-1;i>=0;--i)
				{
					if((v=values[i])!=null)
					{
						//半径3m内
						if(_scene.pos.calculatePosDistanceSq2D(v.pos.getPos(),pos)<9f)
						{
							has=true;
							break;
						}
					}
				}
				
				if(has)
					continue;
				
				break;
			}
		}
	}
}
