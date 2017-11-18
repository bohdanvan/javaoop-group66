package com.bvan.oop.lessons7_8.generic.box.good;

import com.bvan.oop.lessons7_8.generic.box.Cat;
import com.bvan.oop.lessons7_8.generic.box.Dog;

import java.util.List;

/**
 * @author bvanchuhov
 */
public class BoxRunner {

    public static void main(String[] args) {
        Box<Cat> catBox = new Box<>(new Cat());
        Box<Dog> dogBox = new Box<>(new Dog());

        sendBox(catBox);
    }

    private static void sendBox(Box<Cat> catBox) {
        Cat cat = catBox.get();
        cat.meow();
    }
}
