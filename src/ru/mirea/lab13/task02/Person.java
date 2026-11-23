package ru.mirea.lab13.task02;

public class Person {
    private String surname;
    private String name;
    private String patronymic;

    public Person(String surname, String name, String patronymic) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
    }

    public String shortName() {
        StringBuilder result = new StringBuilder(surname == null ? "" : surname.trim());
        boolean hasFirstName = name != null && !name.isBlank();
        if (hasFirstName) {
            if (result.length() > 0) result.append(' ');
            result.append(name.trim().charAt(0)).append('.');
        }
        if (patronymic != null && !patronymic.isBlank()) {
            if (!hasFirstName && result.length() > 0) result.append(' ');
            result.append(patronymic.trim().charAt(0)).append('.');
        }
        return result.toString();
    }
}
