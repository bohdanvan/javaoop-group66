package com.bvan.oop.lessons3_4.shape;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class SumPerimeterRunner {

    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();

        shapes.add(new Rectangle(10.0, 20.0)); // 60
        shapes.add(new Circle(10.0)); // 2 * 3.14 * 10 = 62

        double sumPerimeter = getSumPerimeter(shapes);
        System.out.println("sumPerimeter = " + sumPerimeter);

        Shape shape = shapes.get(0);
        if (shape instanceof Rectangle) {
            Rectangle rectangle = (Rectangle) shapes.get(1);
            System.out.println(rectangle.getWidth());
        }
    }

    public static double getSumPerimeter(List<Shape> shapes) {
        double perimeter = 0.0;
        for (Shape shape : shapes) {
            perimeter += shape.getPerimeter();
        }
        return perimeter;
    }
}
