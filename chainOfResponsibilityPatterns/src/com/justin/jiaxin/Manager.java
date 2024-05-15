package com.justin.jiaxin;


public abstract class Manager {
    protected String name;
    public Manager(String name){
        this.name = name;
    }
    //设置管理上级
    public Manager superior;
    public void setSuperior(Manager superior){
        this.superior = superior;
    }
    public abstract void requestApplications(Request request);
}
