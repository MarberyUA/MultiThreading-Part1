package com.dev.multithreading;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();

        Thread thread1 = new MultiThreadedThroughExtendsThread("1", counter);
        thread1.start();

        Runnable runnable = new MultiThreadedThroughImplementsRunnable("2", counter);
        Thread thread2 = new Thread(runnable);
        thread2.start();
    }
}
