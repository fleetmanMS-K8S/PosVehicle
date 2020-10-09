FROM openjdk:8-jdk-alpine
COPY target/ms-vehicle-0.0.1-SNAPSHOT.jar trackerfetch.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","trackerfetch.jar"]