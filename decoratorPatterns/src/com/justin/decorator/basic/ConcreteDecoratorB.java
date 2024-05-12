package com.justin.decorator.basic;

public class ConcreteDecoratorB extends Decorator{
    private String addState;

    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        this.addState = " 具体 装饰对象B的独有操作";
        System.out.println(this.addState);
    }
}
