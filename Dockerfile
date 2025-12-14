# Use Java 17 (required for Spring Boot 3)
FROM eclipse-temurin:17-jdk

# Set working directory
WORKDIR /app

# Copy project files
COPY . .

# Build the application
RUN ./mvnw clean package -DskipTests || mvn clean package -DskipTests

# Expose port
EXPOSE 8080

# Run the Spring Boot app
CMD ["sh", "-c", "java -jar target/*.jar"]
