FROM amazoncorretto:19-alpine-jdk

MAINTAINER emaaristimuno

COPY target/BackEndDavidSoto-YOUR-FILE-BUILD-SPRINGBOOT.jar BackEndDavidSoto-YOUR-FILE-BUILD-SPRINGBOOT.jar

ENTRYPOINT ["java","-jar","/BackEndDavidSoto-YOUR-FILE-BUILD-SPRINGBOOT.jar"]