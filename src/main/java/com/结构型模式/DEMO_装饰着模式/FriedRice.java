package com.结构型模式.DEMO_装饰着模式;

/**
 * @program: design-mode
 * @author: 8465
 * @createTime: 2023-06-29 10:42
 * @description: 炒饭（具体构建）
 * @Version: 1.0
 **/
public class FriedRice extends FastFood {

    public FriedRice(){
        super("炒饭",10);
    }

    @Override
    public float cost() {
        return getMoney();
    }
}
