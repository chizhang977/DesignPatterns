package com.justin.composite;

public class Client {
    public static void main(String[] args) {
        Composite root = new Composite("root");
        root.add(new Leaf("leaf1"));
        root.add(new Leaf("leaf2"));

        Composite comp = new Composite("composite X");
        comp.add(new Leaf("leaf3"));
        comp.add(new Leaf("leaf4"));
        root.add(comp);

        Composite comp2 = new Composite("composite Y");
        comp2.add(new Leaf("leaf5"));
        comp2.add(new Leaf("leaf6"));
        root.add(comp2);

        Leaf leaf = new Leaf("leaf7");
        root.add(leaf);

        Leaf leaf2 = new Leaf("leaf8");
        root.add(leaf2);
//        root.remove(leaf2);

        root.display(1);
    }
}
