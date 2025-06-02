# Use a lightweight Java image
FROM openjdk:24

# Metadata
LABEL maintainer="devamkumar"
LABEL project="FlywayApp"

# Set working directory inside the container
WORKDIR /app

# Copy JAR file from the build output
COPY build/libs/FlywayApp-0.0.1-SNAPSHOT.jar app.jar

# Expose port (match your app's server.port)
EXPOSE 8083

# Default command to run your Spring Boot app
ENTRYPOINT ["java", "-jar", "app.jar"]
