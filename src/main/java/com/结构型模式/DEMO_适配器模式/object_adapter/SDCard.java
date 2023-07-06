package com.结构型模式.DEMO_适配器模式.object_adapter;

/**
 * @program: design-mode
 * @author: 8465
 * @createTime: 2023-06-21 10:38
 * @description: 目标接口
 * @Version: 1.0
 **/
public interface SDCard {
    String readCard();
    void writeCard(String msg);
}
