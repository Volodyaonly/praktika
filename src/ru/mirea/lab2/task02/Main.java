package ru.mirea.lab2.task02;

/** Практика 2, задание 2: Движение мяча. */
public class Main {
    public static void main(String[] args) {
        Ball firstBall = new Ball(1.0, 2.0);
        System.out.println(firstBall);
        Ball secondBall = new Ball();
        System.out.println(secondBall);
        firstBall.move(3.0, 4.0);
        System.out.println("После move: " + firstBall);
        secondBall.setXY(5.5, 6.5);
        System.out.println("После setXY: " + secondBall);
    }
}
