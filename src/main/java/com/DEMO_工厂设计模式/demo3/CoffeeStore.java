package com.DEMO_工厂设计模式.demo3;



 class CoffeeStore {

    public Coffee orderCoffee(String type) {
        Coffee coffee = SimpleCofferFactory.orderCoffee(type);
        return  coffee;
    }


}

