package com.singleton.demo5;

public class Client {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getSingletonInstance();
        Singleton instance2 = Singleton.getSingletonInstance();
        System.out.println(instance1 == instance2);
        //证明只实例化了一个实例
    }
}
