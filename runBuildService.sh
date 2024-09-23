#!/usr/bin/env bash
mvn clean package -DskipTests
PATH_TO_APP="/mnt/c/Users/maxime/Documents/Workspace/Repository/Service1/Service1"
java -javaagent:$PATH_TO_APP/src/main/jib/opentelemetry-javaagent.jar \
      -Dotel.service.name=service1 \
      -Dotel.traces.exporter=otlp \
      -Dotel.logs.exporter=otlp \
       -jar $PATH_TO_APP/target/Service1-0.0.1-SNAPSHOT.jar