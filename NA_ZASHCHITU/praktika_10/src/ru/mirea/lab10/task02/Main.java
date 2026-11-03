package ru.mirea.lab10.task02;

import ru.mirea.lab10.Student;
import ru.mirea.lab10.SortingStudentsByGPA;

public class Main {
    public static void main(String[] args) {
        Student[] students = {
            new Student("Иван", "Петров", "Информатика", 2, "КВБО-12-25", 3.8),
            new Student("Анна", "Иванова", "Информатика", 2, "КВБО-12-25", 5.0),
            new Student("Олег", "Сидоров", "Информатика", 2, "КВБО-12-25", 4.4)
        };
        SortingStudentsByGPA sorting = new SortingStudentsByGPA();
        sorting.setArray(students);
        System.out.println("Быстрая сортировка по баллам:");
        sorting.quicksort();
        sorting.outArray();
        System.out.println("Сортировка слиянием по баллам:");
        sorting.mergeSort();
        sorting.outArray();
        System.out.println("Сортировка по фамилии:");
        sorting.sortBySurname();
        sorting.outArray();
    }
}
