package com.bvan.oop.lessons11_12.multithreading;

/**
 * @author bvanchuhov
 */
public class Bar {

    public static void main(String[] args) {
        ThreadUtils.println("Bar is opened");

        for (int drinker = 1; drinker <= 2; drinker++) {
            Runnable runnable = new Drinker(drinker);
            Thread thread = new Thread(runnable);
            thread.start();
        }

        ThreadUtils.println("Bar is closed");
    }
}

