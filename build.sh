mvn clean

mvn package -DskipTests

docker rmi -f xiaohei555/webdemo:1.0

mvn dockerfile:build

docker images