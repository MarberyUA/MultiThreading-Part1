package com.dev.multithreading;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class MultiThreadedThroughExtendsThread extends Thread {
    private static final Logger LOGGER = LogManager
            .getLogger(MultiThreadedThroughExtendsThread.class);
    private Thread thread;
    private String threadName;
    private Counter incrementedObject;

    public MultiThreadedThroughExtendsThread(String name, Counter object) {
        threadName = name;
        incrementedObject = object;
        LOGGER.info("Creating " + threadName);
    }

    @Override
    public void run() {
        LOGGER.info("Running " + threadName);
        while (incrementedObject.getCount() != 100) {
            incrementedObject.increment();
            LOGGER.info("Thread-" + threadName + " value " + incrementedObject.getCount());
        }
    }

    @Override
    public void start() {
        if (thread == null) {
            thread = new Thread(this, threadName);
            thread.start();
        }
    }
}
