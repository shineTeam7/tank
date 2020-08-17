cd ../jar

if [ ! -d "../log" ];then
	mkdir ../log
fi

printPath="../log/print"

if [ ! -d $printPath ];then
	mkdir $printPath
fi

runOne()
{
	java --illegal-access=deny -server -javaagent:agent.jar -XX:+UseG1GC -Xlog:gc -Xms$3M -Xmx$3M -jar game.jar $1 $2 > $printPath/$1_$2.log & 
	echo $! > ../run/$1.pid
}

runOne manager 1 512
runOne center 1 1024
runOne login 1 512
runOne game 1 2048
echo OK!