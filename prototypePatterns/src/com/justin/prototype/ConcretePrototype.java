package com.justin.prototype;

public class ConcretePrototype implements Prototype{
    private String name;
    private int age;
    public ConcretePrototype(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public Prototype clone() throws CloneNotSupportedException {
        // 实现深拷贝，如果有引用类型成员，需手动处理
        return (ConcretePrototype)super.clone();
    }
}
