package com.bvan.oop.lessons11_12.multithreading;

/**
 * @author bvanchuhov
 */
public class BarWithJoin {

    public static void main(String[] args) throws InterruptedException {
        ThreadUtils.println("Bar is opened");

        Thread drinkerThread = new Thread(new Drinker(0));
        drinkerThread.start();

        drinkerThread.join(3000);

        ThreadUtils.println("Bar is closed");
    }
}

