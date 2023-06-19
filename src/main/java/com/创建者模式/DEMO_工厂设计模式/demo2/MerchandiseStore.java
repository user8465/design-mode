package com.创建者模式.DEMO_工厂设计模式.demo2;



 class MerchandiseStore {
    private static MerchandiseFactory factory;
    public MerchandiseStore(MerchandiseFactory factory){
        factory = factory;
    }
    public  Coffee orderFood(){
         Coffee coffee = factory.createCoffee();
         return coffee;
     }
    public  Dessert orderDessert(){
        Dessert dessert = factory.createDessert();
        return dessert;
    }

}

