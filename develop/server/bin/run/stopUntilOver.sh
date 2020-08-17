ps -ef |grep game.jar |grep -v grep |awk '{print $2}'|xargs kill

while :
do

v0=$(ps -ef |grep game.jar |grep -v grep |awk '{print $2}')
if [[ "$v0" == "" ]]
then
    break
fi

sleep 0.05
done

echo OK
