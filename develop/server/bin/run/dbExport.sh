#!/bin/bash
read -p "请输入game服数量：" num

flag=true
while $flag
do
	if [ -z "$(echo $num | sed 's#[0-9]##g')" ];then
		flag=false 
	else
		echo "数量不对！请输入正确的数量。"
		read -p "请输入game服数量：" num
	fi
done

sqlpath=$(cd `dirname $0`; pwd)/../../save/sql/

mysql < ${sqlpath}center.sql

for i in `seq 1 $num`
do
	cat ${sqlpath}game_1.sql | sed 's/limitlessgame_1/limitlessgame_'$i'/g' | mysql
done

echo "执行成功！已生成 "$num" 个game服以及center服"

