package com.home.center.part.centerGlobal.part;
import com.home.base.part.centerGlobal.data.GCenterUnionPartData;
import com.home.center.part.centerGlobal.GCenterGlobal;
import com.home.commonCenter.part.centerGlobal.CenterGlobal;
import com.home.commonCenter.part.centerGlobal.part.CenterUnionPart;
import com.home.shine.data.BaseData;

/** (generated by shine) */
public class GCenterUnionPart extends CenterUnionPart
{
	/** 角色对象 */
	public GCenterGlobal gme;
	
	/** 数据 */
	private GCenterUnionPartData _d;
	
	@Override
	public void setMe(CenterGlobal player)
	{
		super.setMe(player);
		gme=(GCenterGlobal)player;
	}
	
	@Override
	public void setData(BaseData data)
	{
		super.setData(data);
		
		_d=(GCenterUnionPartData)data;
	}
	
	/** 获取数据 */
	public GCenterUnionPartData getGPartData()
	{
		return _d;
	}
	
	@Override
	protected BaseData createPartData()
	{
		return new GCenterUnionPartData();
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
