package com.justin.simplefactory;

public class SimpleFactoryClient {
    public static void main(String[] args) {
        Product product = SimpleFactory.createProduct("A");
        product.show();
    }
}
