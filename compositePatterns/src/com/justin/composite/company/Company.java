package com.justin.composite.company;
//公司类，Component类
public abstract class Company {
    protected String name;
    public Company(String name)
    {
        this.name = name;
    }
    public abstract void add(Company c);
    public abstract void remove(Company c);
    public abstract void display(int depth);
    public abstract void lineOfDuty();//履行职责
}
