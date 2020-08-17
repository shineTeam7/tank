package com.home.sceneBase.scene.unit;

import com.home.commonBase.config.game.SkillConfig;
import com.home.commonBase.constlist.generate.SkillAttackType;
import com.home.commonBase.constlist.generate.SkillTargetType;
import com.home.commonBase.data.scene.base.DirData;
import com.home.commonBase.data.scene.base.SkillData;
import com.home.commonBase.data.scene.fight.SkillTargetData;
import com.home.commonSceneBase.scene.unit.BUnitFightLogic;
import com.home.shine.support.collection.SList;
import com.home.shine.utils.MathUtils;

public class GUnitFightLogic extends BUnitFightLogic
{
	private SList<SkillData> _normalSkills=new SList<>(SkillData[]::new);
	
	private boolean _isShooting=false;
	
	@Override
	public void init()
	{
		super.init();
		
		selectNormalSkills();
	}
	
	@Override
	public void dispose()
	{
		super.dispose();
		
		_isShooting=false;
		_normalSkills.clear();
	}
	
	@Override
	public void onFrame(int delay)
	{
		super.onFrame(delay);
		
		//不可操作
		if(!_scene.method.canOperate())
			return;
		
		if(_isShooting && !_normalSkills.isEmpty())
		{
			SkillData[] values=_normalSkills.getValues();
			SkillData v;
			
			for(int i=0,len=_normalSkills.size();i<len;++i)
			{
				v=values[i];
				
				if(checkCanUseSkill(v))
				{
					SkillTargetData tData=new SkillTargetData();
					tData.type=SkillTargetType.Direction;
					tData.dir=new DirData();
					
					makeShootDir(tData.dir);
					
					useSkill(v,tData);
				}
			}
		}
	}
	
	private void makeShootDir(DirData data)
	{
		//data.copyDir(((GUnitPosData)_unit.getUnitData().pos).shootDir);
		
		//随机位置
		data.direction=MathUtils.randomDirection();
	}
	
	private void selectNormalSkills()
	{
		_normalSkills.clear();
		
		_data.fight.skills.forEachValue(v->
		{
			SkillConfig config=SkillConfig.get(v.id);
			
			//普通
			if(config.attackType==SkillAttackType.Attack)
			{
				_normalSkills.add(v);
			}
		});
	}
	
	public void setShooting(boolean value)
	{
		_isShooting=value;
	}
}