package com.DEMO_工厂设计模式.demo2;

 class test {
    public static void main(String[] args) {
//        AmericanFoodFactory foodFactory = new AmericanFoodFactory();
        ItalyFoodFactory foodFactory = new ItalyFoodFactory();
        MerchandiseStore coffeeStore = new MerchandiseStore(foodFactory);
        Coffee coffee = coffeeStore.orderFood();
        coffee.getName();
        coffee.addMilk();
        coffee.addSugar();
        Dessert dessert = coffeeStore.orderDessert();
        dessert.show();
    }

}
