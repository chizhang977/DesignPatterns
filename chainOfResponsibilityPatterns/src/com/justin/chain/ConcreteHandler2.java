package com.justin.chain;

public class ConcreteHandler2 extends Hander{
    @Override
    public void handleRequest(int request) {
        if (request >= 10 && request < 20){
            System.out.println(this.getClass().getSimpleName()+"处理请求"+request);
        }else if (successor != null){
            successor.handleRequest(request);
        }
    }
}
