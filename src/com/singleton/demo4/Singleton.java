package com.singleton.demo4;
/**
 * 双重检查锁
 */
public class Singleton {
    private Singleton(){}
//volatile防止指令重排
    private static volatile Singleton instance;
//双重检查锁
    public static Singleton getInstanSingleton() {
        if(instance == null){
            synchronized(Singleton.class){
                if(instance == null){
                    instance = new Singleton();   
                }
            }
        }
        return instance;
    }
}
