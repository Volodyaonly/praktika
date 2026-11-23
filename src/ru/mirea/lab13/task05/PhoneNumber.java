package ru.mirea.lab13.task05;

public class PhoneNumber {
    public static String format(String phone) {
        if (phone == null) return "Неверный номер";

        String country;
        String number;
        if (phone.matches("8\\d{10}")) {
            country = "+7";
            number = phone.substring(1);
        } else if (phone.matches("\\+\\d{11,}")) {
            country = phone.substring(0, phone.length() - 10);
            number = phone.substring(phone.length() - 10);
        } else {
            return "Неверный номер";
        }
        return country + number.substring(0, 3) + "-"
               + number.substring(3, 6) + "-" + number.substring(6);
    }
}
