package com.justin.facade;

public class DvdPlayer {

    //使用单例模式, 使用饿汉式
    private static DvdPlayer instance = new DvdPlayer();

    public static DvdPlayer getInstanc() {
        return instance;
    }

    public void on() {
        System.out.println(" dvd on ");
    }
    public void off() {
        System.out.println(" dvd off ");
    }

    public void play() {
        System.out.println(" dvd is playing ");
    }

    //....
    public void pause() {
        System.out.println(" dvd pause ..");
    }
}
