FROM java:8
EXPOSE 8080:8080
ADD /target/dockertest-demo.jar dockertest-demo.jar
ENTRYPOINT ["java","-jar","dockertest-demo.jar"]
