package com.home.base.tool;

import com.home.base.tool.generate.GBaseDataMaker;
import com.home.base.tool.generate.GCenterGlobalListDataMaker;
import com.home.base.tool.generate.GCenterGlobalPartDataMaker;
import com.home.base.tool.generate.GGameGlobalListDataMaker;
import com.home.base.tool.generate.GGameGlobalPartDataMaker;
import com.home.base.tool.generate.GPlayerListClientDataMaker;
import com.home.base.tool.generate.GPlayerListDataMaker;
import com.home.base.tool.generate.GPlayerPartClientDataMaker;
import com.home.base.tool.generate.GPlayerPartDataMaker;
import com.home.base.tool.generate.HPlayerListClientDataMaker;
import com.home.base.tool.generate.HPlayerListDataMaker;
import com.home.base.tool.generate.HPlayerPartClientDataMaker;
import com.home.base.tool.generate.HPlayerPartDataMaker;
import com.home.base.tool.generate.HotfixDataMaker;
import com.home.commonBase.tool.BaseDataRegister;

public class GBaseDataRegister extends BaseDataRegister
{
	@Override
	public void regist()
	{
		super.regist();
		
		//手动加,因为工程多继承
		add(new GBaseDataMaker());
		add(new HotfixDataMaker());
		
		//global
		add(new GCenterGlobalPartDataMaker());
		add(new GCenterGlobalListDataMaker());
		
		//global
		add(new GGameGlobalPartDataMaker());
		add(new GGameGlobalListDataMaker());
		
		//player
		add(new GPlayerPartDataMaker());
		add(new GPlayerListDataMaker());
		add(new GPlayerPartClientDataMaker());
		add(new GPlayerListClientDataMaker());
		
		//hPlayer
		add(new HPlayerPartDataMaker());
		add(new HPlayerListDataMaker());
		add(new HPlayerPartClientDataMaker());
		add(new HPlayerListClientDataMaker());
		
	}
}
