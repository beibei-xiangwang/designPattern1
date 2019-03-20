package com.beibei.design.pattern.creational.singleton;

import java.io.Serializable;

public class HungrySingleton implements Serializable,Cloneable {
    private final static HungrySingleton hungrySingleton = new HungrySingleton();

//    private  static HungrySingleton hungrySingleton = null;
//    static {
//        hungrySingleton = new HungrySingleton();
//    }

    //在类加载生成实例 防止反射
    private HungrySingleton() {
        if (hungrySingleton != null) {
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }

    private Object readResolve() {
        return hungrySingleton;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return getInstance();
    }
}
