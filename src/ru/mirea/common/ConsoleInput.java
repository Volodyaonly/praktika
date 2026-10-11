package ru.mirea.common;

import java.util.Scanner;

/** Чтение консольного ввода с понятным сообщением при ошибке или конце ввода. */
public final class ConsoleInput {
    private ConsoleInput() {
    }

    public static int readInt(Scanner scanner, String prompt) {
        return readInt(scanner, prompt, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public static int readInt(Scanner scanner, String prompt, int minimum, int maximum) {
        while (true) {
            System.out.print(prompt);
            if (!scanner.hasNext()) {
                throw new IllegalArgumentException("Ввод завершён: ожидалось целое число.");
            }
            if (!scanner.hasNextInt()) {
                scanner.next();
                System.out.println("Ошибка: введите целое число.");
                continue;
            }
            int value = scanner.nextInt();
            if (value >= minimum && value <= maximum) {
                return value;
            }
            System.out.printf("Ошибка: число должно быть от %d до %d.%n", minimum, maximum);
        }
    }

    public static String readLine(Scanner scanner, String prompt) {
        System.out.print(prompt);
        if (!scanner.hasNextLine()) {
            throw new IllegalArgumentException("Ввод завершён: ожидалась строка.");
        }
        return scanner.nextLine();
    }
}
