package com.microservices.twitterToKafka.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@ConfigurationProperties(prefix = "twitter-to-kafka-service")
public class TwitterToKafkaConfigData {
    private List<String> twitterKeywords;


    public List<String> getTwitterKeywords() {
        return twitterKeywords;
    }

    public void setTwitterKeywords(List<String> twitterKeywords) {
        this.twitterKeywords = twitterKeywords;
    }
}
