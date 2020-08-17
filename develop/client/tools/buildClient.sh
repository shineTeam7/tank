cd `dirname $0`

unityPath='/Applications/Unity/2019.2.17f1/Unity.app/Contents/MacOS/Unity'
projectPath='/Users/sunming/E/home/tankGit/develop/client/game'
logPath='/Users/sunming/E/home/tankGit/develop/client/log.log'

$unityPath -projectPath $projectPath -quit -batchmode -executeMethod ShineEditor.PackControl.buildOneKey -logFile $logPath
