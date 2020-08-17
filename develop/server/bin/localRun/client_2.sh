cd `dirname $0`
cd ../jar
java --illegal-access=deny -server -jar client.jar 127.0.0.1 1 robotC 12_1 1000
pause