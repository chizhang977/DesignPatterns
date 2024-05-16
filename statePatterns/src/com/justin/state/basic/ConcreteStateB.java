package com.justin.state.basic;
//每一个子类实现一个与Context的一个状态相关的行为
public class ConcreteStateB extends State {
    public void handle(Context context) {
        System.out.println("ConcreteStateB handle");
        context.setState(new ConcreteStateA());
    }
}
