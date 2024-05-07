package com.justin.factorymethod;

public class FactoryMethodClient {
    public static void main(String[] args) {
        Factory factory = new ConcreteFactoryB();
        Product product = factory.createProduct();
        product.show();
    }
}
