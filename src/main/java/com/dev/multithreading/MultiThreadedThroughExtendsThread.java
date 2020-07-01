package com.dev.multithreading;

import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;

public class MultiThreadedThroughExtendsThread extends Thread {
    private static final Logger LOGGER = LogManager.getLogger(MultiThreadedThroughExtendsThread.class);
    private Thread t;
    private String threadName;

    public MultiThreadedThroughExtendsThread(String name) {
        threadName = name;
        LOGGER.info("Creating " + threadName);
    }

    @Override
    public void run() {
        LOGGER.info("Running " +  threadName);
        for (int i = 0; i < 100; i++) {
            LOGGER.info("Thread-" + threadName + " value=" + i);
        }
    }

    @Override
    public void start() {
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }
}
