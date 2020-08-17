cd `dirname $0`
cd ../jar
java --illegal-access=deny -server -jar client.jar 192.168.3.111 1 robotB 12_1 1000
pause