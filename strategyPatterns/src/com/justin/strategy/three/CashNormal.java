package com.justin.strategy.three;

public class CashNormal extends CashSuper{
    @Override
    public double acceptCash(double price, int num) {
        return price * num;
    }
}
