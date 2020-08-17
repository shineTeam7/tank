//#include <iostream>
//#include "app/GGameApp.h"
//#include "extern/ExportForUnity.h"

#include "SInclude.h"
#include "extern/ExportCall.h"


#include "bytes/BytesReadStream.h"
#include "bytes/BytesWriteStream.h"
#include "global/ShineSetting.h"
#include "utils/FileUtils.h"
#include "navmesh/NavMesh.h"
#include "global/ShineGlobal.h"
#include "global/ShineToolGlobal.h"
#include "global/ShineToolSetup.h"
#include "support/collection/SList.h"
#include "support/collection/SMap.h"
#include "app/GGameApp.h"
#include "support/collection/SSet.h"
#include <vector>

void _exportCall()
{
	c_exportCall();
}

void testStr2(char const* str)
{
	//printf(str);

	ostringstream sb;
	sb << str;
	sb << '\n';

	printf(sb.str().c_str());

	//auto ts = sb.str();
	//printf(ts.c_str());
}

void testStringStream()
{
	const char* cc = "123";

	ostringstream sb;
	sb << cc;
	sb << '\n';
}

void testStream()
{
	Ctrl::print("AB");

	BytesWriteStream* ws = new BytesWriteStream();
	BytesReadStream* rd = new BytesReadStream();

	printf("size %zd %zd", sizeof(int), sizeof(long));

	ws->writeInt(123123);
	ws->writeInt(2147000000);
	ws->writeUTF("asdasd");
	ws->writeShort(32767);
	ws->writeLong(21470000000000L);
	ws->writeFloat(1.2345f);

	rd->setBuf(ws->getBuf(), ws->length());

	int a1 = rd->readInt();
	int a2 = rd->readInt();
	string a3 = rd->readUTF();
	int a4 = rd->readShort();
	int64 a5 = rd->readLong();
	float a6 = rd->readFloat();

	printf("result %d %d %s %d %lld %f", a1, a2, a3.c_str(), a4, a5, a6);
}

void testExport()
{
	ShineToolSetup::init();

	NavMesh nav;
	nav.exportNav((ShineToolGlobal::mapInfoPath + "/test/config.bin").c_str(), (ShineToolGlobal::mapInfoPath + "/test/data.bin").c_str(), (ShineToolGlobal::mapInfoPath + "/test/out.bin").c_str());
}

int main()
{
	//testExport();

	//GGameApp* app = new GGameApp();
	//app->start();


	SMap<int, int>* map = (new SMap<int, int>())->setDefaultValue(0);
	int re = map->get(1);

	print("A %d", re);
}
