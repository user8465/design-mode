package com.创建者模式.DEMO_工厂设计模式.demo1;


public class CoffeeStore {
    private static CoffeeFactory factory;

    public CoffeeStore(CoffeeFactory factory) {
        this.factory = factory;
    }

    public Coffee orderCoffee() {
        Coffee coffee = factory.createCoffee();
        return coffee;
    }


    public static void main(String[] args) {
        CoffeeStore coffeeStore = new CoffeeStore(new AmericanCoffeeFactory());
        Coffee coffee = coffeeStore.orderCoffee();
        coffee.getName();
        coffee.addSugar();
        coffee.addMilk();
    }
}

