package ru.mirea.lab2.task03;

/** Практика 2, задание 3: Окружности и сортировка. */
public class Main {
    public static void main(String[] args) {
        Circle[] circles = new Circle[5];
        circles[0] = new Circle(new Point(0, 0), 5.0);
        circles[1] = new Circle(new Point(1, 1), 2.0);
        circles[2] = new Circle(new Point(2, 2), 10.0);
        circles[3] = new Circle(new Point(3, 3), 1.0);
        circles[4] = new Circle(new Point(4, 4), 7.0);
        Tester tester = new Tester(circles, circles.length);
        System.out.println("Самая маленькая окружность: " + tester.findSmallest());
        System.out.println("Самая большая окружность: " + tester.findLargest());
        tester.sortByRadius();
        System.out.println("Отсортированные окружности:");
        for (Circle circle : circles) System.out.println(circle);
    }
}
