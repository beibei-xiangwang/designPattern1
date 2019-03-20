package com.beibei.design.pattern.creational.singleton;

public class LazyDoubleCheckSingleton {
    private volatile static LazyDoubleCheckSingleton lazyDoubleCheckSingleton = null;

    private LazyDoubleCheckSingleton() {
    }

    public static LazyDoubleCheckSingleton getInstance() {
        if (lazyDoubleCheckSingleton == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                if (lazyDoubleCheckSingleton == null) {
                    lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
                    //有问题 指令重排序
                    //1。分配内存给这个对象
                    //2。初始化对象
                    //3。设置 lazyDoubleCheckSingleton 指向刚分配的内存地址
                    //------2。3。步骤可能颠倒  lazyDoubleCheckSingleton不为null，但这个对象还没初始化完
                    //intra-thread semantic 规定 保证重排序不会改变单线程内程序执行结果


                    //两种解决办法
                    //1。不允许2，3步骤重排序  加 volatile
                    //2。允许重排序，但不允许其他线程看到这个重排序
                }
            }
        }
        return lazyDoubleCheckSingleton;
    }

}
