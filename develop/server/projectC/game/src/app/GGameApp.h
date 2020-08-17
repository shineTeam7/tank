#pragma once
#include "SInclude.h"
#include "app/GameApp.h"

class GGameApp :public GameApp
{
public:

protected:
	void makeControls() override;
	GameFactoryControl* createFactoryControl() override;
};
