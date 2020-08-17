sqlpath=$(cd `dirname $0`; pwd)/../../save/sql/

mysql limitlesscenter < ${sqlpath}truncateCenter.sql
echo "数据库 limitlesscenter 清库成功"

dbs=`mysql -N -e "show databases like 'limitlessgame_%';"`
for i in $dbs
do
	mysql $i < ${sqlpath}truncateGame.sql
	echo "数据库 "$i" 清库成功"
done

echo "执行完毕！"
