package com.bvan.oop.lessons11_12.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author bvanchuhov
 */
public class BarWithExecutorService {

    public static void main(String[] args) {
        ThreadUtils.println("Bar is opened");

        ExecutorService executorService =
                Executors.newCachedThreadPool();

        for (int drinker = 1; drinker <= 3; drinker++) {
            Runnable runnable = new Drinker(drinker);
            executorService.submit(runnable);
        }

        executorService.shutdown();

        ThreadUtils.println("Bar is closed");
    }
}
