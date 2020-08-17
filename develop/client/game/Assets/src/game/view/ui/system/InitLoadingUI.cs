using System;
using ShineEngine;
using UnityEngine;
using UnityEngine.UI;

/// <summary>
///
/// </summary>
public class InitLoadingUI:NatureUIBase
{
	private Image _loadingImage;

	private Text _txt;

	private bool _isBlinking=false;

	private int _timeOutIndex=-1;

	private TweenBase<float> _tween;

	private Color _color;

	protected override GameObject getGameObject()
	{
		return ShineSetup.getRoot().transform.GetChild(1).gameObject;
	}

	protected override void onInit()
	{
		base.onInit();

		Transform transform=_gameObj.transform;

		_loadingImage=transform.Find("loading").GetComponent<Image>();
		_txt=transform.Find("txt").GetComponent<Text>();

		_color=_loadingImage.color;
	}

	protected override void onShow()
	{
		base.onShow();

		showBlink();
	}

	private void showBlink()
	{
		if(_tween!=null)
			return;

		_tween=Tween.normal.createTween(1f,0.2f,1000,v=>
		{
			_color.a=v;
			_loadingImage.color=_color;
		},null,EaseType.InQuad).setRecycle(true);

	}

	private void stopBlink()
	{
		if(_tween==null)
			return;

		Tween.normal.kill(_tween.index);
		_tween=null;
	}
}