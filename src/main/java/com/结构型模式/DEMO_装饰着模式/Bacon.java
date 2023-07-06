package com.结构型模式.DEMO_装饰着模式;

/**
 * @program: design-mode
 * @author: 8465
 * @createTime: 2023-06-29 10:50
 * @description: 培根类（具体装饰）
 * @Version: 1.0
 **/
public class Bacon extends Garnish{
    public Bacon(FastFood fastFood){
        super(fastFood,"培根",5);
    }

    @Override
    public float cost() {
        return getMoney()+getFastFood().cost();
    }
}
