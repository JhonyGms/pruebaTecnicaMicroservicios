FROM openjdk:11
MAINTAINER jhonatan garcia
VOLUME /tmp
COPY target/*.jar /restapi-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT java -jar restapi-0.0.1-SNAPSHOT.jar