FROM eclipse-temurin:17-jdk-alpine
MAINTAINER Tássio Moraes
COPY target/api-tabela-unificada-sigtap-0.0.1-SNAPSHOT.jar api_procedimentos.jar
ENTRYPOINT ["java","-jar","/app.jar"]