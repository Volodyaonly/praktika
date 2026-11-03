package ru.mirea.lab11.task03;

import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Calendar birthday = Calendar.getInstance();
        birthday.set(2007, Calendar.JANUARY, 15);
        Student student = new Student("Иван Петров", birthday.getTime());
        System.out.println(student);
        System.out.println("Короткий формат: " + student.birthDateInFormat("dd.MM.yyyy"));
        System.out.println("Средний формат: " + student.birthDateInFormat("dd MMM yyyy"));
        System.out.println("Полный формат: " + student.birthDateInFormat("EEEE, dd MMMM yyyy"));
    }
}
