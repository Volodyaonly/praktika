package ru.mirea.lab7.math;

/** Практика 7: Математический интерфейс. */
public class Main {
    public static void main(String[] args) {
        MathCalculable calculator = new MathFunc();

        System.out.println("PI = " + MathCalculable.PI);
        System.out.println("Модуль комплексного числа (3, 4) = " + calculator.modulus(3, 4));
        System.out.println("Степень 2^10 = " + calculator.power(2, 10));

        double radius = 5.0;
        double length = 2 * MathCalculable.PI * radius;
        System.out.println("Длина окружности радиуса " + radius + " = " + length);
    }
}
