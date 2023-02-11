package com.chen.consumer.action;

import com.chen.consumer.config.ConsumerConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * 用户类yihao
 *
 * @author chenqiliang
 * @version 1.0
 * 2023/02/09  10:37
 */
@RestController
public class ConsumerAction {

    @Autowired
    private RestTemplate restTemplate;

    /**
     * 未集成ribbon
     * @return
     */
    @GetMapping("/getInfo.do")
    public String getInfo(){
        String url = "http://localhost:8081//getProduce.do";
        restTemplate = new RestTemplate();
        return restTemplate.getForObject(url,String.class);
    }


    /**
     * 集成ribbon
     * restTemplate交由ribbon管理
     * @see ConsumerConfig
     * @return
     */
    @GetMapping("/getInfoByServiceName.do")
    public String getInfoByServiceName(String serviceName){
        String url = "http://" + serviceName + "//getProduce.do";
        return restTemplate.getForObject(url,String.class);
    }
}
