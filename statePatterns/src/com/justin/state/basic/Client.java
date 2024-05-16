package com.justin.state.basic;

public class Client {
    public static void main(String[] args) {
        Context context = new Context(new ConcreteStateA());
        context.request();
        context.request();
    }
}
