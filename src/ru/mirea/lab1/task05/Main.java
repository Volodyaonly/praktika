package ru.mirea.lab1.task05;

import java.math.BigInteger;
import java.util.Scanner;
import ru.mirea.common.ConsoleInput;

/** Практика 1: факториал без переполнения int. */
public class Main {
    public static BigInteger factorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Факториал определён только для неотрицательных чисел.");
        }
        BigInteger result = BigInteger.ONE;
        for (long factor = 2; factor <= number; factor++) {
            result = result.multiply(BigInteger.valueOf(factor));
        }
        return result;
    }

    public static void main(String[] args) {
        try {
            int number;
            if (args.length > 0) {
                number = Integer.parseInt(args[0]);
            } else {
                try (Scanner scanner = new Scanner(System.in)) {
                    number = ConsoleInput.readInt(scanner, "Введите число для факториала: ", 0, Integer.MAX_VALUE);
                }
            }
            System.out.println(number + "! = " + factorial(number));
        } catch (NumberFormatException exception) {
            System.out.println("Ошибка: введите целое число.");
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
