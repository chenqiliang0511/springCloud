package com.chen.user.feign;

import com.chen.user.domain.Order;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * 类的注释
 *
 * @author chenqiliang
 * @version 1.0
 * 2023/02/10  9:01
 */
@FeignClient(value = "order-service")
public interface UserOrderFeign {

    @GetMapping("/putOrder.do")
    String putOrder();

    @GetMapping("/oneParam.do")
    void oneParam(@RequestParam("name")String name);

    @GetMapping("/twoParam.do")
    void twoParam(@RequestParam("name")String name,@RequestParam("age")int age);

    @PostMapping("/oneBody.do")
    void oneBody(@RequestBody() Order order);

    @PostMapping("/oneBodyAndParam.do")
    void oneBodyAndParam(@RequestBody() Order order, @RequestParam("total")int total);

    @PostMapping("/urlParam.do/{name}/{age}/{height}")
    void urlParam(@PathVariable("name") String name, @PathVariable("age") int age, @PathVariable("height") double height);

    /**
     * 日期参数单独接受存在时差问题（建议传递格式化后的字符串模式 yyyy-MM-dd HH:mm:ss）
     * @param date
     */
    @GetMapping("/testDate.do")
    void testDate(@RequestParam("date") Date date);
}
