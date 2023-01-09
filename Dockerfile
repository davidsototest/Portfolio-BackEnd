
FROM amazoncorretto:19

MAINTAINER emaaristimuno

COPY target/PDS-0.0.1-SNAPSHOT.jar PDS-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","/PDS-0.0.1-SNAPSHOT.jar"]