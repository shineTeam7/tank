
using System;
using ShineEngine;
using UnityEditor;
using UnityEngine;

/// <summary>
///
/// </summary>
public class GSceneEditorWindow:SceneEditorWindow
{
	private GSceneElementEditorData[,] _gridShows;

	private SMap<GameObject,GSceneElementEditorData> _gridShowsDicByObj=new SMap<GameObject,GSceneElementEditorData>();

	private GameObject _gridAsset;
	private GameObject _wallAsset;
	private GameObject _stoneAsset;

	private GameObject _wallLayer;

	private int _lastType=0;

	protected override void doInit()
	{
		base.doInit();

		_gridAsset=AssetDatabase.LoadAssetAtPath<GameObject>(ShineGlobal.sourceHeadU + "editor/scene/sceneGrid.prefab");
		_wallAsset=AssetDatabase.LoadAssetAtPath<GameObject>(ShineGlobal.sourceHeadU + "editor/scene/wall.prefab");
		_stoneAsset=AssetDatabase.LoadAssetAtPath<GameObject>(ShineGlobal.sourceHeadU + "editor/scene/stone.prefab");
	}

	protected override void writeForGrid()
	{
		int xNum=_gridShows.GetLength(0);
		int zNum=_gridShows.GetLength(1);

		BytesWriteStream stream=new BytesWriteStream(xNum*zNum+8);
		stream.writeLen(xNum);
		stream.writeLen(zNum);

		for(int i=0;i<xNum;i++)
		{
			for(int j=0;j<zNum;j++)
			{
				stream.writeByte(_grids[i,j]);
			}
		}

		FileUtils.writeFileForBytesWriteStream(getMapGridFilePath(_currentSceneData.config.mapID),stream);
	}

	protected override void doShowScene()
	{
		base.doShowScene();

		_wallLayer=GameObject.Find("wall");

		if(_wallLayer==null)
		{
			_wallLayer=new GameObject("wall");
		}


		readGrid();

		int xNum=_grids.GetLength(0);
		int zNum=_grids.GetLength(1);

		_gridShows=new GSceneElementEditorData[xNum,zNum];

		for(int i=0;i<xNum;i++)
		{
			for(int j=0;j<zNum;j++)
			{
				makeGridShow(i,j,_grids[i,j]);
			}
		}
	}

	private void makeGridShow(int x,int z,int v)
	{
		GameObject grid=GameObject.Instantiate(_gridAsset);

		grid.transform.SetParent(_wallLayer.transform);

		Vector3 vec=grid.transform.position;
		vec.y=0.01f;

		setVectorByGrid(ref vec,x,z);

		grid.transform.position=vec;

		GGridComponent component=grid.GetComponent<GGridComponent>();
		component.setChangeFunc(onGridChanged);
		component.x=x;
		component.z=z;
		component.type=v;

		GSceneElementEditorData eData=new GSceneElementEditorData();
		eData.component=component;
		eData.gameObject=grid;
		eData.canPick=false;

		_gridShows[x,z]=eData;
		_gridShowsDicByObj.put(grid,eData);

		GameObject go=createGridShow(v);

		if(go!=null)
		{
			go.transform.SetParent(grid.transform);
			go.transform.localPosition=Vector3.zero;
			eData.childObj=go;
		}
	}

	/** 根据类型创建显示对象 */
	private GameObject createGridShow(int type)
	{
		switch(type)
		{
			case GMapBlockType.Wall:
			{
				return GameObject.Instantiate(_wallAsset);
			}
				break;
			case GMapBlockType.Stone:
			{
				return GameObject.Instantiate(_stoneAsset);
			}
				break;
		}

		return null;
	}

	protected override SceneElementEditorData toFindSceneElementEditorDataByGameObject(GameObject gameObject)
	{
		SceneElementEditorData re=base.toFindSceneElementEditorDataByGameObject(gameObject);

		if(re!=null)
			return re;

		re=_gridShowsDicByObj.get(gameObject);

		if(re!=null)
			return re;

		return null;
	}

	public void onGridChanged(GGridComponent component)
	{
		GSceneElementEditorData eData=_gridShows[component.x,component.z];

		doGridChange(eData,component.type);
	}

	private void doGridChange(GSceneElementEditorData eData,int type)
	{
		if(eData.childObj!=null)
		{
			GameObject.DestroyImmediate(eData.childObj);
		}

		GameObject go=createGridShow(type);

		if(go!=null)
		{
			go.transform.SetParent(eData.gameObject.transform);
			go.transform.localPosition=Vector3.zero;
			eData.childObj=go;
		}

		//赋值
		_grids[eData.component.x,eData.component.z]=(byte)type;
		eData.component.type=type;
		_lastType=type;
	}

	protected override bool onKeyUp(Event evt)
	{
		bool isC=evt.command || evt.control;

		switch(evt.keyCode)
		{
			case KeyCode.C:
			{
				if(_selectData!=null && _selectData is GSceneElementEditorData)
				{
					doGridChange((GSceneElementEditorData)_selectData,_lastType);
				}
			}
				break;
			case KeyCode.UpArrow:
			{
				doKeyDir(1,isC);
			}
				break;
			case KeyCode.DownArrow:
			{
				doKeyDir(3,isC);
			}
				break;
			case KeyCode.LeftArrow:
			{
				doKeyDir(2,isC);
			}
				break;
			case KeyCode.RightArrow:
			{
				doKeyDir(0,isC);
			}
				break;
		}

		return base.onKeyUp(evt);
	}

	private void doKeyDir(int dir,bool needDraw)
	{
		if(_selectData!=null && _selectData is GSceneElementEditorData)
		{
			GSceneElementEditorData currentSelect=(GSceneElementEditorData)_selectData;

			int x=currentSelect.component.x;
			int z=currentSelect.component.z;

			int nx=x;
			int nz=z;

			switch(dir)
			{
				case 0:
				{
					nx=x + 1;
				}
					break;
				case 1:
				{
					nz=z + 1;
				}
					break;
				case 2:
				{
					nx=x - 1;
				}
					break;
				case 3:
				{
					nz=z - 1;
				}
					break;
			}

			int xNum=_gridShows.GetLength(0);
			int zNum=_gridShows.GetLength(1);

			if(nx>=0 && nx<xNum && nz>=0 && nz<zNum)
			{
				GSceneElementEditorData nData=_gridShows[nx,nz];

				selectElement(nData);

				if(needDraw)
				{
					doGridChange(nData,currentSelect.component.type);
				}
			}
		}
	}
}