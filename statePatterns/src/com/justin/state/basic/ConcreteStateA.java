package com.justin.state.basic;
//每一个子类实现一个与Context的一个状态相关的行为
public class ConcreteStateA extends State{
    public void handle(Context context) {
        System.out.println("ConcreteStateA handle");
        context.setState(new ConcreteStateB());
    }
}
