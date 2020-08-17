using System;
using ShineEngine;
using UnityEngine;

/// <summary>
/// 游戏单位战斗逻辑
/// </summary>
public class GUnitFightLogic:UnitFightLogic
{

	private SList<SkillData> _normalSkills=new SList<SkillData>();

	private bool _isShooting=false;

	public GUnitFightLogic()
	{

	}

	public override void init()
	{
		base.init();

		selectNormalSkills();
	}

	public override void dispose()
	{
		base.dispose();

		_isShooting=false;
		_normalSkills.clear();
	}

	public override void onFrame(int delay)
	{
		base.onFrame(delay);

		if(_scene.method.canOperate())
		{
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
	}

	private void makeShootDir(DirData data)
	{
		data.copyDir(((GUnitPosData)_unit.getUnitData().pos).shootDir);
	}

	private void selectNormalSkills()
	{
		_normalSkills.clear();

		_data.fight.skills.forEachValue(v=>
		{
			SkillConfig config=SkillConfig.get(v.id);

			//普通
			if(config.attackType==SkillAttackType.Attack)
			{
				_normalSkills.add(v);
			}
		});
	}

	public void setShooting(bool value)
	{
		_isShooting=value;
	}

	protected override void onUseSkill()
	{
		base.onUseSkill();

		//普攻
		if(_currentSkillConfig.attackType==SkillAttackType.Attack)
		{
			((GUnitPosLogic)_unit.pos).setShootDirByServer(_fightExData.currentTarget.dir);
		}
	}
}