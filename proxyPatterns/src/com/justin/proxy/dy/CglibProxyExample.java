package com.justin.proxy.dy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;


public class CglibProxyExample implements MethodInterceptor {

    private Object target;

    public CglibProxyExample(Object target) {
        this.target = target;
    }

    public Object getProxyInstance() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        // 设置回调方法
        enhancer.setCallback(this);
        // 创建并返回代理对象
        return enhancer.create();
    }

    @Override
    public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("Before method call");
        Object result = methodProxy.invokeSuper(proxy, args);
        System.out.println("After method call");
        return result;
    }


    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //创建目标对象
        SomethingDto target = new SomethingDto();
        //获取到代理对象，并且将目标对象传递给代理对象
        SomethingDto proxyInstance = (SomethingDto)new CglibProxyExample(target).getProxyInstance();

        //执行代理对象的方法，触发intecept 方法，从而实现 对目标对象的调用
        String res = proxyInstance.teach();
        System.out.println("res=" + res);
    }
}
class SomethingDto {
    public String teach() {
        System.out.println("我是cglib代理，不需要实现接口 ");
        return "hello cglib";
    }
}