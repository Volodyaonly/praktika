package ru.mirea.lab3.wrappers.task02;

/** Практика 3: Преобразования числовых оболочек. */
public class Main {
    public static void main(String[] args) {
        Byte byteNumber = 10;
        Double doubleNumber = 3.99;
        Float floatNumber = 2.5f;
        Integer integerNumber = 42;
        Long longNumber = 100L;
        Short shortNumber = 7;

        System.out.println("byteValue:   " + byteNumber.byteValue() + ", " + doubleNumber.byteValue() + ", "
                + floatNumber.byteValue() + ", " + integerNumber.byteValue() + ", " + longNumber.byteValue() + ", " + shortNumber.byteValue());
        System.out.println("doubleValue: " + byteNumber.doubleValue() + ", " + doubleNumber.doubleValue() + ", "
                + floatNumber.doubleValue() + ", " + integerNumber.doubleValue() + ", " + longNumber.doubleValue() + ", " + shortNumber.doubleValue());
        System.out.println("floatValue:  " + byteNumber.floatValue() + ", " + doubleNumber.floatValue() + ", "
                + floatNumber.floatValue() + ", " + integerNumber.floatValue() + ", " + longNumber.floatValue() + ", " + shortNumber.floatValue());
        System.out.println("intValue:    " + byteNumber.intValue() + ", " + doubleNumber.intValue() + ", "
                + floatNumber.intValue() + ", " + integerNumber.intValue() + ", " + longNumber.intValue() + ", " + shortNumber.intValue());
        System.out.println("longValue:   " + byteNumber.longValue() + ", " + doubleNumber.longValue() + ", "
                + floatNumber.longValue() + ", " + integerNumber.longValue() + ", " + longNumber.longValue() + ", " + shortNumber.longValue());
        System.out.println("shortValue:  " + byteNumber.shortValue() + ", " + doubleNumber.shortValue() + ", "
                + floatNumber.shortValue() + ", " + integerNumber.shortValue() + ", " + longNumber.shortValue() + ", " + shortNumber.shortValue());

        System.out.println("parseInt:    " + Integer.parseInt("123"));
        System.out.println("parseDouble: " + Double.parseDouble("3.14"));
        System.out.println("parseBoolean:" + Boolean.parseBoolean("true"));
        System.out.println("parseByte:   " + Byte.parseByte("12"));
        System.out.println("parseFloat:  " + Float.parseFloat("2.5"));
        System.out.println("parseLong:   " + Long.parseLong("999"));
        System.out.println("parseShort:  " + Short.parseShort("5"));
    }
}
