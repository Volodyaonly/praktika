package ru.mirea.lab9.task01;

import ru.mirea.lab9.Student;

public class Main {
    public static void insertionSort(Student[] iDNumber) {
        for (int i = 1; i < iDNumber.length; i++) {
            Student current = iDNumber[i];
            int j = i - 1;
            while (j >= 0 && iDNumber[j].compareTo(current) > 0) {
                iDNumber[j + 1] = iDNumber[j];
                j--;
            }
            iDNumber[j + 1] = current;
        }
    }

    public static void main(String[] args) {
        Student[] iDNumber = {
            new Student(4, "Анна", 4.5),
            new Student(2, "Иван", 4.0),
            new Student(7, "Олег", 3.7)
        };
        insertionSort(iDNumber);
        for (Student student : iDNumber) System.out.println(student);
    }
}
