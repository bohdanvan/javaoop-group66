package com.bvan.oop.lessons1_2.dynamic_array.oop;

import java.util.Arrays;
import java.util.StringJoiner;

/**
 * @author bvanchuhov
 */
public class DynamicArray {

    private static final int DEFAULT_CAPACITY = 8;
    private static final double DEFAULT_GROW_FACTOR = 1.5;

    private int[] elems;
    private int size;
    private final double growFactor;

    public DynamicArray(int initCapacity, double growFactor) {
        this.elems = new int[initCapacity];
        this.size = 0;
        this.growFactor = growFactor;
    }

    public DynamicArray(int initCapacity) {
        this(initCapacity, DEFAULT_GROW_FACTOR);
    }

    public DynamicArray() {
        this(DEFAULT_CAPACITY);
    }

    public void addLast(int n) {
        if (size == elems.length) {
            int newLength = (int)(growFactor * elems.length);
            elems = Arrays.copyOf(elems, newLength);
        }
        elems[size] = n;
        size++;
    }

    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "[", "]");
        for (int i = 0; i < size; i++) {
            String s = String.valueOf(elems[i]);
            joiner.add(s);
        }
        return joiner.toString();
    }
}
