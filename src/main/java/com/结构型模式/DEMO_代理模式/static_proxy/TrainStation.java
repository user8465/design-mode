package com.结构型模式.DEMO_代理模式.static_proxy;

/**
 * @program: design-mode
 * @author: 8465
 * @createTime: 2023-06-19 16:02
 * @description: 火车站卖票(真实主题)
 * @Version: 1.0
 **/
public class TrainStation implements SellTickets{

    @Override
    public void sell() {
        System.out.println("天门南-武昌");
    }
}
