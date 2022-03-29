package com.singleton.demo1;

public class Client {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstanSingleton();
        Singleton instance2 = Singleton.getInstanSingleton();
        System.out.println(instance1 == instance2);
        //证明只实例化了一个实例
    }
}
