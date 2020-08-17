using System;
using ShineEngine;
using UnityEngine;
using UnityEngine.UI;

/// <summary>
/// g层
/// </summary>
public class GMainLoginControl:MainLoginControl
{
	private InitLoadingUI _initLoading;

	protected override void callGAppMain(bool isForEditor)
	{
		if(CommonSetting.clientNeedHotfix)
		{
			if(isForEditor)
			{
				HGameApp.mainForEditor();
			}
			else
			{
				HGameApp.main();
			}
		}
		else
		{
			Ctrl.throwError("不该走到的分支");
		}
	}

	protected override void stepShowLogo()
	{
		if(!BaseSetting.needShowLogo)
		{
			_stepTool.completeStep(ShowLogo);
			return;
		}


		Transform logo=ShineSetup.getRoot().transform.GetChild(0);
		logo.gameObject.SetActive(true);

		Image component=logo.transform.Find("image").GetComponent<Image>();
		Color color=component.color;
		color.a=0f;
		component.color=color;

		TimeDriver.instance.setTimeOut(()=>
		{
			Tween.normal.create(0f,1f,1000,v=>
			{
				color.a=v;
				component.color=color;
			},()=>
			{
				TimeDriver.instance.setTimeOut(()=>
				{
					Tween.normal.create(1f,0f,1000,v=>
					{
						color.a=v;
						component.color=color;
					},()=>
					{
						//直接销毁
						GameObject.Destroy(logo.gameObject);

						_stepTool.completeStep(ShowLogo);
					});
				},1600);
			});
		},800);

	}

	protected override void stepShowLoading()
	{
		// _initLoading=new InitLoadingUI();
		// _initLoading.initAndShow();

		_stepTool.completeStep(ShowLoading);
	}
}