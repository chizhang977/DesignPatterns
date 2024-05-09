package com.justin.prototype;

public class PrototypeClient {
    public static void main(String[] args) throws CloneNotSupportedException {
        Prototype prototype = new ConcretePrototype("zhangsan",23);
        System.out.println(prototype);
        Prototype clone = prototype.clone();
        System.out.println(clone);
    }
}
