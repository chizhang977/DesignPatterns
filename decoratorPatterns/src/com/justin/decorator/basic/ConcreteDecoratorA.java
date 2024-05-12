package com.justin.decorator.basic;

public class ConcreteDecoratorA extends Decorator{
    private String addState;

    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        this.addState = " 具体 装饰对象A的独有操作";
        System.out.println(this.addState);
    }
}
