package com.singleton.demo2;
/**
 * 饿汉式-2
 * 使用静态块
 * 由于使用了静态变量，会造成内存的浪费
 */
public class Singleton {
    private Singleton(){}
    private static Singleton instance;
    static {
        instance = new Singleton();
    }
    public static Singleton getInstanSingleton(){
        return instance;
    }
}
