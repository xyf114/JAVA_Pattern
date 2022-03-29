package com.singleton.demo3;
/**
 * 懒汉式
 * 线程不安全
 */
public class Singleton {
    private Singleton(){}
    private static Singleton instance;//只声明了类的对象，而未实例化

    public static synchronized Singleton getInstanceSingleton() {
        /**
         * 判断 instance 是否为null 
         * 如果instance为空则实例化单例，
         * 如instance不为空则直接返回单例
         */
        if(instance == null){
        //线程1等待，线程2获取cpu控制权还会进入判断，会创建两个不同的实例。故使用synchronized         
            instance = new Singleton();
            return instance;
        }
        return instance;
    }
}
