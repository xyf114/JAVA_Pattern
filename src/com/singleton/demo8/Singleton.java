package com.singleton.demo8;

/**
 * 静态内部类
 */
public class Singleton {
    private static boolean flag = false;
    
    private Singleton(){
        synchronized(Singleton.class){
            if(flag){
                throw new RuntimeException("不能创造多个实例");
            }
            flag = true;            
        }
    }

    private static class SingletonHolder{
        private static final Singleton  INSTANCE = new Singleton();
    }

    public static Singleton gSingleton() {
        return SingletonHolder.INSTANCE;
    }
}
