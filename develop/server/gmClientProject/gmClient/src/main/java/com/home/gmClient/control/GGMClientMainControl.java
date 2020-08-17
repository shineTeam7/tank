package com.home.gmClient.control;

import com.home.commonBase.constlist.generate.CurrencyType;
import com.home.commonBase.data.gm.GMAddCurrencyOWData;
import com.home.commonBase.data.gm.QueryPlayerLevelWData;
import com.home.commonBase.data.queryResult.IntQueryResultData;
import com.home.commonGMClient.control.GMClientMainControl;
import com.home.shine.control.ThreadControl;
import com.home.shine.ctrl.Ctrl;
import com.home.shine.data.BaseData;

public class GGMClientMainControl extends GMClientMainControl
{
	@Override
	protected void onLogin()
	{
		super.onLogin();
		
		ThreadControl.addTempFunc(()->
		{
			QueryPlayerLevelWData data=new QueryPlayerLevelWData();
			data.receivePlayerID=100000001;
			
			IntQueryResultData re=(IntQueryResultData)queryPlayerWork(data);
			
			Ctrl.print("看",re.intValue);
		});
	}
}
