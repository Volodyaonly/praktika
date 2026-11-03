package ru.mirea.lab11.task03;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
    private String name;
    private Date birthDate;

    public Student(String name, Date birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public String birthDateInFormat(String format) {
        SimpleDateFormat formatter = new SimpleDateFormat(format);
        return formatter.format(birthDate);
    }

    @Override
    public String toString() {
        return name + ", дата рождения: " + birthDateInFormat("dd.MM.yyyy");
    }
}
