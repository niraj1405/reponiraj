FROM openjdk:17
WORKDIR /APP
COPY Certificate.txt /APP
COPY ./target/WebApp.jar /APP
EXPOSE 8081
CMD [ "java", "-jar","WebApp.jar"]