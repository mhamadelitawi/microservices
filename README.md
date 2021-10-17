# Microservices

In this repo I am trying to implement a microservices architecture by using spring boot, kafka and elasticsearch with patterns and with an event-driven approach.


> **The repo is under construction currently** 

Modules Architecture 
=============
#### **1- app-config-data**
Mainly used to read the custom configuration files and inject them where needed

#### **2- common-config**
It contains common packages and functions. It's separated into a different module to reuse it easily in many modules. 

#### **3- kafka**
Contains all the submodules responsible of managing the communication with kafka like testing health, produce and consume.

#### **4- twitter-to-kafka-service**
the microservice is used to get tweets from twitter (credentials from your twitter developer account should be set in the `twitter4j.properties` file). 
A mock runner is already implemented in case you don't need to use twitter. 
To enable or disable the mock server modify `enable-mock-tweets` in `application.yml`



Samples
=============

In addition this repo will be used a sample to show:
- Multi module spring boot project
- Reusable module 
- Autowire injection 
- Constructor injection 
- Multi properties configuration files
- Conditional properties with match if missing
- Usage of yml files
- Implementing and formatting logs (slf4j.Logger)
- Usage of implementation 
- Custom exception
- Date format
- Add repository to Maven
- Asynchronous call


Useful links
=============

- Twitter 4J : unofficial Java library for the Twitter API (https://twitter4j.org)
- Lombok : A java library that automatically plugs into editor and build tools. It add by example getter and setter automatically.
- Lorem ipsum : get random words and texts (https://www.lipsum.com)
- kafkacat: A command line utility to test and debug Apache Kafka deployments (https://docs.confluent.io/4.0.0/app-development/kafkacat-usage.html)
- Avro: A a row-oriented remote procedure call and data serialization framework. It uses JSON for defining data types and protocols, and serializes data in a compact binary format (https://avro.apache.org/)
- Spring-retry: Give ability to automatically re-invoke a failed operation (https://docs.spring.io/spring-batch/docs/current/reference/html/retry.html)
- Spring WebFlux : A parallel version of Spring MVC and supports fully non-blocking reactive streams (https://docs.spring.io/spring-framework/docs/current/reference/html/web-reactive.html)
- Kafka-Avro-Seralizer : it keeps a cache of registered schemas from the Schema Registry their schema IDs. (https://docs.confluent.io/platform/current/schema-registry/serdes-develop/serdes-avro.html)


Side notes
=============
#### **Keys and configurations**

Keys shouldn't be submitted to github. that's why it's good to encrypt them using a key. This key should be saved in environment varibale but here it's saved in bootstraps files in (twitter-to-kafka-service/src/main/resources/bootstrap.yml and config-server/src/main/resources/bootstrap.yml ).

Following is an example how to add them as environment variable on mac
`export ENCRYPT_KEY='itawi'` you can also add them to `~/.zprofile` or `~/.bash_profile`. 

`echo 'export ENCRYPT_KEY='itawi' >> ~/.bash_profile'`
`echo 'export ENCRYPT_KEY='itawi' >> ~/.zshenv'`

you can get an encrypted password using this key by attempting : `http://localhost:8888/encrypt` 

#### **Keys and configurations**
The shell file in `docker-compose` folder needs execution permission
chmod +x check-config-server-started.sh