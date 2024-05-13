package com.justin.flyweight.basic;
// UnsharedConcreteFlyweight,不共享具体享元类
public class UnsharedConcreteFlyweight extends Flyweight{
    @Override
    public void opeartion(int extrinsicState) {
        System.out.println("UnsharedConcreteFlyweight"+extrinsicState);
    }
}
