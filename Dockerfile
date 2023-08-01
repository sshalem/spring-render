FROM openjdk:11-jdk-slim
VOLUME /tmp
COPY target/*.jar Render-app.jar
ENTRYPOINT ["java","-jar","/Render-app.jar"]
EXPOSE 8080
