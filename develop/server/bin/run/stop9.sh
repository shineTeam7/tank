ps -ef |grep game.jar |grep -v grep |awk '{print $2}'|xargs kill -9
echo OK