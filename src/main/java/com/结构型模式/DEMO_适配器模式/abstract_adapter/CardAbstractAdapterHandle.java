package com.结构型模式.DEMO_适配器模式.abstract_adapter;

/**
 * @program: design-mode
 * @author: 8465
 * @createTime: 2023-06-21 11:28
 * @description: 抽象适配器
 * @Version: 1.0
 **/
public abstract class CardAbstractAdapterHandle extends TFCardImp implements SDCard {
    @Override
    public String readCard() {
        return null;
    }

    @Override
    public void writeCard(String msg) {

    }
}
