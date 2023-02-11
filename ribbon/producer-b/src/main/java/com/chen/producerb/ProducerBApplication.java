package com.chen.producerb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ProducerBApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProducerBApplication.class, args);
    }

}
