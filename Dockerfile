FROM alpine/git as clone 
WORKDIR /app
RUN git clone https://github.com/romamk272/firstspringdemo.git

FROM maven:3.5-jdk-8-alpine as build 
WORKDIR /app/firstspringdemo
COPY --from=clone /app/firstspringdemo /app/firstspringdemo
RUN mvn install

FROM openjdk:8-jre-alpine
WORKDIR /app
COPY --from=build /app/firstspringdemo/target/springdemo-0.0.1-SNAPSHOT.jar /app
CMD ["java -jar springdemo-0.0.1-SNAPSHOT.jar"]
