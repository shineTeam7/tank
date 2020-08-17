ps -ef |grep game.jar |grep -v grep |awk '{print $2}'|xargs kill
echo OK
