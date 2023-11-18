# OpenJDK 17 Image
FROM openjdk:17

# Set the working directory in the container to /app
WORKDIR /app

# Copy the jar file to the container
COPY build/libs/user-service-0.0.1-SNAPSHOT.jar /app/user-service.jar

# Set the port that will be exposed by the container
EXPOSE 8080

# Set the command to be run when the container is started
CMD ["java", "-jar", "user-service.jar"]
