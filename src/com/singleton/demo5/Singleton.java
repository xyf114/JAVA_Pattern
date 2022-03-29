package com.singleton.demo5;
/**
 * 静态内部类
 */
public class Singleton {
    private Singleton(){}

    private static class SingletonHolder{
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getSingletonInstance() {
        return SingletonHolder.INSTANCE;
    }
}
