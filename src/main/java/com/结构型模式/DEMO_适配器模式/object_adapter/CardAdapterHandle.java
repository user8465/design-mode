package com.结构型模式.DEMO_适配器模式.object_adapter;

/**
 * @program: design-mode
 * @author: 8465
 * @createTime: 2023-06-21 10:47
 * @description: 适配器
 * @Version: 1.0
 **/
public class CardAdapterHandle  implements SDCard {
    private  TFCard tfCard;

    public CardAdapterHandle(TFCard tfCard){
        this.tfCard = tfCard;
    }

    @Override
    public String readCard() {
        return tfCard.readTFCard();
    }

    @Override
    public void writeCard(String msg) {
        tfCard.writeTFCard(msg);
    }
}
