FROM openjdk:8-jdk-alpine

WORKDIR /app

# The application's jar file
ARG JAR_FILE=target/EmployeeService-*.jar

# Add the application's jar to the container
ADD ${JAR_FILE} EmployeeService.jar

EXPOSE 8090

ENTRYPOINT ["java", "-jar", "/app/EmployeeService.jar"]