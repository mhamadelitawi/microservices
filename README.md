# Microservices

In this repo I am trying to implement a microservices architecture by using spring boot, kafka and elasticsearch with patterns and with an event-driven approach.


> **The repo is under construction currently** 

Architecture 
=============
- twitter-to-kafka-service : the microservice is used to get tweets from twitter (credentials from your twitter developer account should be set in the `twitter4j.properties` file). 
 A mock runner is already implemented in case you don't need to use twitter. 
 To enable or disable the mock server modify `enable-mock-tweets` in `application.yml`



Samples
=============

In addition this repo will be used a sample to show:
- Multi module spring boot project
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

name: Twitter 4J
Usage: unofficial Java library for the Twitter API
Link https://twitter4j.org

name: Lorem ipsum 
Usage: get random words and texts
Link: https://www.lipsum.com
