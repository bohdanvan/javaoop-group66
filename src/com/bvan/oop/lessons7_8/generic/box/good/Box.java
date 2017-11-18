package com.bvan.oop.lessons7_8.generic.box.good;

import com.bvan.oop.lessons7_8.generic.box.Cat;

import java.io.Serializable;

/**
 * @author bvanchuhov
 */
public class Box<T> {

    private final T value;

    public Box(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }

    @Override
    public String toString() {
        return "Box{" +
                "value=" + value +
                '}';
    }
}
