package ru.mirea.lab7.movement;

import ru.mirea.common.movement.MovablePoint;
import ru.mirea.common.movement.MovableRectangle;

/** Практика 7: Движение фигур. */
public class Main {
    public static void main(String[] args) {
        MovableRectangle rectangle = new MovableRectangle(0, 0, 10, 10, 2, 3);
        System.out.println(rectangle);
        System.out.println("SpeedTest: " + rectangle.speedTest());
        rectangle.moveUp();
        rectangle.moveRight();
        System.out.println("После движения: " + rectangle);

        MovablePoint point = new MovablePoint(5, 5, 1, 1);
        System.out.println(point);
        point.moveDown();
        point.moveLeft();
        System.out.println("После движения: " + point);
    }
}
