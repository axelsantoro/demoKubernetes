#Para crear un volumen donde se van a guardar las dependencias de gradle
#docker volume create --name gradle-cache
#docker run --rm -v gradle-cache:/home/gradle/.gradle -v "$PWD":/home/gradle/project -w /home/gradle/project gradle:4.7.0-jdk8-alpine gradle build
#ls -ltrh ./build/libs

# Use an image
FROM openjdk:8

ENV APP_HOME=/usr/demo/

# Set the working directory to /demo
WORKDIR $APP_HOME

COPY ./build/libs/* ./demo.jar

#Expose port 80
EXPOSE 8080

# Run command when the container launches
CMD ["java","-jar","demo.jar"]