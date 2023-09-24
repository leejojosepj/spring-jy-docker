FROM openjdk:17
EXPOSE 8080
ADD target/spring-jy-docker.jar spring-jy-docker.jar 
ENTRYPOINT ["java","-jar","/spring-jy-docker.jar"]