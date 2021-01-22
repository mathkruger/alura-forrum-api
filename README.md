# Alura Forum API

An API for a forum. For studying purposes.

## Run compiled jar

To run the compiled jar, just execute this commando, after building:

`java -jar -DFORUM_DATABASE_URL=jdbc:h2:mem:alura-forum -DFORUM_DATABASE_USERNAME=sa -DFORUM_DATABASE_PASSWORD= -DFORUM_JWT_SECRET=123456 -Dspring.profiles.active=prod forum.jar`