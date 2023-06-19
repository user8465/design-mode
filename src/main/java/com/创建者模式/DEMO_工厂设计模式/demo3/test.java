package com.创建者模式.DEMO_工厂设计模式.demo3;


 class test {
    public static void main(String[] args) {
        CoffeeStore coffeeStore = new CoffeeStore();
        Coffee coffee = coffeeStore.orderCoffee("拿铁");
        coffee.getName();
        coffee.addSugar();
        coffee.addMilk();
    }

}
