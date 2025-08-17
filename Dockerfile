FROM openjdk:11-jdk-slim
WORKDIR /app
COPY target/dockerized-app.jar app.jar
EXPOSE 8080
CMD ["java", "-jar", "app.jar"]
