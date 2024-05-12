package com.justin.proxy.st;

public class RealSubject implements Subject{
    @Override
    public void request() {
        System.out.println("RealSubject: 处理请求");
    }
}
