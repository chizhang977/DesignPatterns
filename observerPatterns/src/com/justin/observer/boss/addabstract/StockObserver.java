package com.justin.observer.boss.addabstract;

//同事类
public class StockObserver extends Observer{


    public StockObserver(String name, Secretary sub) {
        super(name,sub);
    }
    public void update() {
        System.out.println(sub.getAction() + "，" + name + "关闭股票行情，继续工作！");
    }
}
