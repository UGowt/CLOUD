FROM eclipse-temurin:17
COPY target/cloud.jar cloud.jar
CMD [ "java","-jar","cloud.jar" ]