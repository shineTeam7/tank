#include "GJavaExportMethod.h"
#include "../app/GGameApp.h"

void Java_com_home_base_extern_GExternMethodNative_init
(JNIEnv* env, jclass cls)
{
	GGameApp* app = new GGameApp();
	app->start();
}
