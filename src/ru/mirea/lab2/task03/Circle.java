package ru.mirea.lab2.task03;

public class Circle {
    private final Point center;
    private final double radius;
    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }
    public Point getCenter() {
        return center;
    }
    public double getRadius() {
        return radius;
    }
    public double getLength() {
        return 2 * Math.PI * radius;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
    @Override
    public String toString() {
        return "Circle{center=" + center + ", radius=" + radius + "}";
    }
}
