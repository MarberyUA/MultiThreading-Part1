package com.dev.multithreading;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class MultiThreadedThroughImplementsRunnable implements Runnable {
    private static final Logger LOGGER = LogManager
            .getLogger(MultiThreadedThroughImplementsRunnable.class);
    private String threadName;
    private Counter incrementedObject;

    public MultiThreadedThroughImplementsRunnable(String name, Counter object) {
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
}
