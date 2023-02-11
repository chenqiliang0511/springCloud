package com.chen.producera.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 类的注释
 *
 * @author chenqiliang
 * @version 1.0
 * 2023/02/09  10:15
 */
@RestController
public class ProducerAction {

//    @Autowired
//    private DiscoveryClient discoveryClient;

    @GetMapping("/getProduce.do")
    public String getProduce(String serviceName){
        return "我是服务aaaaaaaaaaa";
    }
}
