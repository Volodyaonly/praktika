package ru.mirea.lab2.task06;

public class Circle {
    private double radius;
    public Circle(double radius) {
        setRadius(radius);
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
    public double getLength() {
        return 2 * Math.PI * radius;
    }
    public boolean isBigger(Circle other) {
        return this.radius > other.radius;
    }
    @Override
    public String toString() {
        return "Circle{radius=" + radius + "}";
    }
}
