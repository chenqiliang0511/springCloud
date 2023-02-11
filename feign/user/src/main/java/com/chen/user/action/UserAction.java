package com.chen.user.action;

import com.chen.user.domain.Order;
import com.chen.user.feign.UserOrderFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.UUID;

/**
 * 类的注释
 *
 * @author chenqiliang
 * @version 1.0
 * 2023/02/10  8:59
 */
@RestController
public class UserAction {

    @Autowired
    private UserOrderFeign userOrderFeign;

    @GetMapping("/doTest.do")
    public void doTest(){
        String s = userOrderFeign.putOrder();
        System.out.println(s);
//        System.out.println("-----------------------------------------------------------------------------");
//        userOrderFeign.oneParam("zhangsan");
//        userOrderFeign.twoParam("wangwu",10);
//        Order order = new Order();
//        order.setId("01");
//        order.setName("烤鸭");
//        order.setNum(1);
//        order.setPrice(18.8);
//        Date date = new Date();
//        order.setCreateTime(date);
//        userOrderFeign.oneBody(order);
//        userOrderFeign.oneBodyAndParam(order,100);
//        userOrderFeign.urlParam("niuqin",19,1.8);
//        userOrderFeign.testDate(date);
//        System.out.println(date);
    }

}
