package com.justin.composite;
//Component 类
//为组合中的所有对象声明接口，在接口中提供与对象相关的操作。
public abstract class Component {
    protected String name;
    public Component(String name) {
        this.name = name;
    }
    public abstract void add(Component c);
    public abstract void remove(Component c);
    public abstract void display(int depth);
}
