# FROM openjdk:17-jdk-alpine
# ARG JAR_FILE=target/*.jar
# COPY ${JAR_FILE} app.jar
# ENTRYPOINT ["java","-jar","/app.jar"]




FROM amazoncorretto:17-alpine-jdk

MAINTAINER emaaristimuno

COPY target/PDS-0.0.1-SNAPSHOT.jar PDS-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","/PDS-0.0.1-SNAPSHOT.jar"]