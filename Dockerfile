FROM alpine/git as clone 
WORKDIR /app
RUN git clone https://Spring_Codecommit_user-at-456589935098@git-codecommit.us-east-1.amazonaws.com/v1/repos/SpringDemo_Codecommit

FROM maven:3.5-jdk-8-alpine as build 
WORKDIR /app
COPY --from=clone /app/springdemo /app 
RUN mvn install

FROM openjdk:8-jre-alpine
WORKDIR /app
COPY --from=build /app/target/springdemo-0.0.1-SNAPSHOT.jar /app
CMD ["java -jar springdemo-0.0.1-SNAPSHOT.jar"]