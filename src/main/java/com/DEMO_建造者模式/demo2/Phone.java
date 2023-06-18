package com.DEMO_建造者模式.demo2;

/**
 * @Author tanyu
 * @Date 2023/6/18 22:08
 * @PackageName: com.DEMO_建造者模式.demo2
 * @ClassName: Phone
 * @Description: TODO
 * @Version 1.0
 */
public class Phone {
    private String cpu;
    private String screen;
    private String memory;
    private String board;


    private Phone(Builder builder) {
        cpu = builder.cpu;
        screen = builder.screen;
        memory = builder.memory;
        board = builder.board;
    }


    public static final class Builder {
        private String cpu;
        private String screen;
        private String memory;
        private String board;

        public Builder() {
        }

        public Builder setCpu(String cpu){
            this.cpu = cpu;
            return this;
        }
        public Builder setScreen(String screen){
            this.screen = screen;
            return this;
        }
        public Builder setMemory(String memory){
            this.memory = memory;
            return this;
        }
        public Builder setBoard(String board){
            this.board = board;
            return this;
        }
        public Phone builder(){
            return  new Phone(this);
        }

    }


    @Override
    public String toString() {
        return "Phone{" +
                "cpu='" + cpu + '\'' +
                ", screen='" + screen + '\'' +
                ", memory='" + memory + '\'' +
                ", board='" + board + '\'' +
                '}';
    }

}
