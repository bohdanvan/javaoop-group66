package com.bvan.oop.lessons7_8.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class GenericExample {

    public static void main(String[] args) {
        List<Integer> names = new ArrayList<>();

        names.add(Integer.valueOf(1));
        names.add(2);

        System.out.println(names);
    }
}
