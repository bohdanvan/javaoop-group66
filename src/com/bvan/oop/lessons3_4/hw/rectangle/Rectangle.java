package com.bvan.oop.lessons3_4.hw.rectangle;

/**
 * @author bvanchuhov
 */
public class Rectangle {

    private final double width;
    private final double height;

    public static Rectangle createSquare(double side) {
        return new Rectangle(side);
    }

    public Rectangle(double width, double height) {
        if (width < 0) {
            throw new IllegalArgumentException("negative width: " + width);
        }
        if (height < 0) {
            throw new IllegalArgumentException("negative height: " + height);
        }

        this.width = width;
        this.height = height;
    }

    public Rectangle(double side) {
        this(side, side);
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public double getArea() {
        return width * height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
