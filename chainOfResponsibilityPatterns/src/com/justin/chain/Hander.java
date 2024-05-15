package com.justin.chain;
//Handler类
public abstract class Hander {
    protected Hander successor;

    //设置后继处理者
    public void setSuccessor(Hander successor) {
        this.successor = successor;
    }
    //处理请求
    public abstract void handleRequest(int request);
}
