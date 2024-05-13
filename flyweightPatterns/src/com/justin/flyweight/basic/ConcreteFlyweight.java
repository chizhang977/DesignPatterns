package com.justin.flyweight.basic;
// 具体享元角色
public class ConcreteFlyweight extends Flyweight{
    @Override
    public void opeartion(int extrinsicState) {
        System.out.println("ConcreteFlyweight"+extrinsicState);
    }
}
