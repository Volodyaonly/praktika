package ru.mirea.lab13.task05;

public class Main {
    public static void main(String[] args) {
        String[] numbers = {"+79175655655", "+104289652211", "89175655655"};
        for (String number : numbers) System.out.println(PhoneNumber.format(number));
    }
}
