mvn clean package docker:build
ehco "当前docker镜像:"
docker images
ehco "启动容器:========>"
docker ps -a

#docker stop webdemo-8452
#docker rm -f webdemo-8452
docker run  -p 8452:8452 -d dockerspringboot

ehco "启动服务成功"