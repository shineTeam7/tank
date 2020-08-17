package com.home.client.part.player.part;
import com.home.base.part.player.clientData.GSceneClientPartData;
import com.home.client.part.player.GPlayer;
import com.home.commonClient.part.player.Player;
import com.home.commonClient.part.player.part.ScenePart;
import com.home.shine.data.BaseData;

/** 场景(generated by shine) */
public class GScenePart extends ScenePart
{
	/** 角色对象 */
	public GPlayer gme;
	
	/** 数据 */
	private GSceneClientPartData _d;
	
	@Override
	public void setMe(Player player)
	{
		super.setMe(player);
		gme=(GPlayer)player;
	}
	
	@Override
	public void setData(BaseData data)
	{
		super.setData(data);
		
		_d=(GSceneClientPartData)data;
	}
	
	/** 获取数据 */
	public GSceneClientPartData getGPartData()
	{
		return _d;
	}
	
	@Override
	protected BaseData createPartData()
	{
		return new GSceneClientPartData();
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
	
	/** 功能开启(id:功能ID) */
	@Override
	public void onFunctionOpen(int id)
	{
		super.onFunctionOpen(id);
		
	}
	
	/** 功能关闭(id:功能ID) */
	@Override
	public void onFunctionClose(int id)
	{
		super.onFunctionClose(id);
		
	}
	
}
