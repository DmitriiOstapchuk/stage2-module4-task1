package com.mjc.stage2;

public class ThreadSafeSingleton {
    private static volatile ThreadSafeSingleton instance;

    private ThreadSafeSingleton () {
        instance = new ThreadSafeSingleton();
    }

    public static ThreadSafeSingleton getInstance() {
       synchronized (ThreadSafeSingleton.class) {
           if (instance == null) {
               return new ThreadSafeSingleton();
           } else {
               return instance;
           }
       }
    }
}
