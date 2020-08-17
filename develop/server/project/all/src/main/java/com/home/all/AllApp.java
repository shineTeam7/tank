package com.home.all;

import com.home.base.global.BaseSetting;
import com.home.center.app.GCenterApp;
import com.home.commonBase.app.CrossDomainApp;
import com.home.commonBase.global.AppSetting;
import com.home.commonBase.global.BaseC;
import com.home.game.app.GGameApp;
import com.home.login.app.GLoginApp;
import com.home.manager.app.GManagerApp;
import com.home.shine.global.ShineSetting;

/** 进程合一 */
public class AllApp
{
	public static void main(String[] args)
	{
		if(args.length<1)
		{
			System.out.println("参数不足");
			return;
		}
		
		BaseSetting.init(true);
		
		if(args[0].endsWith("T"))
		{
			ShineSetting.logNeedConsole=true;
			args[0]=args[0].substring(0,args[0].length()-1);
		}
		
		switch(args[0])
		{
			case "cross":
			{
				new CrossDomainApp().start();
			}
				break;
			case "center":
			{
				new GCenterApp().start();
			}
				break;
			case "login":
			{
				if(args.length<2)
				{
					return;
				}
				
				new GLoginApp(Integer.parseInt(args[1])).start();
			}
				break;
			case "game":
			{
				if(args.length<2)
				{
					return;
				}
				
				new GGameApp(Integer.parseInt(args[1])).start();
			}
				break;
			case "simple":
			case "localSimple":
			{
				boolean isSimple=args[0].equals("simple");
				
				//debug模式
				BaseSetting.init(isSimple);
				ShineSetting.isAllInOne=true;
				
				new GManagerApp().start();
				new GCenterApp().start();
				new GLoginApp(1).start();
				new GGameApp(1).start();
			}
				break;
			case "manager":
			{
				if(args.length<2)
				{
					return;
				}
				
				new GManagerApp().start();
			}
				break;
			case "dbUpdate":
			{
				new GCenterApp().startCustom(()->
				{
					BaseC.dbUpdate.execute();
				});
			}
				break;
			default:
			{
				System.out.println("参数错误");
			}
				break;
		}
	}
}
