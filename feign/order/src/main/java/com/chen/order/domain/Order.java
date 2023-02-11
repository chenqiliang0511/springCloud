package com.chen.order.domain;

import java.util.Date;

/**
 * 类的注释
 *
 * @author chenqiliang
 * @version 1.0
 * 2023/02/10  9:21
 */
public class Order {

    private String id;

    private String name;

    private int num;

    private double price;

    private Date createTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", num=" + num +
                ", price=" + price +
                ", createTime=" + createTime +
                '}';
    }
}
