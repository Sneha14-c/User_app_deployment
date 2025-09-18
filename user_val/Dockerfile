# build stage
FROM maven:3.9.9-eclipse-temurin-21 AS build
WORKDIR /src
COPY user_val/pom.xml .
RUN mvn -q -DskipTests dependency:go-offline
COPY user_val/src ./src
RUN mvn -q -DskipTests package

# run stage
FROM eclipse-temurin:21-jre
WORKDIR /app
COPY --from=build /src/target/*.war app.war
EXPOSE 8080
ENTRYPOINT ["sh","-c","java -Dserver.port=${PORT:-9900} -jar app.war"]