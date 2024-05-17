package com.justin.visitor;

import java.util.ArrayList;
import java.util.List;

// 访问者接口
interface Visitor {
    void visit(Circle circle);
    void visit(Rectangle rectangle);
}

// 具体访问者：面积计算
class AreaVisitor implements Visitor {
    @Override
    public void visit(Circle circle) {
        double area = Math.PI * circle.getRadius() * circle.getRadius();
        System.out.println("Circle area: " + area);
    }

    @Override
    public void visit(Rectangle rectangle) {
        double area = rectangle.getWidth() * rectangle.getHeight();
        System.out.println("Rectangle area: " + area);
    }
}

// 具体访问者：绘制形状
class DrawVisitor implements Visitor {
    @Override
    public void visit(Circle circle) {
        System.out.println("Drawing a circle with radius: " + circle.getRadius());
    }

    @Override
    public void visit(Rectangle rectangle) {
        System.out.println("Drawing a rectangle with width: " + rectangle.getWidth() + " and height: " + rectangle.getHeight());
    }
}

// 元素接口
interface Element {
    void accept(Visitor visitor);
}

// 具体元素：圆形
class Circle implements Element {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

// 具体元素：矩形
class Rectangle implements Element {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

// 对象结构
class ShapeCollection {
    private List<Element> shapes = new ArrayList<>();

    public void addShape(Element shape) {
        shapes.add(shape);
    }

    public void accept(Visitor visitor) {
        for (Element shape : shapes) {
            shape.accept(visitor);
        }
    }
}

// 测试访问者模式
public class Test {
    public static void main(String[] args) {
        ShapeCollection shapeCollection = new ShapeCollection();
        shapeCollection.addShape(new Circle(5));
        shapeCollection.addShape(new Rectangle(3, 4));

        AreaVisitor areaVisitor = new AreaVisitor();
        DrawVisitor drawVisitor = new DrawVisitor();

        System.out.println("Calculating area:");
        shapeCollection.accept(areaVisitor);

        System.out.println("\nDrawing shapes:");
        shapeCollection.accept(drawVisitor);
    }
}
