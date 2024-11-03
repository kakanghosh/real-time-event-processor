FROM openjdk:17-jdk-alpine

WORKDIR /app

COPY EventProducerWeb/target/EventProducerWeb-*-SNAPSHOT.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]
