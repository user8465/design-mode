package com.结构型模式.DEMO_适配器模式.class_adapter;

/**
 * @program: design-mode
 * @author: 8465
 * @createTime: 2023-06-21 10:47
 * @description: 类适配器
 * @Version: 1.0
 **/
public  class CardAdapterHandle extends TFCardImp implements SDCard {
    @Override
    public String readCard() {
        return readTFCard();
    }

    @Override
    public void writeCard(String msg) {
        writeTFCard(msg);
    }
}
