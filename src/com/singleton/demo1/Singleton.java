package com.singleton.demo1;
/**
 * 饿汉式-1
 * 不使用静态块
 * 由于使用了静态变量，会造成内存的浪费
 */
public class Singleton {
    //私有构造方法，外部不可实例化
    private Singleton(){}
    //在类中实例化本类对象
    private static Singleton instance = new Singleton();
    //提供一个公共访问方法
    public static Singleton getInstanSingleton(){
        return instance;
    }
}
