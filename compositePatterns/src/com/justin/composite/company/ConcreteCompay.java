package com.justin.composite.company;

import java.util.ArrayList;

public class ConcreteCompay extends Company{

    private ArrayList<Company> children = new ArrayList<Company>();
    public ConcreteCompay(String name) {
        super(name);
    }
    @Override
    public void add(Company c) {
        children.add(c);
    }

    @Override
    public void remove(Company c) {
        children.remove(c);
    }

    @Override
    public void display(int depth) {
        for (int i = 0; i < depth; i++)
            System.out.print("-");
        System.out.println(name);
        for (Company c : children)
            c.display(depth + 2);
    }

    @Override
    public void lineOfDuty() {
        for (Company c : children)
            c.lineOfDuty();
    }
}
