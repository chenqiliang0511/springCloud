package com.chen.consumer.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * 类的注释
 *
 * @author chenqiliang
 * @version 1.0
 * 2023/02/09  10:40
 */
@Configuration
public class ConsumerConfig {

    /**
     * 注解 @LoadBalanced 将RestTemplate交由ribbon管理，其他需要非ribbon管理调用的RestTemplate不可自动注入此bean
     * @return
     */
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

    /**
     * 指定负载均衡策略
     *
     * @return
     */
//    @Bean
//    public IRule iRule(){
//        return new RandomRule();
//    }

    @Bean
    public IRule iRule(){
        return new RoundRobinRule();
    }
}
