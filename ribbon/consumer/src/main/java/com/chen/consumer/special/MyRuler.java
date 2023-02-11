package com.chen.consumer.special;

import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.Server;

/**
 * 自定义ribbon负载均衡逻辑
 *
 * @author chenqiliang
 * @version 1.0
 * 2023/02/09  11:05
 */
public class MyRuler implements IRule {

    @Override
    public Server choose(Object key) {
        return null;
    }

    @Override
    public void setLoadBalancer(ILoadBalancer lb) {

    }

    @Override
    public ILoadBalancer getLoadBalancer() {
        return null;
    }
}
