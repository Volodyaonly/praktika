package ru.mirea.lab10.task03;

import ru.mirea.lab10.Student;
import ru.mirea.lab10.SortingStudentsByGPA;

public class Main {
    public static void main(String[] args) {
        Student[] first = {
            new Student("Иван", "Петров", "ИТ", 2, "КВБО-12-25", 4.0),
            new Student("Мария", "Иванова", "ИТ", 2, "КВБО-12-25", 5.0)
        };
        Student[] second = {
            new Student("Анна", "Сидорова", "ИТ", 2, "КВБО-12-25", 4.8),
            new Student("Павел", "Смирнов", "ИТ", 2, "КВБО-12-25", 3.9)
        };
        Student[] together = new Student[first.length + second.length];
        for (int i = 0; i < first.length; i++) together[i] = first[i];
        for (int i = 0; i < second.length; i++) together[first.length + i] = second[i];

        SortingStudentsByGPA sorting = new SortingStudentsByGPA();
        sorting.setArray(together);
        sorting.mergeSort();
        sorting.outArray();
    }
}
