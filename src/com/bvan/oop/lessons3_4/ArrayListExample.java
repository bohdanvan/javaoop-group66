package com.bvan.oop.lessons3_4;

import java.util.ArrayList;

/**
 * @author bvanchuhov
 */
public class ArrayListExample {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        for (int i = 0; i < 1000; i++) {
            list.add(i);
        }

        Integer integer = list.get(10);

        System.out.println(list);
        System.out.println(integer);
    }
}
