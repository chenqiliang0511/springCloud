package com.chen.user.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 类的注释
 *
 * @author chenqiliang
 * @version 1.0
 * 2023/02/10  10:27
 */
@Configuration
public class FeignConfig {

    @Bean
    public Logger.Level loglevel(){
        return Logger.Level.FULL;
    }
}
