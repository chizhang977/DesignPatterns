package com.justin.memento.basic;
//发起人,创建备忘录
public class Originator {

    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    //显示数据
    public void show(){
        System.out.println("state:"+state);
    }

    //创建备忘录
    public Memento createMemento(){
        return new Memento(state);
    }

    //恢复备忘录
    public void restoreMemento(Memento memento){
        this.state = memento.getState();
    }
}
