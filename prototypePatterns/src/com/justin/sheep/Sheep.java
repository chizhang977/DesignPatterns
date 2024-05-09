package com.justin.sheep;

public class Sheep implements Cloneable {
    private String name;
    private int age;
    private String color;
    private String address = "蒙古羊";
    public Sheep friend; //是对象, 克隆是会如何处理
    public Sheep(String name, int age, String color) {
        super();
        this.name = name;
        this.age = age;
        this.color = color;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }



    @Override
    public String toString() {
        return "Sheep [name=" + name + ", age=" + age + ", color=" + color + ", address=" + address + "]";
    }
    //克隆该实例，使用默认的clone方法来完成
    @Override
    protected Sheep clone()  {
        Sheep sheep = null;
        try {
            // 使用 instanceof 检查以确保类型安全
            Object cloneObj = super.clone();
            if (cloneObj instanceof Sheep) {
                sheep = (Sheep) cloneObj;
            } else {
                // 如果克隆出的对象不是 Sheep 类型，则抛出异常
                throw new IllegalStateException("克隆对象不是 Sheep 类型的实例");
            }
        } catch (CloneNotSupportedException e) {
            // 处理克隆不支持的异常
            // 记录日志而不是直接打印到控制台，更适用于生产环境
            System.err.println("克隆不被支持: " + e.getMessage());
            // 根据需要，可以选择返回null，抛出运行时异常，或其他恢复策略
            return null;
        } catch (Exception e) {
            // 处理其他可能的异常
            // 同样，记录日志而不是直接打印
            System.err.println("克隆过程中发生异常: " + e.getMessage());
            // 根据需要进行异常处理
            return null;
        }

        // 如果需要对 Sheep 类中的字段进行深拷贝，应该在这里实现
        // 例如，如果 Sheep 有一个 List<String> 字段 sheepList
        // sheep.setSheepList(new ArrayList<>(this.sheepList)); // 这里只是示意，具体实现取决于字段的复杂性

        return sheep;
    }




}
