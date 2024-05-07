package com.justin.simplefactory;

public class SimpleFactory {
    public static Product createProduct(String type){
        if("A".equals(type)){
            return new ConcerteProductA();
        }else if("B".equals(type)){
            return new ConcerteProductB();
        }
        return (Product) new IllegalArgumentException("type is illegal");

    }
}
