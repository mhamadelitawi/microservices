package com.microservices.twitterToKafka;

import com.microservices.twitterToKafka.config.TwitterToKafkaConfigData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class TwitterToKafkaServiceApplication implements CommandLineRunner {

    private static final Logger LOG = LoggerFactory.getLogger(TwitterToKafkaServiceApplication.class);


    /*
     Benefits of using constructor injection over field injection:
     a.) Prevents using reflection
     b.) Forces the object to be created with the injected parameter
     c.) Lets to do the injection without using @Autowired annotation
     d.) Lets the injected field to be defines as final so that the it favours immutability
     */
    //It can be done also with the normal Autowired
    private final TwitterToKafkaConfigData twitterToKafkaConfigData;

    public TwitterToKafkaServiceApplication(TwitterToKafkaConfigData twitterToKafkaConfigData) {
        this.twitterToKafkaConfigData = twitterToKafkaConfigData;
    }


    public static void main(String[] args) {
        SpringApplication.run(TwitterToKafkaServiceApplication.class , args);
    }




    @Override
    public void run(String... args) throws Exception {
        LOG.info("App starts...");
        LOG.info(Arrays.toString(twitterToKafkaConfigData.getTwitterKeywords().toArray(new String[]{})));
    }
}
