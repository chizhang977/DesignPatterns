package com.justin.observer.boss.basic2;


import java.util.ArrayList;

public class Test {

    public static void main(String[] args){



        Subject subject = new ConcreteSubject();
        subject.attach(new ConcreteObserver("NameX",subject));
        subject.attach(new ConcreteObserver("NameY",subject));
        subject.attach(new ConcreteObserver("NameZ",subject));
        subject.setSubjectState("ABC");

        subject.notifyObserver();


    }
}

//通知者抽象类
abstract class Subject{
    private ArrayList<Observer> list = new ArrayList<Observer>();//针对抽象的Observer编程

    //增加观察者
    public void attach(Observer observer){
        list.add(observer);
    }
    //减少观察者
    public void detach(Observer observer){
        list.remove(observer);
    }
    //通知观察者
    public void notifyObserver(){
        for(Observer item : list){
            item.update();
        }
    }
    protected String subjectState;
    public String getSubjectState(){
        return this.subjectState;
    }
    public void setSubjectState(String value){
        this.subjectState = value;
    }
}

//具体通知者
class ConcreteSubject extends Subject{
    //具体通知者的方法
}

//抽象观察者
abstract class Observer{
    public abstract void update();
}

//具体观察者类
class ConcreteObserver extends Observer{
    private String name;
    private Subject sub;
    public ConcreteObserver(String name,Subject sub){
        this.name = name;
        this.sub = sub;
    }
    public void update(){
        System.out.println("观察者"+this.name+"的新状态是"+this.sub.getSubjectState());
    }
}







