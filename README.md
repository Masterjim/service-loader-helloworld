# Service Loader Hello World
This is a project to learn how the java service loader works. See https://docs.oracle.com/javase/9/docs/api/java/util/ServiceLoader.html.

## How to run
1. ```mvn package```
2. ```java -jar service-client\target\service-client-1.0.0-SNAPSHOT.jar```

## How it works
The service loader scans all the META-INF/services directories from the jars included in the classpath to find the files identified by 
the fully qualified name of the service interface to load. These files contain the fully qualified name of the service providers to load.