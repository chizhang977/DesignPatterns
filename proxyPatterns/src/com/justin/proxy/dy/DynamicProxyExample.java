package com.justin.proxy.dy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxyExample {
    interface Subject {
        void request();
    }

    static class RealSubject implements Subject {
        @Override
        public void request() {
            System.out.println("RealSubject: 处理请求");
        }
    }

    static class DynamicProxyHandler implements InvocationHandler {
        private final Subject realSubject;

        public DynamicProxyHandler(Subject realSubject) {
            this.realSubject = realSubject;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            preRequest();
            Object result = method.invoke(realSubject, args);
            postRequest();
            return result;
        }

        private void preRequest() {
            System.out.println("DynamicProxy: 在调用真实对象前做一些预处理");
        }

        private void postRequest() {
            System.out.println("DynamicProxy: 在调用真实对象后做一些后续处理");
        }
    }

    public static void main(String[] args) {
        // 真实主题实例
        Subject realSubject = new RealSubject();

        // 创建动态代理实例
        Subject proxySubject = (Subject) Proxy.newProxyInstance(
                RealSubject.class.getClassLoader(),
                new Class[]{Subject.class},
                new DynamicProxyHandler(realSubject)
        );

        // 调用代理方法
        proxySubject.request();
    }
}
