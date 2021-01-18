FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY ./target/zxjy-register-1.0.0-SNAPSHOT.jar zxjy-register-1.0.0-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/zxjy-register-1.0.0-SNAPSHOT.jar", "&"]