FROM openjdk:17-jdk-slim
WORKDIR /app
COPY target/walmart-app-1.0.0.jar walmart-app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","walmart-app.jar"]
