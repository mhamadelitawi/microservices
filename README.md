# Microservices

In this repo I am trying to implement a microservices architecture by using spring boot, kafka and elasticsearch with patterns and with an event-driven approach.


> **The repo is under construction currently** 

Modules Architecture 
=============
#### **1- app-config-data**
It contains the custom configuration module data. It's separated into a different module to reuse it easily in many modules.

#### **2- twitter-to-kafka-service**
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

Useful links
=============

- Twitter 4J : unofficial Java library for the Twitter API (https://twitter4j.org)
- Lorem ipsum : get random words and texts (https://www.lipsum.com)
- kafkacat: A command line utility to test and debug Apache Kafka deployments (https://docs.confluent.io/4.0.0/app-development/kafkacat-usage.html)
- Avro: A a row-oriented remote procedure call and data serialization framework. It uses JSON for defining data types and protocols, and serializes data in a compact binary format (https://avro.apache.org/)
