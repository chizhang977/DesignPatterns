package com.justin.factorymethod;

public class ConcreteFactoryA implements Factory{
    @Override
    public Product createProduct() {
        return new ConcerteProductA();
    }
}
