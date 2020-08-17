cd `dirname $0`
cd ../project;
#mvn clean;
mvn package;
mv -f all/target/all-0.0.1-SNAPSHOT-jar-with-dependencies.jar ../bin/jar/game.jar