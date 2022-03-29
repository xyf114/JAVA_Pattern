package com.singleton.demo8;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 反射破坏单例
 */
public class Client {
    public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        //反射
        Class<Singleton> class_Singleton = Singleton.class;
        Constructor<Singleton> constructor = class_Singleton.getDeclaredConstructor();
        constructor.setAccessible(true);

        Singleton instance1 = (Singleton)constructor.newInstance();
        //Singleton instance2 = (Singleton)constructor.newInstance();
        System.out.println(instance1);
        //System.out.println(instance2);
    }


}
