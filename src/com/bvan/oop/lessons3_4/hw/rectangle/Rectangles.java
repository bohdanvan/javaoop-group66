package com.bvan.oop.lessons3_4.hw.rectangle;

import java.util.ArrayList;

/**
 * @author bvanchuhov
 */
public class Rectangles {

    private final ArrayList<Rectangle> rectangles
            = new ArrayList<>();

    public void add(Rectangle rectangle) {
        rectangles.add(rectangle);
    }

    public double getArea() {
        double sum = 0.0;
        for (Rectangle rectangle : rectangles) {
            sum += rectangle.getArea();
        }
        return sum;
    }

    public Rectangle getWithMinPerimeter() {
        if (rectangles.isEmpty()) {
            throw new IllegalStateException("empty rectangles");
        }

        Rectangle res = rectangles.get(0);

        for (Rectangle rectangle : rectangles) {
            if (res.getPerimeter() > rectangle.getPerimeter()) {
                res = rectangle;
            }
        }

        return res;
    }

    @Override
    public String toString() {
        return "Rectangles{" +
                "rectangles=" + rectangles +
                '}';
    }
}
