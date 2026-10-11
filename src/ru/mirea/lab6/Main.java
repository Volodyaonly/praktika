package ru.mirea.lab6;

import ru.mirea.common.Printable;

import ru.mirea.common.movement.MovablePoint;
import ru.mirea.common.movement.MovableCircle;
import ru.mirea.common.movement.MovableRectangle;

/** Практика 6: интерфейсы движения, названия, цены и печати. */
public class Main {
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(0, 0, 1, 2);
        System.out.println(point);
        point.moveUp(); point.moveRight();
        System.out.println("После moveUp+moveRight: " + point);
        MovableCircle circle = new MovableCircle(5, 5, 1, 1, 10);
        System.out.println(circle);
        circle.moveDown(); circle.moveLeft();
        System.out.println("После moveDown+moveLeft: " + circle);
        MovableRectangle rectangle = new MovableRectangle(0, 0, 4, 4, 1, 1);
        System.out.println("SpeedTest: " + rectangle.speedTest());
        rectangle.moveUp();
        System.out.println("После moveUp: " + rectangle);
        Planet planet = new Planet("Земля");
        Animal animal = new Animal("Лев");
        Car car = new Car("Toyota");
        System.out.println(planet.getName());
        System.out.println(animal.getName());
        System.out.println(car.getName());
        Priceable[] items = { new BookP("Война и мир", 1500), new Phone("iPhone", 90000) };
        for (Priceable item : items) System.out.println("Цена: " + item.getPrice());
        Printable[] printables = {
                new BookP("Война и мир", 1500),
                new BookP("Отцы и дети", 1200),
                new ShopP("М.Видео"),
                new Magazine("Хакер"),
                new Magazine("Наука и жизнь")
        };
        for (Printable item : printables) item.print();
        System.out.println("\nТолько журналы:");
        Magazine.printMagazines(printables);
        System.out.println("\nТолько книги:");
        BookP.printBooks(printables);
    }
}
