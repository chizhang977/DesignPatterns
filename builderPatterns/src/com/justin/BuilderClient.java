package com.justin;

public class BuilderClient {
    public static void main(String[] args) {
        Director director = new Director();
        Builder builderA = new ConcreteBuilderA();
        Builder builderB = new ConcreteBuilderB();

        director.construct(builderA);
        builderA.getResult().show();

        director.construct(builderB);
        builderB.getResult().show();
    }
}
