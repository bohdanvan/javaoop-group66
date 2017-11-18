package com.bvan.oop.lessons7_8.generic.format;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class Printer<T> {

    private final List<T> elems = new ArrayList<>();

    public void add(T elem) {
        elems.add(elem);
    }

    public void print(Formatter<T> formatter) {
        for (T elem : elems) {
            String s = formatter.format(elem);
            System.out.println(s);
        }
    }
}
