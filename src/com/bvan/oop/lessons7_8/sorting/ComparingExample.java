package com.bvan.oop.lessons7_8.sorting;

/**
 * @author bvanchuhov
 */
public class ComparingExample {

    public static void main(String[] args) {
        System.out.println("int:");
        System.out.println(Integer.compare(10, 20)); // < 0
        System.out.println(Integer.compare(40, 30)); // > 0
        System.out.println(Integer.compare(50, 50)); // 0
        System.out.println();

        System.out.println("String:");
        System.out.println("ABCD".compareTo("AXFG")); // < 0
        System.out.println("Home".compareTo("Home")); // 0
        System.out.println("Home".compareTo("Homework")); // < 0
        System.out.println();

        Integer x = 10;
        Integer y = 20;
        System.out.println(x.compareTo(y)); // < 0
    }
}
