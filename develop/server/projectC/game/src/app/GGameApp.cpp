#include "GGameApp.h"
#include "../control/GGameFactoryControl.h"


void GGameApp::makeControls()
{
	GameApp::makeControls();
}

GameFactoryControl* GGameApp::createFactoryControl()
{
	return new GGameFactoryControl();
}
