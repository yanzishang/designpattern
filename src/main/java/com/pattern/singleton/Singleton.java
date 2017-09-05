package com.pattern.singleton;

/**
 * 单例模式
 */
public class Singleton {

    private Singleton() {

    }

    private static class SingletonFactory {
        private static Singleton singleton = new Singleton();
    }

    public static Singleton getSingleton() {
        return SingletonFactory.singleton;
    }
}
