FROM ubuntu:latest AS build

RUN apt-get update
RUN apt-get install openjdk-17-jdk -y
COPY . .

FROM maven:3.8-openjdk-17
RUN mvn clean install


FROM openjdk:17-jdk-slim

EXPOSE 8080
COPY --from=build /target/sgme.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]