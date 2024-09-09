#!/usr/bin/env bash
mvn clean package -DskipTests
PATH_TO_APP="/mnt/c/Users/maxime/Documents/Workspace/Repository/Service1/Service1"
java -javaagent:$PATH_TO_APP/opentelemetry-javaagent.jar \
      -Dotel.service.name=service1 \
      -Dotel.traces.exporter=otlp \
      -Dotel.metrics.exporter=console \
       -jar $PATH_TO_APP/target/Service1-0.0.1-SNAPSHOT.jar