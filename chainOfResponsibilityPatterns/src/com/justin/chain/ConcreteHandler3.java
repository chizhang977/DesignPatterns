package com.justin.chain;

public class ConcreteHandler3 extends Hander{
    @Override
    public void handleRequest(int request) {
        if (request >= 20 && request < 30){
            System.out.println(this.getClass().getSimpleName()+"处理请求"+request);
        }else if (successor != null){
            successor.handleRequest(request);
        }
    }
}
