FROM eclipse-temurin:21-jdk-alpine

WORKDIR /app

# Copy Maven wrapper
COPY ./mvnw .
COPY ./.mvn .mvn

# Copy project files
COPY ./pom.xml .
COPY ./src ./src

# Give executable permissions to mvnw
RUN chmod +x mvnw

# Build project (this creates target/*.jar)
RUN ./mvnw package -DskipTests

# Run the JAR from the container's target folder
ENTRYPOINT ["java", "-jar", "target/SimpleConfessions-0.0.1-SNAPSHOT.jar"]