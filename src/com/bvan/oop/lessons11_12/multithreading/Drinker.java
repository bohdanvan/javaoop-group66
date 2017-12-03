package com.bvan.oop.lessons11_12.multithreading;

/**
 * @author bvanchuhov
 */
public class Drinker implements Runnable {

    private final int id;

    public Drinker(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            ThreadUtils.println(drinkerInfo() + "I'm drinking " + i + " beer");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private String drinkerInfo() {
        return "I'm " + id + " drinker. ";
    }
}
