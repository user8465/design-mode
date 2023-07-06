package com.结构型模式.DEMO_装饰着模式;

/**
 * @program: design-mode
 * @author: 8465
 * @createTime: 2023-06-29 10:49
 * @description: 鸡蛋类（具体装饰）
 * @Version: 1.0
 **/
public class Egg extends Garnish {

    public Egg(FastFood fastFood){
        super(fastFood,"鸡蛋",2);
    }

    @Override
    public float cost(){
        System.out.println(getMoney());
        System.out.println(getFastFood().money);
        return getMoney()+getFastFood().cost();
    }

    @Override
    public String getDesc() {
        return   super.getDesc()+getFastFood().getDesc();
    }
}
