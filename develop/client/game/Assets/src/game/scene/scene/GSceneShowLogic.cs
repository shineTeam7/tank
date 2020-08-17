using System;
using ShineEngine;
using UnityEngine;
using UnityEngine.SceneManagement;

/// <summary>
/// 场景显示逻辑
/// </summary>
public class GSceneShowLogic:SceneShowLogic3DOne
{
	private GridMapInfoConfig _gridConfig;

	private int _wall1Rid;
	private int _wall2Rid;

	private GameObject _wallRoot;

	private SList<GWall> _wallList=new SList<GWall>();

	public GSceneShowLogic()
	{

	}

	protected GScene gameScene
	{
		get {return (GScene)_scene;}
	}

	public override void init()
	{
		base.init();

		_wallRoot=GameObject.Find("wall");

		_wall1Rid=LoadControl.getResourceIDByName(GGlobal.source_wall1);
		_wall2Rid=LoadControl.getResourceIDByName(GGlobal.source_wall2);

		//场景显示构造

		_gridConfig=_scene.getMapInfoConfig().grid;

		makeWall();
	}

	public override void dispose()
	{
		base.dispose();

		_wallList.forEachAndClear(v=>
		{
			AssetPoolControl.unloadOne(AssetPoolType.SceneEffect,v.rid,v.obj);
		});

		_wallRoot=null;
	}

	public override void onUnitChat(Unit unit,ChatData data)
	{
		// GameC.player.dispatch(GGameEventType.FightChatResponse,data);
	}

	private void makeWall()
	{
		_gridConfig=_scene.getMapInfoConfig().grid;

		int width=_gridConfig.width;
		int height=_gridConfig.width;

		byte[] mainGrids=_gridConfig.mainGrids;

		IntSet usedSet=new IntSet();

		for(int i=0;i<width;i++)
		{
			for(int j=0;j<height;j++)
			{
				int gridIndex=_gridConfig.getGridIndex(i,j);

				//未使用
				if(!usedSet.contains(gridIndex))
				{
					int v=mainGrids[gridIndex];

					if(v==GMapBlockType.Wall)
					{
						int rx=i;
						int nx=rx;

						while(true)
						{
							nx++;

							if(nx<width && _gridConfig.getGrid(nx,j)==GMapBlockType.Wall)
							{
								//继续
								rx=nx;
							}
							else
							{
								break;
							}
						}

						//横排有
						if(rx!=i)
						{
							for(int k=i;k<=rx;k++)
							{
								usedSet.add(_gridConfig.getGridIndex(k,j));
							}

							makeOne(i,j,rx - i,true);
							continue;
						}

						int ry=j;
						int ny=ry;

						while(true)
						{
							ny++;

							if(ny<height && _gridConfig.getGrid(i,ny)==GMapBlockType.Wall)
							{
								//继续
								ry=ny;
							}
							else
							{
								break;
							}
						}

						//竖排有
						if(ry!=j)
						{
							for(int k=j;k<=ry;k++)
							{
								usedSet.add(_gridConfig.getGridIndex(i,k));
							}

							makeOne(i,j,ry - j,false);
							continue;
						}


						usedSet.add(gridIndex);
						makeOne(i,j,1,MathUtils.randomBoolean());
					}
				}

			}
		}
	}

	private void makeOne(int x,int y,int len,bool isH)
	{
		int rid=MathUtils.randomBoolean() ? _wall1Rid : _wall2Rid;

		GameObject wall=AssetPoolControl.getAssetAndIncrease(AssetPoolType.SceneEffect,rid);
		wall.SetActive(true);
		wall.transform.SetParent(_wallRoot.transform);

		if(isH)
		{
			wall.transform.position=new Vector3(Global.mapBlockSize * (x + len*0.5f),0,Global.mapBlockSize * (y + 0.5f));
			wall.transform.localScale=new Vector3(len,1f,1f);
			wall.transform.localEulerAngles=new Vector3(0f,0f,0);
		}
		else
		{
			wall.transform.position=new Vector3(Global.mapBlockSize * (x + 0.5f),0,Global.mapBlockSize * (y + len*0.5f));
			wall.transform.localScale=new Vector3(len,1f,1f);
			wall.transform.localEulerAngles=new Vector3(0f,90f,0);
		}

		_wallList.add(new GWall(){rid=rid,obj=wall});
	}

	private struct GWall
	{
		public int rid;

		public GameObject obj;
	}
}