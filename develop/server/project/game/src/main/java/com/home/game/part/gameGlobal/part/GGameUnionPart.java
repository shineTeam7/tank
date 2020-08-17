package com.home.game.part.gameGlobal.part;
import com.home.base.constlist.generate.GFunctionType;
import com.home.base.part.gameGlobal.data.GGameUnionPartData;
import com.home.commonBase.constlist.generate.FunctionType;
import com.home.commonGame.part.gameGlobal.GameGlobal;
import com.home.commonGame.part.gameGlobal.part.GameUnionPart;
import com.home.commonGame.tool.func.GamePageShowTool;
import com.home.commonGame.tool.func.GameRoleGroupRankTool;
import com.home.commonGame.tool.func.GameToCenterRoleGroupRankTool;
import com.home.game.part.gameGlobal.GGameGlobal;
import com.home.shine.data.BaseData;

/** (generated by shine) */
public class GGameUnionPart extends GameUnionPart
{
	/** 角色对象 */
	public GGameGlobal gme;
	
	/** 数据 */
	private GGameUnionPartData _d;
	
	@Override
	public void setMe(GameGlobal player)
	{
		super.setMe(player);
		gme=(GGameGlobal)player;
	}
	
	@Override
	public void setData(BaseData data)
	{
		super.setData(data);
		
		_d=(GGameUnionPartData)data;
	}
	
	/** 获取数据 */
	public GGameUnionPartData getGPartData()
	{
		return _d;
	}
	
	@Override
	protected BaseData createPartData()
	{
		return new GGameUnionPartData();
	}
	
	/** 初始化(创建后刚调用,与dispose成对) */
	@Override
	public void init()
	{
		super.init();
		
	}
	
	/** 析构(回池前调用,与init成对) */
	@Override
	public void dispose()
	{
		super.dispose();
		
	}
	
	/** 从库中读完数据后(做数据的补充解析)(onNewCreate后也会调用一次)(主线程) */
	@Override
	public void afterReadData()
	{
		super.afterReadData();
		
	}
	
	/** 新创建时(该主对象在服务器上第一次被创建时的动作(一生只一次),(只对数据赋值就好,自定义数据构造的部分写到afterReadData里,因为这个完事儿就会回调到)) */
	@Override
	public void onNewCreate()
	{
		super.onNewCreate();
		
	}
	
	/** 构造函数(只在new后调用一次,再次从池中取出不会调用) */
	@Override
	public void construct()
	{
		super.construct();
		
	}
	
	/** 构造数据前 */
	@Override
	protected void beforeMakeData()
	{
		super.beforeMakeData();
		
	}
	
}
