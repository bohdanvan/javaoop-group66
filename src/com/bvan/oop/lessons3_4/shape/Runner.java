package com.bvan.oop.lessons3_4.shape;

/**
 * @author bvanchuhov
 */
public class Runner {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10.0, 20.0);
        double p1 = rectangle.getPerimeter();

        Circle circle = new Circle(10.0);
        double p2 = circle.getPerimeter();

        Shape shape = new Circle(10.0);

        printInfo(new Rectangle(10.0, 20.0));
        printInfo(new Circle(10.0));
    }

    public static void printInfo(Shape shape) {
        System.out.println("P = " + shape.getPerimeter());
        System.out.println("S = " + shape.getArea());
    }
}
