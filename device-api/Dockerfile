FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar
ADD ${JAR_FILE} devicemgmt.jar
ENTRYPOINT ["java","-jar","/devicemgmt.jar"]