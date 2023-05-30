# Use an OpenJDK base image
FROM openjdk:17-alpine

# Set the working directory inside the container
WORKDIR /app
ARG JAR_FILE=target/*.jar

# Copy the JAR file into the container
COPY ./target/musicAll-0.0.1-SNAPSHOT.jar app.jar

# Set the command to run the application
CMD ["java", "-jar", "app.jar"]

