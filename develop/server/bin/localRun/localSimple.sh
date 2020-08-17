cd `dirname $0`
cd ../jar
java --illegal-access=deny -server -javaagent:agent.jar -jar game.jar localSimpleT
pause