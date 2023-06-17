package com.DEMO_工厂设计模式.demo2;


 class ItalyFoodFactory implements MerchandiseFactory {
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new AnanasDessert();
    }
}
