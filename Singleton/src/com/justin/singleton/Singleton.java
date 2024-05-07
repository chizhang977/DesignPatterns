package com.justin.singleton;

public class Singleton {
    // 饿汉式
   /* private static  final Singleton INSTANCE = new Singleton();
    private Singleton() {
    }
    public static Singleton getInstance() {
        return INSTANCE;
    }*/

    // 懒汉式
   /* private static  Singleton INSTANCE;
    private Singleton() {
    }
    public static Singleton getInstance() {
        if (INSTANCE == null){
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }*/

    //懒汉式， 线程安全
    /*private static  Singleton INSTANCE;
    private Singleton() {
    }
    public  static synchronized Singleton getInstance() {
        if (INSTANCE == null){
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }*/

    //双重检锁
   /* private static volatile Singleton INSTANCE;
    private Singleton() {
    }
    public static Singleton getInstance() {
        if (INSTANCE == null){
            synchronized (Singleton.class){
                if (INSTANCE == null){
                    INSTANCE = new Singleton();
                }
            }
        }
        return INSTANCE;
    }*/

    //静态内部类
    private Singleton() {
    }
    private static class SingletonHolder{
        public static final Singleton INSTANCE = new Singleton();
    }
    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }





    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton instance = Singleton.getInstance();
        System.out.println(instance==singleton);
        System.out.println(singleton);
    }
}
