package com.justin.template;

// 抽象类：饮料制作流程
abstract class Beverage {
    // 模板方法，定义冲泡流程
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    // 具体步骤由子类实现
    abstract void brew();
    abstract void addCondiments();

    // 公共步骤实现,烧开水
    void boilWater() {
        System.out.println("Boiling water");
    }

    void pourInCup() {
        System.out.println("Pouring into cup");
    }

    // 钩子方法，子类可选择是否覆盖
    boolean customerWantsCondiments() {
        return true;
    }
}

// 具体子类：咖啡
class Coffee extends Beverage {
    @Override
    void brew() {
        System.out.println("Brewing coffee");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding sugar and milk to coffee");
    }
}

// 具体子类：茶
class Tea extends Beverage {
    @Override
    void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding lemon");
    }

    // 重写了钩子方法
    @Override
    boolean customerWantsCondiments() {
        return false; // 假设有些顾客喝茶时不想要添加物
    }
}

public class TemplateMethodPatternDemo {
    public static void main(String[] args) {
        Beverage coffee = new Coffee();
        coffee.prepareRecipe();

        System.out.println();

        Beverage tea = new Tea();
        tea.prepareRecipe();
    }
}