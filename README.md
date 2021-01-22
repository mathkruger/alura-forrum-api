# Alura Forum API

An API for a forum made with Spring Boot.

## Run compiled jar

To run the compiled jar, just execute this commando, after building:

`java -jar -DFORUM_DATABASE_URL=jdbc:h2:mem:alura-forum -DFORUM_DATABASE_USERNAME=sa -DFORUM_DATABASE_PASSWORD= -DFORUM_JWT_SECRET=123456 -Dspring.profiles.active=prod forum.jar`

If you want to run it on a docker container:
`docker build -t alura/forum .`

`docker run -p 8080:8080 -e SPRING_PROFILES_ACTIVE='prod' -e FORUM_DATABASE_URL=jdbc:h2:mem:alura-forum -e FORUM_DATABASE_USERNAME=sa -e FORUM_DATABASE_PASSWORD= -e FORUM_JWT_SECRET=123456 alura/forum`