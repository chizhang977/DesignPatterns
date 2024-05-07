package com.justin.factorymethod;

public class ConcreteFactoryB implements Factory{
    @Override
    public Product createProduct() {
        return new ConcerteProductB();
    }
}
