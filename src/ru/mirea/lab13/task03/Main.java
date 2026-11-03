package ru.mirea.lab13.task03;

public class Main {
    public static void main(String[] args) {
        Address address = new Address();
        String[] examples = {
            "Россия, Московская область, Мытищи, Мира, 10, 1, 7",
            "Россия, Москва, Москва, Ленина, 2, 3, 15",
            "Россия; Московская область; Королёв; Пионерская; 3; 2; 11",
            "Россия. Москва. Москва. Тверская. 12. 1. 6"
        };

        address.parseComma(examples[0]);
        System.out.println(address);
        address.parseComma(examples[1]);
        System.out.println(address);
        address.parseAnySeparator(examples[2]);
        System.out.println(address);
        address.parseAnySeparator(examples[3]);
        System.out.println(address);
    }
}
