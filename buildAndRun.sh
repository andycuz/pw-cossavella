#!/bin/sh
mvn clean package && docker build -t com.mycompany/pw-cossavella .
docker rm -f pw-cossavella || true && docker run -d -p 8080:8080 -p 4848:4848 --name pw-cossavella com.mycompany/pw-cossavella 
