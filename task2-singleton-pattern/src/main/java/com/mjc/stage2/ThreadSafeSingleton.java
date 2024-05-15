package com.mjc.stage2;

public class ThreadSafeSingleton {
    private ThreadSafeSingleton instance = null;

    private ThreadSafeSingleton () {
        instance = new ThreadSafeSingleton();
    }

    public ThreadSafeSingleton getInstance() {
       synchronized (ThreadSafeSingleton.class) {
           if (instance == null) {
               return new ThreadSafeSingleton();
           } else {
               return instance;
           }
       }
    }
}
