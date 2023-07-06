package com.结构型模式.DEMO_适配器模式.abstract_adapter;

/**
 * @program: design-mode
 * @author: 8465
 * @createTime: 2023-06-21 10:36
 * @description: 适配者实现类
 * @Version: 1.0
 **/
public class TFCardImp implements TFCard {
    @Override
    public String readTFCard() {
        return "read TF Card ";
    }

    @Override
    public void writeTFCard(String msg) {
        System.out.println("读取TF");
        System.out.println(msg);
    }
}
