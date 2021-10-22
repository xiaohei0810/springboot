FROM java:8
MAINTAINER Xiaohei

# 统一容器与服务器时间
ENV TZ=Asia/Shanghai
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone

#复制当前项目target/spring-boot-demo.jar到容器中
COPY ./target/SpringBootDemo2-0.0.1-SNAPSHOT.jar /app.jar
EXPOSE 8080

ENTRYPOINT ["java","-jar","/app.jar"]