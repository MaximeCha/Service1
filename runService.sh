#!/usr/bin/env bash
java -javaagent:./opentelemetry-javaagent.jar \
      -Dotel.service.name=service1 \
      -Dotel.traces.exporter=otlp \
       -jar ./target/Service1-0.0.1-SNAPSHOT.jar
