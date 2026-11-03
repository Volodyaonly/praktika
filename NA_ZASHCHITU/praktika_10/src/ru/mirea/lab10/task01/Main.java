package ru.mirea.lab10.task01;

import ru.mirea.lab10.Student;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Иван", "Петров", "Информатика", 2, "КВБО-12-25", 4.6);
        System.out.println(student);
        student.setCourse(3);
        System.out.println("Новый курс: " + student.getCourse());
    }
}
