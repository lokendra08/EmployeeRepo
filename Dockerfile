FROM openjdk:8-jdk-alpine

WORKDIR /app

# The application's jar file
ARG JAR_FILE=target/EmployeeService-*.jar

# Add the application's jar to the container
ADD ${JAR_FILE} EmployeeService.jar

EXPOSE 8090

RUN curl -fsSLO https://get.docker/builds/Linux/x86_64/docker-17.04.0-ce.tgz \
  && tar xzvf docker-17.04.0-ce.tgz \
  && mv docker/docker /usr/local/bin \
  && rm -r docker docker-17.04.0-ce.tgz

ENTRYPOINT ["java", "-jar", "/app/EmployeeService.jar"]