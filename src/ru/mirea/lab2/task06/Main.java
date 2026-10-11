package ru.mirea.lab2.task06;

/** Практика 2, задание 6: Площадь и длина окружности. */
public class Main {
    public static void main(String[] args) {
        Circle firstCircle = new Circle(5.0);
        Circle secondCircle = new Circle(7.5);
        System.out.println(firstCircle);
        System.out.println(secondCircle);
        System.out.println("Площадь c1 = " + firstCircle.getArea());
        System.out.println("Длина c2 = " + secondCircle.getLength());
        System.out.println("c1 больше c2? " + firstCircle.isBigger(secondCircle));
    }
}
