package com.justin.observer.boss.addabstract;

//同事类
public class NBAObserver extends Observer{


    public NBAObserver(String name, Secretary sub) {
        super(name,sub);
    }
    public void update() {
        System.out.println(sub.getAction() + "，" + name + "关闭NBA，继续工作！");
    }
}
