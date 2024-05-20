FROM openjdk:17-jdk

WORKDIR /app
COPY target/*.jar /app/bookstore.jar
EXPOSE 8080
CMD ["java", "-jar", "bookstore.jar"]