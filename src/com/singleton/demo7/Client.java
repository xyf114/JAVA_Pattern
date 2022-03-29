package com.singleton.demo7;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 序列化
 */
public class Client {
    public static void main(String[] args) throws Exception{
        //writeObjectToFile();
        readObjectToFile();
        readObjectToFile();
        //出现两个不同单例
    }
    
    public static void readObjectToFile() throws Exception{
        //从文件读取单例创建过程，反序列化
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/Users/xyfffx/Documents/java-learn/java_basic_learn/src/pattern/singleton/demo7/a.txt"));
        Singleton instance = (Singleton)ois.readObject();
        ois.close();
        System.out.println(instance);
    }

    public static void writeObjectToFile() throws Exception{
        //将单例创建过程写入文件，序列化
        Singleton instance = Singleton.gSingleton();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("/Users/xyfffx/Documents/java-learn/java_basic_learn/src/pattern/singleton/demo7/a.txt"));
        oos.writeObject(instance);
        oos.close();
    }
}
