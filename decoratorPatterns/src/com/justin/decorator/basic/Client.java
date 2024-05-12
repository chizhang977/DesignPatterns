package com.justin.decorator.basic;

public class Client {
    public static void main(String[] args)
    {
       ConcreteComponent c = new ConcreteComponent();
       ConcreteDecoratorA a = new ConcreteDecoratorA(c);
       ConcreteDecoratorB b = new ConcreteDecoratorB(a);
       b.operation();
    }
}
