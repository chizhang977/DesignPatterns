package com.justin.composite.company;
//HRDepartment
public class FinanceDepartment extends Company{
    public FinanceDepartment(String name) {
        super(name);
    }
    @Override
    public void add(Company c) {

    }

    @Override
    public void remove(Company c) {

    }

    @Override
    public void display(int depth) {
        for ( int i = 0; i < depth; i++)
            System.out.print("-");
        System.out.println(name);
    }

    @Override
    public void lineOfDuty() {
        System.out.println(name + " 公司财务收支管理");
    }
}
