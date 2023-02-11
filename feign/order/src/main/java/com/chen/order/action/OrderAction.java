package com.chen.order.action;

import com.chen.order.domain.Order;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * 类的注释
 *
 * @author chenqiliang
 * @version 1.0
 * 2023/02/09  17:24
 */
@RestController
public class OrderAction {
    
    @GetMapping("/putOrder.do")
    public String putOrder(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "订单已经制作";
    }

    @GetMapping("/oneParam.do")
    public void oneParam(@RequestParam("name")String name){
        System.out.println(name);
    }

    @GetMapping("/twoParam.do")
    public void twoParam(@RequestParam("name")String name,@RequestParam("age")int age){
        System.out.println(name + " ; " + age);
    }

    @PostMapping("/oneBody.do")
    public void oneBody(@RequestBody() Order order){
        System.out.println(order);
    }

    @PostMapping("/oneBodyAndParam.do")
    public void oneBodyAndParam(@RequestBody() Order order, @RequestParam("total")int total){
        System.out.println(order + " ; " + total);
    }

    @PostMapping("/urlParam.do/{name}/{age}/{height}")
    public void urlParam(@PathVariable("name") String name, @PathVariable("age") int age, @PathVariable("height") double height){
        System.out.println(name + " ; " + age + " ; " + height);
    }

    /**
     * 日期参数单独接受存在时差问题（建议传递格式化后的字符串模式 yyyy-MM-dd HH:mm:ss）
     * @param date
     */
    @GetMapping("/testDate.do")
    public void testDate(@RequestParam("date") Date date){
        System.out.println(date);
    }
}
