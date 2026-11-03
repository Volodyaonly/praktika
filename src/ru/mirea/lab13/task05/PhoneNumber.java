package ru.mirea.lab13.task05;

public class PhoneNumber {
    public static String format(String phone) {
        String country;
        String number;
        if (phone.length() == 11 && phone.charAt(0) == '8') {
            country = "+7";
            number = phone.substring(1);
        } else if (phone.startsWith("+") && phone.length() > 11) {
            country = phone.substring(0, phone.length() - 10);
            number = phone.substring(phone.length() - 10);
        } else {
            return "Неверный номер";
        }
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) < '0' || number.charAt(i) > '9') return "Неверный номер";
        }
        return country + number.substring(0, 3) + "-"
               + number.substring(3, 6) + "-" + number.substring(6);
    }
}
