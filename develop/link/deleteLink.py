#!/usr/bin/env python 
# -*- coding: utf-8 -*-

from __future__ import print_function
import shine
import os
import sys

#0:标准,1:laya,2:无客户端
eType=0
if len(sys.argv)>1:
	eType=int(sys.argv[1])

pathDic=[]

#common
pathDic.append('/common/commonConfig')
pathDic.append('/common/data/commonData')
pathDic.append('/common/data/shineData')
	
#docs
pathDic.append('/docs/commonDocs')

#client
if eType==0:
	#client editor
	pathDic.append('/client/game/Assets/Editor/shine')
	pathDic.append('/client/game/Assets/Editor/shineLib')
	pathDic.append('/client/game/Assets/Editor/commonGame')
	
	#client game
	pathDic.append('/client/game/Assets/src/shine')
	pathDic.append('/client/game/Assets/src/shineLib')
	pathDic.append('/client/game/Assets/src/commonGame')
	pathDic.append('/client/game/Assets/src/hotfix')

	#client source
	pathDic.append('/client/game/Assets/source/commonGame')
#laya
elif eType==1:
	pathDic.append('/client/game/src/shine')
	pathDic.append('/client/game/src/commonGame')


#server clientProject
pathDic.append('/server/clientProject/commonClient')
#server gmClientProject
pathDic.append('/server/gmClientProject/commonGMClient')

#server project
pathDic.append('/server/project/shine')
pathDic.append('/server/project/commonBase')
pathDic.append('/server/project/commonSceneBase')
pathDic.append('/server/project/commonCenter')
pathDic.append('/server/project/commonGame')
pathDic.append('/server/project/commonLogin')
pathDic.append('/server/project/commonManager')
pathDic.append('/server/project/commonScene')


#server toolProject
pathDic.append('/server/toolProject/shine8')
pathDic.append('/server/toolProject/shineTool')
pathDic.append('/server/toolProject/commonTool')

#server tools
pathDic.append('/server/tools')

#tools
pathDic.append('/server/toolsMac/jar/tools.jar')



if __name__ == '__main__':
	os.chdir(os.path.dirname(os.getcwd()))
	rootPath = os.getcwd()
	for path in pathDic:
		print('delete ', rootPath + path)
		shine.del_dir(rootPath + path)
	
	os.system("pause")
