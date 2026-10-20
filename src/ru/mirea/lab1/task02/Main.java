package ru.mirea.lab1.task02;

import java.util.Scanner;

/** Практика 1: сумма, минимум и максимум массива. */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length;

        while (true) {
            System.out.print("Введите длину массива: ");
            if (!scanner.hasNext()) {
                System.out.println("Ввод завершён");
                return;
            }
            if (!scanner.hasNextInt()) {
                scanner.next();
                System.out.println("Ошибка: введите целое число");
                continue;
            }
            length = scanner.nextInt();
            if (length > 0) {
                break;
            }
            System.out.println("Ошибка: длина должна быть больше нуля");
        }

        int[] values = new int[length];
        for (int i = 0; i < values.length; i++) {
            System.out.print("Введите элемент " + i + ": ");
            while (!scanner.hasNextInt()) {
                if (!scanner.hasNext()) {
                    System.out.println("Ввод завершён");
                    return;
                }
                scanner.next();
                System.out.println("Ошибка: введите целое число");
            }
            values[i] = scanner.nextInt();
        }

        long sum = 0;
        int i = 0;
        while (i < values.length) {
            sum += values[i];
            i++;
        }

        int minimum = values[0];
        int maximum = values[0];
        i = 0;
        do {
            if (values[i] < minimum) {
                minimum = values[i];
            }
            if (values[i] > maximum) {
                maximum = values[i];
            }
            i++;
        } while (i < values.length);

        System.out.println("Сумма: " + sum);
        System.out.println("Максимум: " + maximum);
        System.out.println("Минимум: " + minimum);
    }
}
