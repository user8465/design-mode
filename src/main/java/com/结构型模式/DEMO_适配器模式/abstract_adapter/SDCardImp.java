package com.结构型模式.DEMO_适配器模式.abstract_adapter;

/**
 * @program: design-mode
 * @author: 8465
 * @createTime: 2023-06-21 10:39
 * @description: 目标接口实现
 * @Version: 1.0
 **/
public class SDCardImp implements SDCard {

    @Override
    public String readCard() {
        return "read SD Card";
    }

    @Override
    public void writeCard(String msg) {
        System.out.println(msg);
    }
}
