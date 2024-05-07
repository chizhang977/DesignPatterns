package com.justin.singleton;

public enum SingletonEnum {
    INSTANCE;
    // 可以在枚举中添加其他方法和属性
    private String data;

    // 构造方法，枚举的构造方法默认就是私有的
    SingletonEnum() {
        // 初始化数据或其他操作
        this.data = "Singleton Data";
    }

    // 提供获取实例数据的方法
    public String getData() {
        return data;
    }

    // 示例方法，展示如何在枚举中添加业务逻辑
    public void doSomething() {
        System.out.println("Doing something in the singleton.");
    }
    public static void main(String[] args) {
        SingletonEnum singleton = SingletonEnum.INSTANCE;
        SingletonEnum singleton2 = SingletonEnum.INSTANCE;
        System.out.println(singleton == singleton2);
        System.out.println(singleton.getData());
        singleton.doSomething();
    }
}
