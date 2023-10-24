# Použijeme oficiální obraz pro Java 17
FROM openjdk:17-alpine

# Argumenty pro nastavení proměnných v kontejneru
ARG JAR_FILE=target/*.jar

# Kopírujeme jar soubor aplikace do kontejneru
COPY ${JAR_FILE} app.jar

# Příkaz pro spuštění aplikace
ENTRYPOINT ["java", "-jar", "/app.jar"]
