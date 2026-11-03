package ru.mirea.lab9.task02;

import ru.mirea.lab9.Student;
import ru.mirea.lab9.SortingStudentsByGPA;

public class Main {
    public static void main(String[] args) {
        Student[] students = {
            new Student(1, "Иван", 3.8),
            new Student(2, "Мария", 5.0),
            new Student(3, "Олег", 4.2)
        };
        SortingStudentsByGPA sort = new SortingStudentsByGPA();
        sort.quickSort(students, 0, students.length - 1);
        for (Student student : students) System.out.println(student);
    }
}
