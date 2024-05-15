package com.justin.chain;

public class Clinet {
    public static void main(String[] args) {
        Hander h1 = new ConcreteHandler1();
        Hander h2 = new ConcreteHandler2();
        Hander h3 = new ConcreteHandler3();
        h1.setSuccessor(h2);
        h2.setSuccessor(h3);

        int[] requests = {2, 5, 14, 22, 18, 3, 27, 20};
        for (int request : requests)
            h1.handleRequest(request);
    }
}
