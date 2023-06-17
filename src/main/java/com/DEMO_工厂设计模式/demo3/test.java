package com.DEMO_工厂设计模式.demo3;


 class test {
    public static void main(String[] args) {
        CoffeeStore coffeeStore = new CoffeeStore();
        Coffee coffee = coffeeStore.orderCoffee("拿铁");
        coffee.getName();
        coffee.addSugar();
        coffee.addMilk();
    }

}
