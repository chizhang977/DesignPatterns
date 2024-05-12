package com.justin.composite;

import java.util.ArrayList;

public class Composite extends Component{
    private ArrayList<Component> children = new ArrayList<Component>();

    public Composite(String name) {
        super(name);
    }
    @Override
    public void add(Component c) {
        children.add(c);
    }

    @Override
    public void remove(Component c) {
        children.remove(c);
    }

    @Override
    public void display(int depth) {
        //显示
        for (int i = 0; i < depth; i++)
            System.out.print("-");
        System.out.println(depth + name);
        //下级显示
        for(Component c : children) {
            c.display(depth + 2);
        }
    }
}
