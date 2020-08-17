cd `dirname $0`
cd ../jar
java -Dfile.encoding=UTF-8 --illegal-access=deny -server -javaagent:agent.jar -jar game.jar localSimpleT
pause