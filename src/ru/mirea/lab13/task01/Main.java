package ru.mirea.lab13.task01;

public class Main {
    public static void showString(String text) {
        System.out.println("Строка: " + text);
        System.out.println("Последний символ: " + (text.isEmpty() ? "отсутствует" : text.charAt(text.length() - 1)));
        System.out.println("Заканчивается на !!!: " + text.endsWith("!!!"));
        System.out.println("Начинается с I like: " + text.startsWith("I like"));
        System.out.println("Содержит Java: " + text.contains("Java"));
        System.out.println("Позиция Java: " + text.indexOf("Java"));
        System.out.println("Замена a на o: " + text.replace('a', 'o'));
        System.out.println("Верхний регистр: " + text.toUpperCase());
        System.out.println("Нижний регистр: " + text.toLowerCase());
        int start = text.indexOf("Java");
        System.out.println("Подстрока Java: " + (start < 0 ? "не найдена" : text.substring(start, start + 4)));
    }

    public static void main(String[] args) {
        showString("I like Java!!!");
    }
}
