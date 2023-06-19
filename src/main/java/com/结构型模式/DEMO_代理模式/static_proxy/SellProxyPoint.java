package com.结构型模式.DEMO_代理模式.static_proxy;

/**
 * @program: design-mode
 * @author: 8465
 * @createTime: 2023-06-19 16:04
 * @description:代理火车站对象
 * @Version: 1.0
 **/
public class SellProxyPoint implements SellTickets{
    private TrainStation trainStation = new TrainStation();
    @Override
    public void sell() {
        trainStation.sell();
        System.out.println("请支付100元");
    }
}
