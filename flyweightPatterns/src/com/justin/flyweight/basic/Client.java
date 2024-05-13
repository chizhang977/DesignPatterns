package com.justin.flyweight.basic;

public class Client {
    public static void main(String[] args) {
        int extrinsicState = 22;
        FlyweightFactory factory = new FlyweightFactory();
        Flyweight fx = factory.getFlyweight("X");
        fx.opeartion(--extrinsicState);

        Flyweight fy = factory.getFlyweight("Y");
        fy.opeartion(--extrinsicState);

        Flyweight fz = factory.getFlyweight("Z");
        fz.opeartion(--extrinsicState);
    }
}
