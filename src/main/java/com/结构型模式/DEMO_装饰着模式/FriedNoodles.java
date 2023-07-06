package com.结构型模式.DEMO_装饰着模式;

/**
 * @program: design-mode
 * @author: 8465
 * @createTime: 2023-06-29 10:45
 * @description: 炒面（具体构建）
 * @Version: 1.0
 **/
public class FriedNoodles extends FastFood{

    public FriedNoodles(){
        super("炒面",12);
    }


    @Override
    public float cost() {
        return getMoney();
    }
}
