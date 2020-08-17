cd `dirname $0`
cd ../jar
java --illegal-access=deny -jar dbUpdate.jar dbUpdate
pause