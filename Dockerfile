FROM openjdk:8-jdk-alpine
COPY target/car-insurance-0.0.1-SNAPSHOT.jar car-insurance-0.0.1.jar
ENTRYPOINT ["java","-jar","/car-insurance-0.0.1.jar"]