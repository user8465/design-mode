package com.创建者模式.DEMO_工厂设计模式.demo1;

 class AmericanCoffeeFactory implements CoffeeFactory{
    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }
}
