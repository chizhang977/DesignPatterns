package com.justin.observer.boss.basic;
//同事类
public class StockObserver {
    private String name;
    private Secretary sub;

    public StockObserver(String name, Secretary sub) {
        this.name = name;
        this.sub = sub;
    }
    public void update() {
        System.out.println(sub.getAction() + "，" + name + "关闭股票行情，继续工作！");
    }
}
