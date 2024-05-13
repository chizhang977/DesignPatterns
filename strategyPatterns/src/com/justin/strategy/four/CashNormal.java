package com.justin.strategy.four;
//正常收费，策略实现类
public class CashNormal extends CashSuper {

    //正常收费，原价返回
    public double acceptCash(double price,int num){
        return price * num;
    }
    
}
