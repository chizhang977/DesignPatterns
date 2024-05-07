package com.justin.abstractfactory;

public class ConcreteFactory1 implements AbstractFactory{
    @Override
    public Product createProduct() {
        return new ConcreteProductA();
    }

    @Override
    public AnotherProduct createAnotherProduct() {
        return new ConcreteAnotherProductC();
    }
}
