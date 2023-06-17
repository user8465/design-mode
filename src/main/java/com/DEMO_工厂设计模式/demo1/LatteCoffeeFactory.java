package com.DEMO_工厂设计模式.demo1;

 class LatteCoffeeFactory  implements  CoffeeFactory{
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }
}
