FROM openjdk:8-jre-slim

WORKDIR /app

EXPOSE 8080

COPY target/rest-api-docker-kubernetes-0.0.1-SNAPSHOT.jar /app

ENTRYPOINT ["java", "-jar", "rest-api-docker-kubernetes-0.0.1-SNAPSHOT.jar"]
