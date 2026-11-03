package ru.mirea.lab9;

import java.util.Comparator;

// Сравниваем студентов по итоговому баллу: большой балл первым.
public class SortingStudentsByGPA implements Comparator<Student> {
    @Override
    public int compare(Student first, Student second) {
        if (first.getGpa() > second.getGpa()) return -1;
        if (first.getGpa() < second.getGpa()) return 1;
        return 0;
    }

    public void quickSort(Student[] students, int left, int right) {
        int i = left;
        int j = right;
        Student middle = students[(left + right) / 2];
        while (i <= j) {
            while (compare(students[i], middle) < 0) i++;
            while (compare(students[j], middle) > 0) j--;
            if (i <= j) {
                Student temp = students[i];
                students[i] = students[j];
                students[j] = temp;
                i++;
                j--;
            }
        }
        if (left < j) quickSort(students, left, j);
        if (i < right) quickSort(students, i, right);
    }
}
