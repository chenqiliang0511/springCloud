package com.chen.producerb.action;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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
        return "我是服务bbbbbbbbbbb";
    }
}
