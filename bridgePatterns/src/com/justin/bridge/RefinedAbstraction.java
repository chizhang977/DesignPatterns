package com.justin.bridge;

public class RefinedAbstraction extends Abstraction{
    public void operation()
    {
        System.out.println("RefinedAbstraction.operation()");
        implementor.operation();
    }
}
