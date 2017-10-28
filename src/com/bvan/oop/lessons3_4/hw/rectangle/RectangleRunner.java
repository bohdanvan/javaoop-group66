package com.bvan.oop.lessons3_4.hw.rectangle;

/**
 * @author bvanchuhov
 */
public class RectangleRunner {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10.0, 20.0);

        System.out.println("S = " + rectangle.getArea());
        System.out.println("P = " + rectangle.getPerimeter());

        System.out.println(rectangle);

        Rectangle square = Rectangle.createSquare(10.0);

    }
}
