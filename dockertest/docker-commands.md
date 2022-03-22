Commands:

mvn clean install

docker build -t dockertest-demo .  ---> build the container

docker run -p 8080:8080 dockertest-demo ---> run the container

-----------------------------------------

docker ps -aq   --- recent docker containers

docker rm <container> ---> remove container

docker images ---> available docker images