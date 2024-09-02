# Use an official OpenJDK image as the base image
FROM openjdk:17-jdk-alpine

# Set the working directory inside the container
WORKDIR /app

# Copy the packaged jar file into the container
COPY VikingsDemo/target/VikingsDemo-0.0.1-SNAPSHOT.jar /app/VikingsDemo.jar

# Expose the port the application will run on
EXPOSE 8080

# Set the entry point to run the jar file
ENTRYPOINT ["java", "-jar", "VikingsDemo.jar"]