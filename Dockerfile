FROM openjdk:17
VOLUME /tmp
EXPOSE 8081
COPY target/*.jar universal-app-docker.jar
ENTRYPOINT ["java","-jar","/universal-app-docker.jar"]