package com.singleton.demo7;
/**静态内部类
 * 序列化-实例化不同单例
 */
import java.io.Serializable;

public class Singleton implements Serializable {
    private Singleton(){}

    private static class SingletonHolder{
        private static Singleton INSTANCE  = new Singleton();
    }

    public static Singleton gSingleton() {
        return SingletonHolder.INSTANCE;
    }
    
    //当进行反序列化时会自动调用该方法，并将该方法的返回值直接返回
    public Object readResolve(){
        return SingletonHolder.INSTANCE;
    }
}
