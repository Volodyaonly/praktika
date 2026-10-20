package ru.mirea.lab1.task05;

import java.math.BigInteger;
import java.util.Scanner;

/** Практика 1: вычисление факториала. */
public class Main {
    public static BigInteger factorial(int number) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= number; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner;
        if (args.length > 0) {
            scanner = new Scanner(args[0]);
        } else {
            System.out.print("Введите число для факториала: ");
            scanner = new Scanner(System.in);
        }

        if (!scanner.hasNextInt()) {
            if (!scanner.hasNext()) {
                System.out.println("Ввод завершён");
            } else {
                System.out.println("Ошибка: введите целое число");
            }
            return;
        }

        int number = scanner.nextInt();
        if (number < 0) {
            System.out.println("Факториал определён только для неотрицательных чисел.");
            return;
        }
        System.out.println(number + "! = " + factorial(number));
    }
}
