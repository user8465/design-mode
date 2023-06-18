package com.DEMO_建造者模式.demo1;

/**
 * @Author tanyu
 * @Date 2023/6/18 21:37
 * @PackageName: com.DEMO_建造者模式.demo1
 * @ClassName: OfoBikeBuilder
 * @Description: TODO
 * @Version 1.0
 */
public class OfoBikeBuilder extends Builder{
    @Override
    public void buildFrame() {
        bike.setFrame("廉价铁");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("塑料座椅");

    }
    @Override
    public Bike creatBike() {
        return bike;
    }
}
