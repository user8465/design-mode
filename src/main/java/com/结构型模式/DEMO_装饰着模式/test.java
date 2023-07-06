package com.结构型模式.DEMO_装饰着模式;

/**
 * @program: design-mode
 * @author: 8465
 * @createTime: 2023-06-29 10:52
 * @description: todo
 * @Version: 1.0
 **/
public class test {
    public static void main(String[] args) {
        FastFood food = new FriedNoodles();
        food = new Egg(food);
        food = new Egg(food);
        food =  new Bacon(food);
        System.out.println(food.getDesc());
        System.out.println(food.cost());
    }
}
