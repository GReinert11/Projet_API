FROM eclipse-temurin:17-jdk-jammy
VOLUME /tmp
ADD target/ProjetAPI-0.0.1-SNAPSHOT.jar ProjetAPI-0.0.1-SNAPSHOT.jar
RUN bash -c 'touch /ProjetAPI-0.0.1-SNAPSHOT.jar'
ENTRYPOINT ["java","-jar", "ProjetAPI-0.0.1-SNAPSHOT.jar"]