FROM openjdk:11
COPY ./target/mavenDemo-1.0-SNAPSHOT.jar ./
WORKDIR ./
CMD ["java", "-jar", "calculator_devops-1.0-SNAPSHOT.jar "]