package com.justin.abstractfactory;

public class AbstractFactoryClient {
    public static void main(String[] args) {
        AbstractFactory factory = new ConcreteFactory1();
        Product product = factory.createProduct();
        product.show();
        AnotherProduct anotherProduct = factory.createAnotherProduct();
        anotherProduct.display();
    }
}
