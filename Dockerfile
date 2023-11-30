FROM openjdk:17-jdk-alpine
COPY target/redis-spring-boot-0.0.1-SNAPSHOT.jar redis-spring-boot-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/redis-spring-boot-0.0.1-SNAPSHOT.jar"]