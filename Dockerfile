FROM jeanblanchard/java:8

COPY target/first-docker-demo.jar first-docker-demo.jar

CMD java -jar first-docker-demo.jar


