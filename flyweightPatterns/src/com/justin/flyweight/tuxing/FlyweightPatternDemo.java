package com.justin.flyweight.tuxing;

import java.util.HashMap;
import java.util.Map;

// Flyweight接口
interface Shape {
    void draw(String extrinsicState);
}

// 共享的ConcreteFlyweight类
class Circle implements Shape {
    private String color; // 内部状态，共享状态

    public Circle(String color) {
        this.color = color;
    }

    @Override
    public void draw(String extrinsicState) {
        System.out.println("Drawing a circle with color: " + color
                + ", and extrinsic state: " + extrinsicState);
    }
}

// 非共享的UnsharedConcreteFlyweight类
class Triangle implements Shape {
    // 由于是不可共享的，每个Triangle都有其独特的属性
    private String style;

    public Triangle(String style) {
        this.style = style;
    }

    @Override
    public void draw(String extrinsicState) {
        System.out.println("Drawing a triangle with style: " + style
                + ", and extrinsic state: " + extrinsicState);
    }
}

// FlyweightFactory
class ShapeFactory {
    private Map<String, Shape> circleMap = new HashMap<>();

    public Shape getCircle(String color) {
        Circle circle = (Circle) circleMap.get(color);
        if (circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
        }
        return circle;
    }

    // 为非共享对象提供创建方法
    public Shape getTriangle(String style) {
        return new Triangle(style); // 直接创建，不进行共享
    }
}

public class FlyweightPatternDemo {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();

        // 获取共享的Circle对象
        Shape circle1 = factory.getCircle("Red");
        circle1.draw("Circle 1");

        Shape circle2 = factory.getCircle("Red");
        circle2.draw("Circle 2");

        // 获取非共享的Triangle对象
        Shape triangle1 = factory.getTriangle("Filled");
        triangle1.draw("Triangle 1");

        Shape triangle2 = factory.getTriangle("Outlined");
        triangle2.draw("Triangle 2");
    }
}