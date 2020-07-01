package com.dev.multithreading;

public class Main {
    public static void main(String[] args) {
        Thread thread1 = new MultiThreadedThroughExtendsThread("1");
        thread1.start();

        Runnable runnable = new MultiThreadedThroughImplementsRunnable("2");
        Thread thread2 = new Thread(runnable);
        thread2.start();
    }
}
