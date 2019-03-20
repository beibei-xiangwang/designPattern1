package com.beibei.design.pattern.creational.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class LazySingleton {
    private static LazySingleton lazySingleton = null;
    private static boolean flag = true;

    private LazySingleton() {
        if (flag) {
            flag = false;
        } else {
            throw new RuntimeException("单利构造器禁止反射调用");
        }
    }
//  同步锁消耗资源 加锁 解锁的开销  synchronized 修饰 static方法 锁的是整个类 对性能有影响
//    public synchronized static LazySingleton getInstance() {
//        if (lazySingleton == null) {
//            lazySingleton = new LazySingleton();
//        }
//        return lazySingleton;
//    }

    public synchronized static LazySingleton getInstance() {
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        Class<LazySingleton> objectClass = LazySingleton.class;
        Constructor<LazySingleton> constructor = objectClass.getDeclaredConstructor();
        constructor.setAccessible(true);

        LazySingleton o1 = LazySingleton.getInstance();

// 反射攻击成功
        Field flag = o1.getClass().getDeclaredField("flag");
        flag.setAccessible(true);
        flag.set(o1,true);

        LazySingleton o2 = constructor.newInstance();
        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o1 == o2);

    }


}
