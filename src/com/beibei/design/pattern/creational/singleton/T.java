package com.beibei.design.pattern.creational.singleton;

public class T implements Runnable {
    @Override
    public void run() {
//        LazySingleton lazySingleton = LazySingleton.getInstance();
//        System.out.println(Thread.currentThread().getName() + " " + lazySingleton);

//        LazyDoubleCheckSingleton instance = LazyDoubleCheckSingleton.getInstance();
//        System.out.println(Thread.currentThread().getName() + " " + instance);

        StaticInnerClassSingleton instance = StaticInnerClassSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + " " + instance);
    }
}
