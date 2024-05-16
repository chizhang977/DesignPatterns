package com.justin.memento.basic;
//管理者
public class Caretaker {
    private Memento memento;
    public void setMemento(Memento memento) {
        this.memento = memento;
    }
    public Memento getMemento() {
        return memento;
    }
}
