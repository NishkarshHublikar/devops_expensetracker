FROM openjdk:17
WORKDIR /app
COPY target/expense-tracker-1.0-SNAPSHOT-jar-with-dependencies.jar app.jar
ENTRYPOINT ["java", "-cp", "app.jar", "com.expense.App"]
