package com.结构型模式.DEMO_代理模式.jdk_proxy;

/**
 * @program: design-mode
 * @author: 8465
 * @createTime: 2023-06-19 16:54
 * @description: 测试
 * @Version: 1.0
 **/
public class test {
    public static void main(String[] args) {
        SellProxyFactory sellProxyFactory = new SellProxyFactory();
        SellTickets sellTickets = sellProxyFactory.getSellTickets();
        sellTickets.vip();




    }
}
