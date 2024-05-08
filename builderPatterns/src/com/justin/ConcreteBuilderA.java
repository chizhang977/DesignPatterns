package com.justin;

public class ConcreteBuilderA extends Builder {

    private Product product = new Product();
    @Override
    public void buildPartA() {
        product.add("partA");
    }

    @Override
    public void buildPartB() {
        product.add("partB");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
