# Indica la imagen base que se utilizará para construir la imagen de Docker
FROM adoptopenjdk:11-jdk-hotspot

# Establece el directorio de trabajo en la imagen de Docker
WORKDIR /app

# Copia el archivo JAR generado por tu proyecto a la imagen de Docker
COPY target/personaGenRest-0.0.1-SNAPSHOT.jar app.jar

# Expone el puerto en el que tu aplicación se ejecuta (si es necesario)
EXPOSE 8080

# Define el comando que se ejecutará cuando se inicie un contenedor basado en esta imagen
CMD ["java", "-jar", "app.jar"]