package com.dev.multithreading;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class MultiThreadedThroughImplementsRunnable implements Runnable {
    private static final Logger LOGGER = LogManager.getLogger(MultiThreadedThroughImplementsRunnable.class);
    private String threadName;

    public MultiThreadedThroughImplementsRunnable(String name) {
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
}
