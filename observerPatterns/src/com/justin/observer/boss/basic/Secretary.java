package com.justin.observer.boss.basic;

import java.util.ArrayList;

// Secretary,前台秘书类
public class Secretary {
    protected String name;
    public Secretary(String name){
        this.name = name;
    }

    //同事列表
    private ArrayList<StockObserver> list = new ArrayList<StockObserver>();

    private String action;

    //增加同事
    public void attach(StockObserver observer){
        list.add(observer);
    }

    //通知
    public void notifyEmployee(){
        for (StockObserver item : list)
            item.update();
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
}
