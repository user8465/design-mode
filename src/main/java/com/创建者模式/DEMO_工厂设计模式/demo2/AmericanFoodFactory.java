package com.创建者模式.DEMO_工厂设计模式.demo2;




 class AmericanFoodFactory implements MerchandiseFactory {
    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new  TiramisuDessert();
    }
}
