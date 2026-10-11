package ru.mirea.lab3.formatting.task01;

import java.util.Formatter;

/** Практика 3: Форматирование чисел. */
public class Main {
    public static void main(String[] args) {
        double exponent = 11.635;
        double quotient = 1000.0 / 3.0;
        System.out.printf("Значение e = %.3f%n", Math.E);
        System.out.printf("exp(%.3f) = %.3f%n", exponent, Math.exp(exponent));
        System.out.printf("Число y с точностью 2 знака: %.2f%n", quotient);
        System.out.printf("Число y с шириной 10 и точностью 2: %10.2f%n", quotient);
        System.out.printf("Процент: %.2f%%%n", 0.756 * 100);
        Formatter formatter = new Formatter();
        formatter.format("Строка с форматированием: %.2f%n", quotient);
        formatter.format("Строка с форматированием: %8.2f%n", quotient);
        formatter.format("Строка с форматированием: %16.2f%n", quotient);
        System.out.println(formatter);
        formatter.close();
    }
}
