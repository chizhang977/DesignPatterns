package com.justin.memento.basic;

public class Client {
    public static void main(String[] args) {
        Originator o = new Originator();
        o.setState("On");
        o.show();

        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(o.createMemento());

        o.setState("Off");
        o.show();

        o.restoreMemento(caretaker.getMemento());
        o.show();
    }
}
