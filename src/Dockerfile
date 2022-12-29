FROM openjdk:19-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]




# FROM amazoncorretto:17-alpine-jdk

# MAINTAINER emaaristimuno

# COPY target/BackEndDavidSoto-YOUR-FILE-BUILD-SPRINGBOOT.jar BackEndDavidSoto-YOUR-FILE-BUILD-SPRINGBOOT.jar

# ENTRYPOINT ["java","-jar","/BackEndDavidSoto-YOUR-FILE-BUILD-SPRINGBOOT.jar"]