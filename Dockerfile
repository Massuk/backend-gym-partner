FROM openjdk:19
VOLUME /tmp
EXPOSE 8080
ARG JAR_FILE=target/gym-partner-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} gym-partner.jar
ENTRYPOINT ["java","-jar","/gym-partner.jar"]