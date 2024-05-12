package com.justin.proxy.st;

public class Proxy implements Subject{

    private RealSubject realSubject;
    public Proxy(RealSubject realSubject) {
        this.realSubject = realSubject;
    }
    @Override
    public void request() {
        realSubject.request();
    }

    private void preRequest() {
        System.out.println("StaticProxy: 在调用真实对象前做一些预处理");
    }

    private void postRequest() {
        System.out.println("StaticProxy: 在调用真实对象后做一些后续处理");
    }
}
