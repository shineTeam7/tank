package com.home.game.part.player.part;
import com.home.base.part.player.clientData.GRoleClientPartData;
import com.home.base.part.player.data.GRolePartData;
import com.home.commonBase.baseData.BaseClientPartData;
import com.home.commonGame.part.player.Player;
import com.home.commonGame.part.player.part.RolePart;
import com.home.game.part.player.GPlayer;
import com.home.shine.data.BaseData;

/** 角色(generated by shine) */
public class GRolePart extends RolePart
{
	/** 角色对象 */
	public GPlayer gme;
	
	/** 数据 */
	private GRolePartData _d;
	
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
		
		_d=(GRolePartData)data;
	}
	
	/** 获取数据 */
	public GRolePartData getGPartData()
	{
		return _d;
	}
	
	@Override
	protected BaseData createPartData()
	{
		return new GRolePartData();
	}
	
	@Override
	protected BaseClientPartData createClientData()
	{
		return new GRoleClientPartData();
	}
	
	/** 写客户端数据(copyServer过后的) */
	@Override
	protected void writeClientData(BaseClientPartData data)
	{
		super.writeClientData(data);
		
		toWriteClientData((GRoleClientPartData)data);
	}
	
	/** 写客户端数据具体执行(已执行过copyServer了,就是说CPO中与SPO同名同类型的属性无需再赋值) */
	private void toWriteClientData(GRoleClientPartData data)
	{
		
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
