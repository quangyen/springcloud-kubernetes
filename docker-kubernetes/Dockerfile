FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY target/docker-kubernetes-1.0.jar app.jar
ENV JAVA_OPTS=""
ENTRYPOINT exec java -jar /app.jar --debug