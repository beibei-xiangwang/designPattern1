package com.beibei.design.pattern.creational.singleton;

import java.io.*;
import java.lang.reflect.InvocationTargetException;

public class Test {

    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
//        LazySingleton lazySingleton = LazySingleton.getInstance();


//        Thread t1 = new Thread(new T());
//        Thread t2 = new Thread(new T());
//        t1.start();
//        t2.start();
//        System.out.println("program end");



        EnumInstance instance = EnumInstance.getInstance();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton"));
        oos.writeObject(instance);
        File file = new File("singleton");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        EnumInstance newInstance = (EnumInstance) ois.readObject();
//
        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(instance == newInstance);


        //反射攻击解决方案
//        Class<HungrySingleton> objectClass = HungrySingleton.class;
//        Constructor<HungrySingleton> constructor = objectClass.getDeclaredConstructor();
//        constructor.setAccessible(true);
//
//        HungrySingleton instance = HungrySingleton.getInstance();
//        HungrySingleton newInstance = constructor.newInstance();
//
//        System.out.println(instance);
//        System.out.println(newInstance);
//        System.out.println(instance == newInstance);




    }
}
