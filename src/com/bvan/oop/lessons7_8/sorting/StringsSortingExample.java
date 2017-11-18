package com.bvan.oop.lessons7_8.sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class StringsSortingExample {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Bob", "Phil");
        System.out.println("original: " + names);

        Collections.sort(names);
        System.out.println("sorted: " + names);
    }
}
