# Use a base image with Java 17
FROM openjdk:17-jdk-slim

# Set the working directory
WORKDIR /app

# Copy the jar file into the container
COPY target/Backend-0.0.1-SNAPSHOT.jar /app/Backend.jar

# Expose the port the app will run on
EXPOSE 8080

# Run the app
CMD ["java", "-jar", "Backend.jar"]


