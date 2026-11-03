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
        String result = surname;
        if (name != null && !name.isEmpty()) result += " " + name.charAt(0) + ".";
        if (patronymic != null && !patronymic.isEmpty()) result += patronymic.charAt(0) + ".";
        return result;
    }
}
