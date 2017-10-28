package com.bvan.oop.lessons3_4.hw.rectangle;

import java.util.ArrayList;

/**
 * @author bvanchuhov
 */
public class RectanglesRunner {

    public static void main(String[] args) {
        Rectangles rectangles = new Rectangles();
        rectangles.add(new Rectangle(10.0, 20.0));
        rectangles.add(new Rectangle(2.0, 1.0));

        double area = rectangles.getArea();
        System.out.println("area = " + area);

        Rectangle withMinPerimeter = rectangles.getWithMinPerimeter();
        System.out.println("withMinPerimeter = " + withMinPerimeter);
    }
}
