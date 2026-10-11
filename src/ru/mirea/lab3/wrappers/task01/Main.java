package ru.mirea.lab3.wrappers.task01;

/** Практика 3: Класс Double. */
public class Main {
    public static void main(String[] args) {
        Double firstValue = Double.valueOf(3.14);
        Double secondValue = Double.valueOf("2.71");
        double parsed = Double.parseDouble("5.55");
        System.out.println("parseDouble: " + parsed);
        double doubleValue = firstValue.doubleValue();
        float floatValue = firstValue.floatValue();
        int intValue = firstValue.intValue();
        long longValue = firstValue.longValue();
        short shortValue = firstValue.shortValue();
        byte byteValue = firstValue.byteValue();
        System.out.println("double: " + doubleValue + ", float: " + floatValue + ", int: " + intValue
                + ", long: " + longValue + ", short: " + shortValue + ", byte: " + byteValue);
        System.out.println("d1 = " + firstValue + ", d2 = " + secondValue);
        String stringValue = Double.toString(3.14);
        System.out.println("Строка: " + stringValue);
    }
}
