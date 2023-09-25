#Docker Basics
https://medium.com/@leejojosepj_76404/docker-basics-72d1bbbb50bc

# spring-jy-docker
Docker File example 

# To Build Image
docker build -t spring-jy-docker.jar .

# To List new images
docker images

# To Run Container
docker run -p 9091:8080 spring-jy-docker.jar

Access  http://localhost:9091/season
