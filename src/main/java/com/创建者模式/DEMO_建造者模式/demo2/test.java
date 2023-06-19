package com.创建者模式.DEMO_建造者模式.demo2;

/**
 * @Author tanyu
 * @Date 2023/6/18 22:16
 * @PackageName: com.DEMO_建造者模式.demo2
 * @ClassName: test
 * @Description: TODO
 * @Version 1.0
 */
public class test {
    public static void main(String[] args) {


        Phone phone = new Phone.Builder()
                .setCpu("因特尔")
                .setBoard("微星")
                .setMemory("三星")
                .setScreen("AOC").builder();


        System.out.println(phone.toString());
    }
}
