package com.justin.observer.boss.addabstract;

public class Client {
    public static void main(String[] args) {
        Secretary secretary = new Secretary("justin");

        StockObserver employee = new StockObserver("marry", secretary);
        StockObserver employee1 = new StockObserver("job", secretary);

        secretary.attach(employee);
        secretary.attach(employee1);

        secretary.setAction("老板回来了");
        secretary.notifyEmployee();
    }
}
