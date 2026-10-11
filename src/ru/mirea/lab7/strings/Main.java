package ru.mirea.lab7.strings;

/** Практика 7: Обработка строк. */
public class Main {
    public static void main(String[] args) {
        StringProcessing processor = new ProcessStrings();
        String value = "Программирование";

        System.out.println("Исходная строка: " + value);
        System.out.println("Количество символов: " + processor.countChars(value));
        System.out.println("Символы на нечётных позициях: " + processor.oddPositions(value));
        System.out.println("Инвертированная строка: " + processor.reverse(value));
    }
}
