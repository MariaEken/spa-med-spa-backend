# --- 1. Byggfas: packa jar med Maven ---
    FROM maven:3.9.9-eclipse-temurin-21-jammy AS builder
    WORKDIR /app
    
    # Kopiera endast pom + källkod för snabbare cache
    COPY pom.xml .
    COPY src ./src
    
    # Bygg fat-jar utan tester
    RUN mvn clean package -DskipTests
    
    # --- 2. Körfas: kör den paketerade jar:en ---
    FROM eclipse-temurin:21-jre-jammy
    WORKDIR /app
    
    # Kopiera över den färdiga jar:en från byggcontainern
    COPY --from=builder /app/target/*.jar app.jar
    
    # Exponera samma port som Spring Boot använder
    EXPOSE 8080
    
    # Starta applikationen
    ENTRYPOINT ["java", "-jar", "app.jar"]