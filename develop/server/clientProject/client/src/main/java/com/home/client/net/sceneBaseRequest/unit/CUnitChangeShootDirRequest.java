package com.home.client.net.sceneBaseRequest.unit;
import com.home.client.constlist.generate.GSceneBaseRequestType;
import com.home.commonBase.data.scene.base.DirData;
import com.home.commonClient.net.sceneBaseRequest.base.CUnitRRequest;
import com.home.shine.bytes.BytesWriteStream;
import com.home.shine.control.BytesControl;
import com.home.shine.support.DataWriter;
import com.home.shine.support.pool.DataPool;

/** 控制单位改变设计朝向消息(generated by shine) */
public class CUnitChangeShootDirRequest extends CUnitRRequest
{
	/** 数据类型ID */
	public static final int dataID=GSceneBaseRequestType.CUnitChangeShootDir;
	
	/** 朝向 */
	public DirData dir;
	
	public CUnitChangeShootDirRequest()
	{
		_dataID=GSceneBaseRequestType.CUnitChangeShootDir;
	}
	
	@Override
	protected void copyData()
	{
		super.copyData();
		DirData dirTemp=dir;
		if(dirTemp!=null)
		{
			this.dir=new DirData();
			this.dir.copy(dirTemp);
		}
		else
		{
			this.dir=null;
		}
		
	}
	
	/** 获取数据类名 */
	@Override
	public String getDataClassName()
	{
		return "CUnitChangeShootDirRequest";
	}
	
	/** 写入字节流(简版) */
	@Override
	protected void toWriteBytesSimple(BytesWriteStream stream)
	{
		super.toWriteBytesSimple(stream);
		
		if(this.dir!=null)
		{
			stream.writeBoolean(true);
			this.dir.writeBytesSimple(stream);
		}
		else
		{
			stream.writeBoolean(false);
		}
		
	}
	
	/** 转文本输出 */
	@Override
	protected void toWriteDataString(DataWriter writer)
	{
		super.toWriteDataString(writer);
		
		writer.writeTabs();
		writer.sb.append("dir");
		writer.sb.append(':');
		if(this.dir!=null)
		{
			this.dir.writeDataString(writer);
		}
		else
		{
			writer.sb.append("DirData=null");
		}
		
		writer.writeEnter();
	}
	
	/** 回池 */
	@Override
	protected void toRelease(DataPool pool)
	{
		super.toRelease(pool);
		
		if(this.dir!=null)
		{
			this.dir.release(pool);
			this.dir=null;
		}
	}
	
	/** 创建实例 */
	public static CUnitChangeShootDirRequest create(int instanceID,DirData dir)
	{
		CUnitChangeShootDirRequest re=(CUnitChangeShootDirRequest)BytesControl.createRequest(dataID);
		re.instanceID=instanceID;
		re.dir=dir;
		return re;
	}
	
}
