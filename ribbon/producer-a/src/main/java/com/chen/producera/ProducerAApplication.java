package com.chen.producera;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ProducerAApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProducerAApplication.class, args);
    }

}
