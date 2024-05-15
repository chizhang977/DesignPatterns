package com.justin.command.basic;
// 接收者,知道如何实施与执行一个与请求相关的操作，任何类都可以作为一个接收者
public class Receiver {
    public void action()
    {
        System.out.println("执行请求");
    }
}
