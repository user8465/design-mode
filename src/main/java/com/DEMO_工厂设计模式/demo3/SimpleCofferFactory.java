package com.DEMO_工厂设计模式.demo3;

 class SimpleCofferFactory {
    public static Coffee orderCoffee(String type) {
        Coffee coffee = null;
        if ("美式".equals(type)) {
            coffee = new AmericanCoffee();

        } else if ("拿铁".equals(type)) {
            coffee= new LatteCoffee();
        }
        return coffee;
    }
}
