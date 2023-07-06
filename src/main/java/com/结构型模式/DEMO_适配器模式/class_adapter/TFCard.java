package com.结构型模式.DEMO_适配器模式.class_adapter;

/**
 * @program: design-mode
 * @author: 8465
 * @createTime: 2023-06-21 10:33
 * @description: 适配者（Adaptee）接口
 * @Version: 1.0
 **/
public interface TFCard {
    String readTFCard();

    void writeTFCard(String msg);

}
