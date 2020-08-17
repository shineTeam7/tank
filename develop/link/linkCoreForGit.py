#!/usr/bin/env python 
# -*- coding: utf-8 -*-

from __future__ import print_function
import ctypes, sys
import shine
import os

#0:标准,1:laya,2:无客户端
eType=0
if len(sys.argv)>1:
	eType=int(sys.argv[1])

#linkPath : corePath
pathDic={}

#common
pathDic['/common/commonConfig']='/common/commonConfig'
pathDic['/common/data/commonData']='/common/data/commonData'
pathDic['/common/data/shineData']='/common/data/shineData'

#docs
pathDic['/docs/commonDocs']='/docs'

#client
if eType==0:
	#client editor
	pathDic['/client/game/Assets/Editor/shine']='/client/game/Editor/shine'
	pathDic['/client/game/Assets/Editor/shineLib']='/client/game/Editor/shineLib'
	pathDic['/client/game/Assets/Editor/commonGame']='/client/game/Editor/commonGame'

	#client game
	pathDic['/client/game/Assets/src/shine']='/client/game/src/shine'
	pathDic['/client/game/Assets/src/shineLib']='/client/game/src/shineLib'
	pathDic['/client/game/Assets/src/commonGame']='/client/game/src/commonGame'

	#client source
	pathDic['/client/game/Assets/source/commonGame']='/client/game/source/commonGame'
#laya
elif eType==1:
	#client game
	pathDic['/client/game/src/shine']='/clientLaya/game/src/shine'
	pathDic['/client/game/src/commonGame']='/clientLaya/game/src/commonGame'



#server
#server clientProject
pathDic['/server/clientProject/commonClient']='/server/clientProject/commonClient'
#server gmClientProject
pathDic['/server/gmClientProject/commonGMClient']='/server/gmClientProject/commonGMClient'
	
#server project
pathDic['/server/project/shine']='/server/project/shine'
pathDic['/server/project/commonBase']='/server/project/commonBase'
pathDic['/server/project/commonSceneBase']='/server/project/commonSceneBase'
pathDic['/server/project/commonCenter']='/server/project/commonCenter'
pathDic['/server/project/commonGame']='/server/project/commonGame'
pathDic['/server/project/commonLogin']='/server/project/commonLogin'
pathDic['/server/project/commonManager']='/server/project/commonManager'
pathDic['/server/project/commonScene']='/server/project/commonScene'


#server projectC
pathDic['/server/projectC/shine']='/server/projectC/shine'
pathDic['/server/projectC/shineLib']='/server/projectC/shineLib'
pathDic['/server/projectC/commonGame']='/server/projectC/commonGame'

#server toolProject
pathDic['/server/toolProject/shine8']='/server/toolProject/shine8'
pathDic['/server/toolProject/shineTool']='/server/toolProject/shineTool'
pathDic['/server/toolProject/commonTool']='/server/toolProject/commonTool'

#server tools
pathDic['/server/tools']='/server/tools'


#tools
pathDic['/server/toolsMac/jar/tools.jar']='/server/tools/jar/tools.jar'




if shine.is_admin():
	os.chdir(os.path.dirname(os.getcwd()))
	corePath = shine.input_path("请输入core目录的路径")
	
	n=len(corePath);
	if corePath[n-4:n]!="core":
		print("must input corePath!!")
	else:
		if not os.path.isdir(corePath):
			print("corePath is not exist")
		else:
			rootPath = os.getcwd()
			
			if not os.path.exists(rootPath+'/server/toolsMac/jar'):
				os.mkdir(rootPath+'/server/toolsMac/jar')

			shine.link_dir(pathDic, corePath, rootPath)
	
	os.system("pause")
else:
	if shine.is_python3():
		ctypes.windll.shell32.ShellExecuteW(None, "runas", sys.executable, __file__, None, 1)
	else:#in python2.x
		ctypes.windll.shell32.ShellExecuteW(None, u"runas", unicode(sys.executable), unicode(__file__), None, 1)
